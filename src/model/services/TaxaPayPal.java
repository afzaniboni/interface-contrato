package model.services;

public class TaxaPayPal implements Taxas {

	public TaxaPayPal() {
	}
	
	@Override
	public Double calculoTaxas(Double valorParcela) {

		return valorParcela * 2 / 100;
	}

	@Override
	public Double calculoJuros(int numeroParcela, Double valorParcela) {

		return valorParcela * 1 / 100 * numeroParcela;
	}

}
