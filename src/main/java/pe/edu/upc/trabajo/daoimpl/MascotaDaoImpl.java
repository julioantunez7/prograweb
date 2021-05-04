package pe.edu.upc.trabajo.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.trabajo.dao.IMascotaDao;
import pe.edu.upc.trabajo.models.entities.Mascota;

public class MascotaDaoImpl implements IMascotaDao{

	@PersistenceContext(unitName="trabajoPU")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insert(Mascota masc) {
		try {
			em.persist(masc);		
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Mascota> list() {
		List<Mascota> lista=new ArrayList<Mascota>();
		try {
			Query q=em.createQuery("from Mascota m");
			lista=(List<Mascota>)q.getResultList();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return lista;
	}

	@Transactional
	@Override
	public void delete(int idMascota) {
		Mascota m=new Mascota();
		try {
			m=em.getReference(Mascota.class, idMascota);
			em.remove(m);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
