package pe.edu.upc.trabajo.service;

import java.util.List;

import pe.edu.upc.trabajo.models.entities.Cliente;

public interface IClienteService {
	
	public void insert(Cliente cli);
	
	List<Cliente>list();
	
	public void delete(int idCliente);
	
	public List<Cliente> findByName(Cliente cli);
}

