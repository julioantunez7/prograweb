package pe.edu.upc.trabajo.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import pe.edu.upc.trabajo.dao.iProductoDao;
import pe.edu.upc.trabajo.models.entities.Producto;

public class ProductoDaoImpl implements iProductoDao {

	@PersistenceContext(unitName = "trabajoPU")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Producto pro) {

		try {
			em.persist(pro);

		} catch (Exception e) {
			System.out.println(e.getMessage());// sysout
			System.out.println("Error al insertar producto en el dao");

		}

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Producto> list() {
		List<Producto> lista = new ArrayList<Producto>();

		try {
			Query q = em.createQuery("from Producto p");
			lista = (List<Producto>) q.getResultList();

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}

		return lista;
	}

	@Transactional
	@Override
	public void delete(int idProducto) {

		Producto pr = new Producto();

		try {
			pr = em.getReference(Producto.class, idProducto);
			em.remove(pr);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Producto> findByName(Producto reg){
		List<Producto> lista = new ArrayList<Producto>();

		try {
			Query q = em.createQuery("from Producto p where p.nombreProducto like ?1");
			q.setParameter(1,"%"+ reg.getNombreProducto()+"%"); 
			lista = (List<Producto>) q.getResultList();

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}

		return lista;
	}
}
