package com.curso.basico;

public class Metro implements ITransporte {

	@Override
	public String consultar() {
		// TODO Auto-generated method stub
		return "Necesitas tarjeta transporte";
	}

	@Override
	public String horario() {
		// TODO Auto-generated method stub
		return "De 6:00 a 13:30";
	}
	
	@Override
	public float tarifa() {
		// TODO Auto-generated method stub
		return 50.5f;
	}

}
