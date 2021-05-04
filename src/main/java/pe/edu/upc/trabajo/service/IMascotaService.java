package pe.edu.upc.trabajo.service;

import java.util.List;

import pe.edu.upc.trabajo.models.entities.Mascota;

public interface IMascotaService {
	
	public void insert(Mascota masc);
	
	public List<Mascota>list();
	
	public void delete(int idMascota);
}
