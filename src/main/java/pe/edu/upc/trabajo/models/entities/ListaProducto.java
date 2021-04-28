package pe.edu.upc.trabajo.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ListaProductos")
@IdClass(value = ListaProductoId.class)
public class ListaProducto {
	@Id
	@ManyToOne
	@JoinColumn(name= "veterinaria_id")
	private Veterinaria veterinaria;
	
	@Id
	@ManyToOne
	@JoinColumn(name= "producto_id")
	private Producto producto;
	
	
	@Column(name = "pagos_id")
	private Integer precio;
	@Column(name = "stock_id")
	private Integer stock;
}