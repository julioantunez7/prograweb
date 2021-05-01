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
	private Integer idVeterinaria;
	@Column(name = "veterinaria_nombre", length = 15)
	private String nombreVeterinaria;
	@Column(name = "veterinaria_direccion", length = 50)
	private String direccionVeterinaria;
	@Column(name = "veterinaria_numero", columnDefinition = "NUMERIC(9)")
	private Integer numeroVeterinaria;
	@Column(name = "veterinaria_descripcion", length = 100)
	private String descripcionVeterinaria;
	
	public Integer getIdVeterinaria() {
		return idVeterinaria;
	}
	public void setIdVeterinaria(Integer idVeterinaria) {
		this.idVeterinaria = idVeterinaria;
	}
	public String getNombreVeterinaria() {
		return nombreVeterinaria;
	}
	public void setNombreVeterinaria(String nombreVeterinaria) {
		this.nombreVeterinaria = nombreVeterinaria;
	}
	public String getDireccionVeterinaria() {
		return direccionVeterinaria;
	}
	public void setDireccionVeterinaria(String direccionVeterinaria) {
		this.direccionVeterinaria = direccionVeterinaria;
	}
	public Integer getNumeroVeterinaria() {
		return numeroVeterinaria;
	}
	public void setNumeroVeterinaria(Integer numeroVeterinaria) {
		this.numeroVeterinaria = numeroVeterinaria;
	}
	public String getDescripcionVeterinaria() {
		return descripcionVeterinaria;
	}
	public void setDescripcionVeterinaria(String descripcionVeterinaria) {
		this.descripcionVeterinaria = descripcionVeterinaria;
	}
	
	
	//@OneToMany(mappedBy = "veterinaria", fetch = FetchType.LAZY)
	//private List<Veterinario> veterinarios;
	
	//@OneToMany(mappedBy = "veterinaria", fetch = FetchType.LAZY)
	//private List<ListaProducto> listaproductos;
}
