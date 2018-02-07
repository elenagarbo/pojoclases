package com.curso.practica;

public class Operaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Mayorista ma=new Mayorista();
		
		ma.setNombreEmpresa("Mariscos Recio");
		System.out.println("La empresa " + ma.getNombreEmpresa()+ " compra " + ma.comprar() + " ,vende " + ma.vender() );
		
		ma.setCif("B45624123");
		
		System.out.println("Cobra " + ma.cobrar());
		System.out.println("Paga " + ma.pagar());
		
		Minorista mi=new Minorista();
		
		mi.setNombre("Pastelería");
		System.out.println("El nombre es: " + mi.getNombre());
		
		mi.setNifEmpresa("5600000CD");
		System.out.println("El NIF de la empresa es: " + mi.getNifEmpresa());
		
		System.out.println("Compra " + mi.comprar());
		System.out.println("Vende " + mi.vender());
		System.out.println("Cobra " + mi.cobrar());
		System.out.println("Paga " + mi.pagar());
		System.out.println("Con el iva es " + mi.ivaNormal(50));
	}

}
