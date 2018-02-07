package com.curso.practica;

public abstract class Impuestos {
	
	public float ivaReducido(float precio) {
		return precio + precio * 0.17f;
	}
	
	public float ivaNormal(float precio) {
		return precio + precio * 0.21f;
	}
}
