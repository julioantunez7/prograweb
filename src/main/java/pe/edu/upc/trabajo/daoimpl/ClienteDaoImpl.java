package pe.edu.upc.trabajo.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.trabajo.dao.IClienteDao;
import pe.edu.upc.trabajo.models.entities.Cliente;

public class ClienteDaoImpl implements IClienteDao{
	
	@PersistenceContext(unitName="trabajoPU")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insert(Cliente cli) {
		try {
			em.persist(cli);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Error al insertar Cliente en el dao");
		}
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Cliente> list(){
		List<Cliente> lista=new ArrayList<Cliente>();
		try {
			Query q = em.createQuery("from Cliente c");
			lista=(List<Cliente>)q.getResultList();
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return lista;
	}
	
	@Transactional
	@Override
	public void delete(int idCliente) {
		
		Cliente cl=new Cliente();
		try {
			cl=em.getReference(Cliente.class, idCliente);
			em.remove(cl);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}
