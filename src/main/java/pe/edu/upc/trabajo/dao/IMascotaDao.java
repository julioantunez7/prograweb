package pe.edu.upc.trabajo.dao;

import java.util.List;

import pe.edu.upc.trabajo.models.entities.Mascota;

public interface IMascotaDao {
	
	public void insert(Mascota masc);
	
	public List<Mascota> list();
	
	public void delete(int idMascota);
}
