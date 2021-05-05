package pe.edu.upc.trabajo.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.trabajo.dao.IVeterinariaDao;
import pe.edu.upc.trabajo.models.entities.Veterinaria;

public class VeterinariaDaoImpl implements IVeterinariaDao{
	@PersistenceContext(unitName="trabajoPU")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insert(Veterinaria vet) {
		try {
			em.persist(vet);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Error al insertar Veterinaria en el dao");
		}
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Veterinaria> list(){
		List<Veterinaria> lista = new ArrayList<Veterinaria>();
		try {
			Query q = em.createQuery("from Veterinaria v");
			lista=(List<Veterinaria>)q.getResultList();
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return lista;
	}
	
	@Transactional
	@Override
	public void delete(int idVeterinaria) {
		
		Veterinaria vet=new Veterinaria();
		try {
			vet=em.getReference(Veterinaria.class, idVeterinaria);
			em.remove(vet);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}


	@SuppressWarnings("unchecked")
	@Override
	public List<Veterinaria> findByName(Veterinaria vet) {
		List<Veterinaria> lista = new ArrayList<Veterinaria>();
		try {
			Query q = em.createQuery("from Veterinaria v where v.nombreVeterinaria like ?1");
			q.setParameter(1, "%" + vet.getNombreVeterinaria() + "%");
			lista=(List<Veterinaria>)q.getResultList();
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return lista;
	}
	
}
