package pe.edu.upc.trabajo.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.trabajo.dao.IVeterinarioDao;
import pe.edu.upc.trabajo.models.entities.Veterinario;
import pe.edu.upc.trabajo.service.IVeterinarioService;


@Named
@RequestScoped
public class VeterinarioServiceImpl implements IVeterinarioService{

	@Inject
	private IVeterinarioDao vDao;
	
	@Override
	public void insert(Veterinario vet) {
		try {
			vDao.insert(vet);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	@Override
	public List<Veterinario> list() {
		return vDao.list();
	}

	@Override
	public void delete(int idVeterinario) {
		vDao.delete(idVeterinario);
		
	}

	@Override
	public List<Veterinario> findByName(Veterinario vet) {
		return vDao.findByName(vet);
	}

}
