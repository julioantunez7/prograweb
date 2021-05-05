package pe.edu.upc.trabajo.dao;

import java.util.List;

import pe.edu.upc.trabajo.models.entities.Veterinaria;

public interface IVeterinariaDao {
	public void insert(Veterinaria vet);
	
	public List<Veterinaria>list();
	
	public void delete(int idVeterinaria);
	
	public List<Veterinaria> findByName(Veterinaria vet);
}
