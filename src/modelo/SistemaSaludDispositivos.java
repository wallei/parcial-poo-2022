package modelo;

import java.util.ArrayList;
import java.util.List;

public class SistemaSaludDispositivos {
	private List<Empresa> lstEmpresas;
	private List<Dispositivo> lstDispositivos;

	public SistemaSaludDispositivos() {
		lstEmpresas = new ArrayList<Empresa>();
		lstDispositivos = new ArrayList<Dispositivo>();
	}

	public List<Empresa> getLstEmpresas() {
		return lstEmpresas;
	}


	public List<Dispositivo> getLstDispositivos() {
		return lstDispositivos;
	}


	public boolean agregarEmpresa(String nombre) {
		int id = 1;

		if (!lstEmpresas.isEmpty())
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

	public boolean agregarDispositivo(String nombre, String codigo, Empresa empresa) throws Exception {
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
