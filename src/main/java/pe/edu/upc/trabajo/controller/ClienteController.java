package pe.edu.upc.trabajo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.trabajo.models.entities.Cliente;
import pe.edu.upc.trabajo.service.IClienteService;

@Named
@RequestScoped
public class ClienteController {
	@Inject
	
	private IClienteService cService;
	
	//variables
	
	private Cliente cliente;
	private List<Cliente> listaClientes;

	
	//constructores
	
	@PostConstruct
	public void init() {
		this.cliente=new Cliente();
		this.listaClientes=new ArrayList<Cliente>();
		this.list();
	}
	
	//métodos especializados
	
	public String newCliente() {
		this.setCliente(new Cliente());
		return "cliente.xhtml";
	}
	
	public void Insert() {
		try {
			cService.insert(cliente);
			
		} catch (Exception e) {
			System.out.println("Error al insertar en el controller de cliente");
		}
	}
	
	public void list() {
		try {
			listaClientes=cService.list();
		} catch (Exception e) {
			System.out.println("Error al listar en el controller de cliente");
		}
	}
	
	public void delete(Cliente cl) {
		try {
			cService.delete(cl.getIdCliente());
			this.list();
		} catch (Exception e) {
			System.out.println("Error al eliminar en el controller de cliente");
		}
	}
	
	public void findByName() {
		try {
			if(cliente.getNombre().isEmpty()) {
				this.list();
			
		    }else {
		    	listaClientes=this.cService.findByName(this.getCliente());
		    }
			
		}	
			catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void clean() {
		this.init();
	}
	
	// get y set
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Cliente> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(List<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}

	
	
}
