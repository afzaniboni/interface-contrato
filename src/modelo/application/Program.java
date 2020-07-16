package modelo.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contrato;
import model.entities.Parcela;
import model.services.ServicoContrato;
import model.services.TaxaPayPal;

public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		Contrato contrato = new Contrato();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);

		System.out.print("Informe o número do contrato: ");
		contrato.setNumeroContrato(sc.nextLong());
		System.out.print("Informe a data do contrato: ");
		contrato.setData(sdf.parse(sc.next()));
		System.out.print("Informe o valor do contrato: ");
		contrato.setValorTotal(sc.nextDouble());
		System.out.print("Informe o número de parcelas: ");
		contrato.setQtdParcela(sc.nextLong());

		ServicoContrato servContrato = new ServicoContrato(new TaxaPayPal());
		servContrato.calcularValorParcelas(contrato);

		System.out.println("Parcelas geradas");
		System.out.println("----------------");
		for (Parcela parcela : contrato.getParcelas()) {

			System.out.println(parcela);

		}

		sc.close();

	}

}
