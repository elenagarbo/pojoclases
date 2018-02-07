package com.curso.practica;

public class Mayorista extends Impuestos implements IComercio {
	
	private String nombreEmpresa;
	private String cif;
	
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	

	@Override
	public String comprar() {
		// TODO Auto-generated method stub
		return "Gambas, bogavantes, percebes";
	}

	@Override
	public String vender() {
		// TODO Auto-generated method stub
		return "Cajas con marisco mezclado";
	}

	@Override
	public String cobrar() {
		// TODO Auto-generated method stub
		return "10€ la caja";
	}

	@Override
	public String pagar() {
		// TODO Auto-generated method stub
		return "Con tarjeta de crédito";
	}

}
