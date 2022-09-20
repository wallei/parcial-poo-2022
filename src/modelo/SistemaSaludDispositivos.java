package modelo;

import java.util.ArrayList;
import java.util.List;

public class SistemaSaludDispositivos {
	private List<Empresa> lstEmpresas = new ArrayList<Empresa>();
	private List<Dispositivo> lstDispositivos = new ArrayList<Dispositivo>();

	public SistemaSaludDispositivos() {
	}

	public List<Empresa> getLstEmpresas() {
		return lstEmpresas;
	}

	public void setLstEmpresas(List<Empresa> lstEmpresas) {
		this.lstEmpresas = lstEmpresas;
	}

	public List<Dispositivo> getLstDispositivos() {
		return lstDispositivos;
	}

	public void setLstDispositivos(List<Dispositivo> lstDispositivos) {
		this.lstDispositivos = lstDispositivos;
	}

	public boolean agregarEmpresa(String nombre) {
		int id = 1;

		if (lstEmpresas.size() > 0)
			id = lstEmpresas.get(lstEmpresas.size() - 1).getId() + 1;

		return lstEmpresas.add(new Empresa(id, nombre));
	}

	public Empresa traerEmpresa(String nombre) {
		Empresa objeto = null;
		int i = 0;

		while (i < lstEmpresas.size() && objeto == null) {
			if (lstEmpresas.get(i).getNombre().equals(nombre)) {
				objeto = lstEmpresas.get(i);
			}
			i++;
		}

		return objeto;
	}

	public boolean agregarDispositivo(String nombre, String codigo, Empresa empresa) {
		int id = 1;

		if (lstDispositivos.size() > 0)
			id = lstDispositivos.get(lstDispositivos.size() - 1).getId() + 1;

		return lstDispositivos.add(new Dispositivo(id, nombre, codigo, empresa));
	}

	public Dispositivo traerDispositivo(String codigo) {
		Dispositivo objeto = null;
		int i = 0;

		while (i < lstDispositivos.size() && objeto == null) {
			if (lstDispositivos.get(i).getCodigo().equals(codigo)) {
				objeto = lstDispositivos.get(i);
			}
			i++;
		}

		return objeto;

	}
	

	
	

}
