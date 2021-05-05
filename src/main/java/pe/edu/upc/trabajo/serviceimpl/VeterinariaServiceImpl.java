package pe.edu.upc.trabajo.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.trabajo.dao.IVeterinariaDao;
import pe.edu.upc.trabajo.models.entities.Veterinaria;
import pe.edu.upc.trabajo.service.IVeterinariaService;

@Named
@RequestScoped
public class VeterinariaServiceImpl implements IVeterinariaService{
	@Inject
	private IVeterinariaDao vDao;
	
	@Override
	public void insert(Veterinaria vet) {
		vDao.insert(vet);
	}
	
	@Override
	public List<Veterinaria> list(){
		return vDao.list();
	}
	
	@Override
	public void delete(int idVeterinaria) {
		vDao.delete(idVeterinaria);
	}

	@Override
	public List<Veterinaria> findByName(Veterinaria vet) {
		// TODO Auto-generated method stub
		return vDao.findByName(vet);
	}
}
