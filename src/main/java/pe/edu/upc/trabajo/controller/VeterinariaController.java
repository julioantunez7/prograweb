package pe.edu.upc.trabajo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.trabajo.models.entities.Veterinaria;
import pe.edu.upc.trabajo.service.IVeterinariaService;

@Named
@RequestScoped
public class VeterinariaController {
	@Inject

	// variables

	private IVeterinariaService vService;
	private Veterinaria veterinaria;
	List<Veterinaria> listaVeterinarias;
	
	// constructores

	@PostConstruct
	public void init() {
		this.veterinaria = new Veterinaria();
		this.listaVeterinarias = new ArrayList<Veterinaria>();
		this.list();
	}

	// métodos especializados

	public String newCliente() {
		this.setVeterinaria(new Veterinaria());
		return "veterinaria.xhtml";
	}

	public void Insert() {
		try {
			vService.insert(veterinaria);

		} catch (Exception e) {
			System.out.println("Error al insertar en el controller de veterinaria");
		}
	}

	public void list() {
		try {
			listaVeterinarias = vService.list();
		} catch (Exception e) {
			System.out.println("Error al listar en el controller de veterinaria");
		}
	}

	public void delete(Veterinaria vet) {
		try {
			vService.delete(vet.getIdVeterinaria());
		} catch (Exception e) {
			System.out.println("Error al eliminar en el controller de veterinaria");
		}
	}

	public Veterinaria getVeterinaria() {
		return veterinaria;
	}

	public void setVeterinaria(Veterinaria veterinaria) {
		this.veterinaria = veterinaria;
	}

	public List<Veterinaria> getListaVeterinarias() {
		return listaVeterinarias;
	}

	public void setListaVeterinarias(List<Veterinaria> listaVeterinarias) {
		this.listaVeterinarias = listaVeterinarias;
	}

}
