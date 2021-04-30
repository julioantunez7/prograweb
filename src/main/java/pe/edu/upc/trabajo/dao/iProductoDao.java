dao

package pe.edu.upc.trabajo.dao;

import java.util.List;

import pe.edu.upc.trabajo.models.entities.Producto;

public interface iProductoDao {
	
public void insert (Producto pro);
	
	public List<Producto>list();
	
	public void delete(int idProducto);
	

}
