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
@Table(name = "Veterinarias")
public class Veterinaria {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "veterinaria_id")
	private Integer id;
	@Column(name = "veterinaria_nombre", length = 15)
	private String nombre;
	@Column(name = "veterinaria_direccion", length = 10)
	private String direccion;
	@Column(name = "veterinaria_numero", columnDefinition = "NUMERIC(9)")
	private Integer numero;
	@Column(name = "veterinaria_descripcion", length = 30)
	private String descripcion;
	
	@OneToMany(mappedBy = "veterinaria", fetch = FetchType.LAZY)
	private List<Veterinario> veterinarios;
	
	@OneToMany(mappedBy = "veterinaria", fetch = FetchType.LAZY)
	private List<ListaProducto> listaproductos;
}
