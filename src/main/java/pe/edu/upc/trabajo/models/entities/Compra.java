package pe.edu.upc.trabajo.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Compras")
@IdClass(value = CompraId.class)
public class Compra {
	
	@Id
	@ManyToOne
	@JoinColumn(name= "boleta_id")
	private Boleta boleta;
	
	@Id
	@ManyToOne
	@JoinColumn(name= "producto_id")
	private Producto producto;
	
	
	@Column(name = "compra_cantidad")
	private Integer cantidad;	

	@ManyToOne
	@JoinColumn(name= "cliente_id")
	private Cliente cliente;
	
	
}
