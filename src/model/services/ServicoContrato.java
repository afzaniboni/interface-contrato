package model.services;

import java.util.Calendar;

import model.entities.Contrato;
import model.entities.Parcela;

public class ServicoContrato {
	private Taxas taxas;
	
	public ServicoContrato() {
	}
	
	public ServicoContrato(Taxas taxas) {
		this.taxas = taxas;
	}

	public void calcularValorParcelas(Contrato contrato) {
		Calendar calendar = Calendar.getInstance();

		Double valorParcela = contrato.getValorTotal() / contrato.getQtdParcela();
		Double valorTotalParcela = 0d;
				
		for (int i=1; i <= contrato.getQtdParcela(); i++) {
			
			calendar.setTime(contrato.getData());
			calendar.add(Calendar.MONTH, i);
			
			valorTotalParcela = valorParcela + taxas.calculoJuros(i, valorParcela);
			valorTotalParcela += taxas.calculoTaxas(valorParcela);
			
			contrato.adicionaParcela(new Parcela(calendar.getTime(), valorTotalParcela));
		}
	}

}
