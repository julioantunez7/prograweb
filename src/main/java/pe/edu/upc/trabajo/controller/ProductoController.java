package pe.edu.upc.trabajo.controller;

import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import java.util.List;


import pe.edu.upc.trabajo.models.entities.Producto;
import pe.edu.upc.trabajo.service.iProductoService;

@Named
@RequestScoped
public class ProductoController {
	
	@Inject
	
	private iProductoService pService;
	
	private Producto producto;
	
	List<Producto> listaProductos;
	
	//constructor
	
	@PostConstruct
	public void init()
	{
		this.producto =new Producto();
		this.listaProductos=new ArrayList<Producto>();
		this.list();
	}
	
	//metodos especializados
	
	public String newProducto()
	{
		this.setProducto(new Producto());
		return "producto.xhtml";
	}
	
	public void insert()
	{
		try {
			pService.insert(producto);
		} catch (Exception e) {
			System.out.println("Error al insertar en el controler de producto");
		}
	}
	
	
	public void list()
	{
		try {
			
			listaProductos=pService.list();
			
		} catch (Exception e) {
			System.out.println("Error al listar en el controller de producto");
		}
	}
	
	public void delet(Producto re)
	{
	try {
		pService.delete(re.getIdProducto());
		this.list();
	} catch (Exception e) {
		System.out.println("Error al eliminar en el controller del producto");
	 }	
	}
	
	
	//get and set
	
	

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public List<Producto> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(List<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}
	
	
	

}
