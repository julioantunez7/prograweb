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
	@Column(name = "idProducto")
	private Integer idProducto;
	@Column(name = "nombreProducto", length = 15)
	private String nombreProducto;
	@Column(name = "descripcionProducto", length = 100)
	private String descripcionProducto;
	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Producto(Integer idProducto, String nombreProducto, String descripcionProducto) {
		super();
		this.idProducto = idProducto;
		this.nombreProducto = nombreProducto;
		this.descripcionProducto = descripcionProducto;
	}
	public Integer getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(Integer idProduto) {
		this.idProducto = idProduto;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public String getdescripcionProducto() {
		return descripcionProducto;
	}
	public void setdescripcionProducto(String descripcionProducto) {
		this.descripcionProducto = descripcionProducto;
	}

	
	
	
	
	//@OneToMany(mappedBy = "producto", fetch = FetchType.LAZY)
	//private List<ListaProducto> listaProductos;
	
	//@OneToMany(mappedBy = "producto", fetch = FetchType.LAZY)
	//private List<Compra> compras;
	
}