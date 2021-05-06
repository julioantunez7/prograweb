package pe.edu.upc.trabajo.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.trabajo.dao.iProductoDao;
import pe.edu.upc.trabajo.models.entities.Producto;
import pe.edu.upc.trabajo.service.iProductoService;


@Named
@RequestScoped
public class ProductoServiceImpl implements iProductoService {
	
	
	
	@Inject
	private iProductoDao pDao;

	@Override
	public void insert(Producto pro) {
		
		
		try {
			pDao.insert(pro);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
						
	}

	@Override
	public List<Producto> list() {
		
		
		
		return pDao.list();
	}

	@Override
	public void delete(int idProducto) {
		
		pDao.delete(idProducto);
		
		
	}
	
	@Override
	public List<Producto> findByName(Producto reg){
		return pDao.findByName(reg);
	}
	
	

}