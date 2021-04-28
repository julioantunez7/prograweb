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
@Table(name = "Veterinarios")
public class Veterinario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "veterinario_id")
	private Integer id;
	@Column(name = "veterinario_nombre", length = 15)
	private String nombre;
	@Column(name = "veterinario_numero", columnDefinition = "NUMERIC(9)")
	private Integer numero;
	
	@ManyToOne
	@JoinColumn(name= "veterinaria_id")
	private Veterinaria veterinaria;
	
	@OneToMany(mappedBy = "veterinario", fetch = FetchType.LAZY)
	private List<Cita> citas;
}
