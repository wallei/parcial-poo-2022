package modelo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Dispositivo {

	private int id;
	private String nombre;
	private String codigo;
	private List<Metrica> lstMetricas= new ArrayList<Metrica>();;
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

	public boolean agregarMetrica(int valor, LocalDate fecha, LocalTime hora) {

		return lstMetricas.add(new Metrica(valor, fecha, hora));

	}
	
	// Traer Metrica.
	
	public Metrica traerMetrica(LocalDate fecha, LocalTime hora) {
		Metrica objeto = null;
		int i = 0;

		while (i < lstMetricas.size() && objeto == null) {
			if (lstMetricas.get(i).getFecha().equals(fecha) &&
					lstMetricas.get(i).getHora().equals(hora)
					) {
				objeto = lstMetricas.get(i);
			}
			i++;
		}

		return objeto;
	}
	
	
	// Traer List<Metrica>
	

}
