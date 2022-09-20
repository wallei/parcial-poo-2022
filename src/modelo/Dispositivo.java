package modelo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Dispositivo {

	private int id;
	private String nombre;
	private String codigo;
	private List<Metrica> lstMetricas;
	private Empresa empresa;



	public Dispositivo(int id, String nombre, String codigo,Empresa empresa) throws Exception {
		this.id = id;
		this.nombre = nombre;
		setCodigo(codigo);
		this.lstMetricas = new ArrayList<Metrica>();
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

	public void setCodigo(String codigo) throws Exception {
		validarCodigo(codigo);
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
	
	/*public List<Metrica> traerMetricas(LocalDate desde, LocalDate hasta) {

		List<Metrica> lista = new ArrayList<Metrica>();

		for (int i = 0; i < lstMetricas.size(); i++) {
			if (lstMetricas.get(i).getFecha().contains(desde) && lstMetricas.get(i).getFecha().contains(hasta)) {
				lista.add(lstMetricas.get(i));
			}
		}

		return lista;

	}*/
	
	public boolean validarCodigo(String codigo) throws Exception {
		if (codigo.length() != 5)
			throw new Exception("Error: codigo con cantidad incorrecta de caracteres");

		char[] codAux = codigo.toCharArray();

		if (codAux[0] != 'A' && codAux[0] != 'B')
			throw new Exception("Error: el codigo debe iniciar con A o B");

		boolean cuatroNumeros = true;
		int i = 1;
		Integer suma = 0;

		while (i < codigo.length() && cuatroNumeros == true) {
			if (!Character.isDigit(codAux[i])) {
				cuatroNumeros = false;
			} else {
				suma += Integer.valueOf(Character.toString(codAux[i]));
			}
			i++;
		}

		if (!cuatroNumeros)
			throw new Exception("Error: codigo no cumple con el formato A1111");

		if (codAux[0] == 'A') {

			if (suma.intValue() % 2 != 0)
				throw new Exception("Error: codigo invalido");

		} else {

			if (suma.intValue() % 2 == 0)
				throw new Exception("Error: codigo invalido");

		}

		return true;
	}
	

}
