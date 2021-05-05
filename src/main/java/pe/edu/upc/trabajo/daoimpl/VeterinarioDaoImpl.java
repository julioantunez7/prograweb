package pe.edu.upc.trabajo.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.trabajo.dao.IVeterinarioDao;
import pe.edu.upc.trabajo.models.entities.Veterinario;

public class VeterinarioDaoImpl implements IVeterinarioDao {

	@PersistenceContext(unitName = "trabajoPU")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Veterinario vet) {
		try {
			em.persist(vet);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Veterinario> list() {
		List<Veterinario> lista = new ArrayList<Veterinario>();
		try {
			Query q = em.createQuery("from Veterinario v");
			lista=(List<Veterinario>)q.getResultList();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return lista;
	}

	@Transactional
	@Override
	public void delete(int idVeterinario) {
		Veterinario vet = new Veterinario();
		try {
			vet=em.getReference(Veterinario.class, idVeterinario);
			em.remove(vet);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Veterinario> findByName(Veterinario vet) {
		List<Veterinario> lista = new ArrayList<Veterinario>();
		try {
			Query q = em.createQuery("from Veterinario v where v.nombre like ?1");
			q.setParameter(1, "%" + vet.getNombre() + "%");
			lista=(List<Veterinario>)q.getResultList();
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return lista;
	}

}
