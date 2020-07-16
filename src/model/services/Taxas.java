package model.services;

public interface Taxas {
	public Double calculoTaxas(Double valorParcela);
	
	public Double calculoJuros(int numeroParcela, Double valorParcela);
}
