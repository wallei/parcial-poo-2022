package modelo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class Dispositivo {

	private int id;
	private String nombre;
	private String codigo;
	private List<Metrica> lstMetricas;
	private Empresa empresa;

	public Dispositivo(int id, String nombre, String codigo, List<Metrica> lstMetricas, Empresa empresa) {
		this.id = id;
		this.nombre = nombre;
		this.codigo = codigo;
		this.lstMetricas = lstMetricas;
		this.empresa = empresa;
	}

	public Dispositivo(int id, String nombre, String codigo, Empresa empresa) {
		this.id = id;
		this.nombre = nombre;
		this.codigo = codigo;
		this.empresa = empresa;
	}

	@Override
	public String toString() {
		return "Dispositivo [id=" + id + ", nombre=" + nombre + ", codigo=" + codigo + ", lstMetricas=" + lstMetricas
				+ ", empresa=" + empresa + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public List<Metrica> getLstMetricas() {
		return lstMetricas;
	}

	public void setLstMetricas(List<Metrica> lstMetricas) {
		this.lstMetricas = lstMetricas;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	/*
	 * 
	 * public boolean validarCodigo(String codigo) { boolean ret = false; int suma =
	 * 0; if (codigo.length() == 5) { if (codigo.charAt(0) == 'A' ||
	 * codigo.charAt(0) == 'B') { if (codigo.charAt(0) == 'A') { for (int i = 1; i <
	 * codigo.length(); i++) { suma += Character.getNumericValue(codigo.charAt(i));
	 * } if (suma % 2 == 0) { ret = true; } } else { for (int i = 1; i <
	 * codigo.length(); i++) { suma += Character.getNumericValue(codigo.charAt(i));
	 * } if (suma % 2 != 0) { ret = true; } } } } return ret; }
	 * 
	 * 
	 */

	public boolean agregarMetrica(int valor, LocalDate fecha, LocalTime hora) {

		return lstMetricas.add(new Metrica(valor, fecha, hora));

	}

}
