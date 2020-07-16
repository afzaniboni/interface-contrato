package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Parcela {
	private Date dataVcto;
	private Double valorParcela;
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


	public Parcela() {
	}

	public Parcela(Date dataVcto, Double valorParcela) {
		this.dataVcto = dataVcto;
		this.valorParcela = valorParcela;
	}

	public Date getDataVcto() {
		return dataVcto;
	}

	public void setDataVcto(Date dataVcto) {
		this.dataVcto = dataVcto;
	}

	public Double getValorParcela() {
		return valorParcela;
	}

	@Override
	public String toString() {
		return "Parcela: " + sdf.format(dataVcto) + ", " + String.format("%.2f", valorParcela);
	}
	
	

}
