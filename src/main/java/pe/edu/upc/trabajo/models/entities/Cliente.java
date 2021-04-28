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
	private Integer id;
	@Column(name = "cliente_nombre", length = 10)
	private String nombre;
	@Column(name = "cliente_apellido", length = 10)
	private String apellido;
	@Column(name = "cliente_correo", length = 20)
	private String correo;
	@Column(name = "cliente_direccion", length = 10)
	private String direccion;
	@Column(name = "cliente_numero", columnDefinition = "NUMERIC(9)")
	private Integer numero;
	
	@OneToMany(mappedBy = "cliente", fetch = FetchType.LAZY)
	private List<Mascota> mascotas;
	
	@OneToMany(mappedBy = "cliente", fetch = FetchType.LAZY)
	private List<Boleta> boletas;
		
}
