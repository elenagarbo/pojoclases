package com.curso.basico;

public class  Persona {
	
	//atributos
	private String nombre; //solo estan declaradas no inicializadas
	private String ciudad;
	private float facturacion;
	
	//persona(); es un constructuor para guardar en memoria 
	
	public String getNombre() {
		return nombre.toUpperCase();
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public float getFacturacion() {
		return facturacion;
	}
	
	//sobrecargar el metodo
	public String getFacturacion(String moneda) {
		return facturacion+ moneda;
	}
	public void setFacturacion(float facturacion) {
		this.facturacion = facturacion;
	}
	
	

}
