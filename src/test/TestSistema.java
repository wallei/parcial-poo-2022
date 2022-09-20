package test;

import java.time.LocalDate;
import java.time.LocalTime;

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
		
		LocalDate date18 = LocalDate.of(2022, 9, 18);
		LocalDate date19 = LocalDate.of(2022, 9, 19);
		LocalDate date23 = LocalDate.of(2022, 9, 20);
		LocalDate date20 = LocalDate.of(2022, 9, 21);
		LocalDate date18a = LocalDate.of(2022, 9, 22);
		
		LocalTime time1 = LocalTime.of(10, 00);
		
		
		System.out.println(sistema.traerDispositivo("A2020").agregarMetrica(18, date18, time1));
		
		
		
		
	}

}
