package pe.edu.upc.trabajo.service;

import java.util.List;

import pe.edu.upc.trabajo.models.entities.Veterinaria;

public interface IVeterinariaService {
	public void insert(Veterinaria vet);
	
	List<Veterinaria>list();
	
	public void delete(int idVeterinaria);
}
