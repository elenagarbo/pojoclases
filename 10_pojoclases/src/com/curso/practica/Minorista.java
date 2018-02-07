package com.curso.practica;

public class Minorista extends Impuestos implements IComercio {
	
	private String nombre;
	private String nifEmpresa;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNifEmpresa() {
		return nifEmpresa;
	}

	public void setNifEmpresa(String nifEmpresa) {
		this.nifEmpresa = nifEmpresa;
	}


	@Override
	public String comprar() {
		// TODO Auto-generated method stub
		return "Harina, mantequilla, azucar";
	}

	@Override
	public String vender() {
		// TODO Auto-generated method stub
		return "Cajas de pasteles";
	}

	@Override
	public String cobrar() {
		// TODO Auto-generated method stub
		return "20€ la caja";
	}

	@Override
	public String pagar() {
		// TODO Auto-generated method stub
		return "en efecitvo";
	}

}
