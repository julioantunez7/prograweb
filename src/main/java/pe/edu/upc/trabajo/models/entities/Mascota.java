package pe.edu.upc.trabajo.models.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Mascotas")
public class Mascota {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "mascota_id")
	private Integer id;
	@Column(name = "mascota_nombre", length = 10)
	private String nombre;
	@Column(name = "mascota_edad", columnDefinition = "NUMERIC(2)")
	private Integer edad;
	@Column(name = "mascota_raza", length = 15)
	private String raza;
	
	@ManyToOne
	@JoinColumn(name= "cliente_id")
	private Cliente cliente;

	public Mascota() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mascota(Integer id, String nombre, Integer edad, String raza, Cliente cliente) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
		this.raza = raza;
		this.cliente = cliente;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	
	//@OneToMany(mappedBy = "mascota", fetch = FetchType.LAZY)
	//private List<Cita> citas;
	
	
	
	
}
