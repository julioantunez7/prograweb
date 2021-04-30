package pe.edu.upc.trabajo.dao;

import java.util.List;

import pe.edu.upc.trabajo.models.entities.Cliente;

public interface IClienteDao {
	
	public void insert(Cliente cli);
	
	public List<Cliente>list();
	
	public void delete(int idCliente);
}

