package pe.edu.upc.trabajo.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.trabajo.dao.IClienteDao;
import pe.edu.upc.trabajo.models.entities.Cliente;
import pe.edu.upc.trabajo.service.IClienteService;

@Named
@RequestScoped
public class ClienteServiceImpl implements IClienteService {
	@Inject
	private IClienteDao cDao;
	
	@Override
	public void insert(Cliente cli) {
		cDao.insert(cli);
	}
	
	@Override
	public List<Cliente> list(){
		return cDao.list();
	}
	
	@Override
	public void delete(int idCliente) {
		cDao.delete(idCliente);
	}

	@Override
	public List<Cliente> findByName(Cliente cli) {
		// TODO Auto-generated method stub
		return cDao.findByName(cli);
	}
}
