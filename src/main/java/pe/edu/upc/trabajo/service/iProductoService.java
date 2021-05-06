package pe.edu.upc.trabajo.service;

import java.util.List;

import pe.edu.upc.trabajo.models.entities.Producto;

public interface iProductoService {
	
	public void insert(Producto pro);

	public List<Producto> list();

	public void delete(int idProducto);
	
	public List<Producto> findByName(Producto reg);
	

}
