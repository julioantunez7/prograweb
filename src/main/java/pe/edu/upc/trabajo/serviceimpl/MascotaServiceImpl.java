package pe.edu.upc.trabajo.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.trabajo.dao.IMascotaDao;
import pe.edu.upc.trabajo.models.entities.Mascota;
import pe.edu.upc.trabajo.service.IMascotaService;

@Named
@RequestScoped
public class MascotaServiceImpl implements IMascotaService{
	@Inject
	private IMascotaDao mDao;
	
	
	@Override
	public void insert(Mascota masc) {
		// TODO Auto-generated method stub
		mDao.insert(masc);
	}

	@Override
	public List<Mascota> list() {
		// TODO Auto-generated method stub
		return mDao.list();
	}

	@Override
	public void delete(int idMascota) {
		// TODO Auto-generated method stub
		mDao.delete(idMascota);
	}

	@Override
	public List<Mascota> findByName(Mascota masc) {
		// TODO Auto-generated method stub
		return mDao.findByName(masc);
	}
	
}
