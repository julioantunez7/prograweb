package pe.edu.upc.trabajo.models.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Productos")
public class Producto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idProduto")
	private Integer idProduto;
	@Column(name = "nombreProducto", length = 10)
	private String nombreProducto;
	@Column(name = "apellidoProducto", length = 20)
	private String apellidoProducto;
	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Producto(Integer idProduto, String nombreProducto, String apellidoProducto) {
		super();
		this.idProduto = idProduto;
		this.nombreProducto = nombreProducto;
		this.apellidoProducto = apellidoProducto;
	}
	public Integer getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(Integer idProduto) {
		this.idProduto = idProduto;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public String getApellidoProducto() {
		return apellidoProducto;
	}
	public void setApellidoProducto(String apellidoProducto) {
		this.apellidoProducto = apellidoProducto;
	}
	
	
	
	//@OneToMany(mappedBy = "producto", fetch = FetchType.LAZY)
	//private List<ListaProducto> listaProductos;
	
	//@OneToMany(mappedBy = "producto", fetch = FetchType.LAZY)
	//private List<Compra> compras;
	
}