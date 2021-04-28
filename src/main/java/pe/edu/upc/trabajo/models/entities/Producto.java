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
	@Column(name = "producto_id")
	private Integer id;
	@Column(name = "producto_nombre", length = 10)
	private String nombre;
	@Column(name = "producto_descripcion", length = 20)
	private String apellido;
	
	@OneToMany(mappedBy = "producto", fetch = FetchType.LAZY)
	private List<ListaProducto> listaProductos;
	
	@OneToMany(mappedBy = "producto", fetch = FetchType.LAZY)
	private List<Compra> compras;
}