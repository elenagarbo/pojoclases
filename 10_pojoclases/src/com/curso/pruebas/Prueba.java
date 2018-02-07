package com.curso.pruebas;

//import com.curso.basico.*;
import com.curso.basico.Metro;
import com.curso.basico.Persona; // de la otra clase creada

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Banco de pruebas");
		
		Persona p =new Persona (); //creas istancia
		p.setNombre("Juan"); //con set guardas el nombre variable
		System.out.println("El nombre es " + p.getNombre());
		
		p.setCiudad("Madrid");
		System.out.println("La ciudad es "+ p.getCiudad());
		
		p.setFacturacion(1000f);
		System.out.println("Su facturacion es "+ p.getFacturacion());
		
		Metro m=new Metro();
		System.out.println(m.consultar());
		System.out.println("Horario: " +m.horario());
		System.out.println("Tarifa: " + m.tarifa()+ " €");


	}

}
