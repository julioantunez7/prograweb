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
@Table(name = "Clientes")
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cliente_id")
	private Integer idCliente;
	@Column(name = "cliente_nombre", length = 15)
	private String nombre;
	@Column(name = "cliente_apellido", length = 15)
	private String apellido;
	@Column(name = "cliente_correo", length = 30)
	private String correo;
	@Column(name = "cliente_direccion", length = 50)
	private String direccion;
	@Column(name = "cliente_numero", columnDefinition = "NUMERIC(9)")
	private Integer numero;
	
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cliente(Integer idCliente, String nombre, String apellido, String correo, String direccion, Integer numero) {
		super();
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.direccion = direccion;
		this.numero = numero;
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	
	
	
	
	
	//@OneToMany(mappedBy = "cliente", fetch = FetchType.LAZY)
	//private List<Mascota> mascotas;
	
	//@OneToMany(mappedBy = "cliente", fetch = FetchType.LAZY)
	//private List<Boleta> boletas;
		
}
