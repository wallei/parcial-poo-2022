package test;

import modelo.SistemaSaludDispositivos;

public class TestSistema {

	public static void main(String[] args) {
		SistemaSaludDispositivos sistema = new SistemaSaludDispositivos();
		
		System.out.println("1) Agregar empresas e imprimir lista");
		sistema.agregarEmpresa("Empresa 1");
		sistema.agregarEmpresa("Empresa 2");
		System.out.println("Lista Empresas: ");
		System.out.println(sistema.getLstEmpresas());
		System.out.println("------------------------------------------------------------");
		System.out.println("2) Traer una empresa buscando por el nombre Empresa 2");
		System.out.println(sistema.traerEmpresa("Empresa 2"));
		System.out.println("------------------------------------------------------------");
		
	
		sistema.agregarDispositivo("Sensor Humeda", "A2020", sistema.traerEmpresa("Empresa 1"));		
		//System.out.println(sistema.getLstDispositivos());*/
		
		System.out.println("5) Traer el dispositivo con nombre Sensor Calor");
		System.out.println(sistema.traerDispositivo("A2020"));
		
		
		
		
		
	}

}
