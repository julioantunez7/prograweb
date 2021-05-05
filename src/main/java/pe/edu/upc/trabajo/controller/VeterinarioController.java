package pe.edu.upc.trabajo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.trabajo.models.entities.Veterinaria;
import pe.edu.upc.trabajo.models.entities.Veterinario;
import pe.edu.upc.trabajo.service.IVeterinariaService;
import pe.edu.upc.trabajo.service.IVeterinarioService;

@Named
@RequestScoped
public class VeterinarioController {

	@Inject
	private IVeterinarioService vService;
	@Inject
	private IVeterinariaService vaService;

	// variables

	private Veterinario veterinario;
	List<Veterinario> listaveterinarios;
	List<Veterinaria> listaveterinarias;

	public void init() {
		this.veterinario = new Veterinario();
		this.listaveterinarios = new ArrayList<Veterinario>();
		this.listaveterinarias = new ArrayList<Veterinaria>();
		this.listVeterinario();
		this.listVeterinaria();
	}

	// métodos específicos
	@PostConstruct
	public String newVeterinario() {
		this.setVeterinario(new Veterinario());
		return "veterinario.xhtml";
	}

	public void Insert() {
		try {
			vService.insert(veterinario);
		} catch (Exception e) {
			System.out.println("Error al insertar en el controller de veterinario");
		}
	}

	public void listVeterinario() {
		try {
			listaveterinarios = vService.list();
		} catch (Exception e) {
			System.out.println("Error al listar en el controller de veterinario");
		}
	}

	public void listVeterinaria() {
		try {
			listaveterinarias = vaService.list();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void delete(Veterinario ve) {
		try {
			vService.delete(ve.getId());
			this.listVeterinario();
		} catch (Exception e) {
			System.out.println("Error al eliminar en el controller de veterinario");
		}
	}

	public void findByName() {
		try {
			if (veterinario.getNombre().isEmpty()) {
				this.listVeterinario();

			} else {
				listaveterinarios = this.vService.findByName(this.getVeterinario());
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void clean() {
		this.init();
	}

	// get y set

	public Veterinario getVeterinario() {
		return veterinario;
	}

	public void setVeterinario(Veterinario veterinario) {
		this.veterinario = veterinario;
	}

	public List<Veterinario> getListaveterinarios() {
		return listaveterinarios;
	}

	public void setListaveterinarios(List<Veterinario> listaveterinarios) {
		this.listaveterinarios = listaveterinarios;
	}

}
