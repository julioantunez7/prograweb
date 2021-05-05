package pe.edu.upc.trabajo.dao;

import java.util.List;

import pe.edu.upc.trabajo.models.entities.Veterinario;

public interface IVeterinarioDao {
	public void insert(Veterinario vet);
	
	public List<Veterinario>list();
	
	public void delete(int idVeterinario);
	
	public List<Veterinario> findByName(Veterinario vet);
}
