package pe.edu.upc.trabajo.models.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Boletas")
public class Boleta {
	@Id
	@Column(name = "boleta_id")
	private Integer id;

	@ManyToOne
	@JoinColumn(name= "cliente_id")
	private Cliente cliente;
	
	@Column(name = "boleta_precioTotal")
	private Integer precioTotal;

	@OneToMany(mappedBy = "boleta", fetch = FetchType.LAZY)
	private List<Compra> compras;
	
	
}
