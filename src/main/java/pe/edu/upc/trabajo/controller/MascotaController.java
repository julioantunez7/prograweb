package pe.edu.upc.trabajo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.trabajo.models.entities.Cliente;
import pe.edu.upc.trabajo.models.entities.Mascota;
import pe.edu.upc.trabajo.service.IClienteService;
import pe.edu.upc.trabajo.service.IMascotaService;

@Named
@RequestScoped
public class MascotaController {

	@Inject
	private IMascotaService mService;
	
	@Inject
	private IClienteService cService;
	
	//
	private Mascota mascota;
	
	List<Mascota> listaMascotas;
	
	List<Cliente> listaClientes;
	//
	@PostConstruct
	public void init() {
		this.mascota=new Mascota();
		this.listaMascotas=new ArrayList<Mascota>();
		this.listaClientes=new ArrayList<Cliente>();
		this.listMascota();
		this.listCliente();
	}
	
	public String newMascota() {
		this.setMascota(new Mascota());
		return "mascota.xhtml";
	}
	
	public void Insert() {
		try {

			mService.insert(mascota);

		} catch (Exception e) {
			System.out.println("Error al insertar en el controller de mascota");
		}
	}
	
	public void listMascota() {
		try {
			listaMascotas=mService.list();
		} catch (Exception e) {
			System.out.println("Error al listar en el controller de mascota");
		}
	}
	
	public void listCliente() {
		try {
			listaClientes=cService.list();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void delete(Mascota masc) {
		try {
			mService.delete(masc.getIdMascota());
			this.listMascota();
		} catch (Exception e) {
			System.out.println("Error al eliminar en el controller de mascota");
		}
	}

	//get y set
	

	public Mascota getMascota() {
		return mascota;
	}

	public void setMascota(Mascota mascota) {
		this.mascota = mascota;
	}

	public List<Mascota> getListaMascotas() {
		return listaMascotas;
	}

	public void setListaMascotas(List<Mascota> listaMascotas) {
		this.listaMascotas = listaMascotas;
	}

	public List<Cliente> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(List<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}
	
	
}
