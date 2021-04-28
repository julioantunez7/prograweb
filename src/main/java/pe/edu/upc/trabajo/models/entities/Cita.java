package pe.edu.upc.trabajo.models.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Citas")
@IdClass(value = CitaId.class)
public class Cita {
	
	@Id
	private Integer id;
	@Id
	@ManyToOne
	@JoinColumn(name= "veterinario_id")
	private Veterinario veterinario;
	@Id
	@ManyToOne
	@JoinColumn(name= "mascota_id")
	private Mascota mascota;
	
	@Column(name = "cita_fecha", length = 10)
	@Temporal(TemporalType.DATE)
	private Date fecha;
	@Column(name = "cita_razon", length = 20)
	private String razon;
	@Column(name = "cita_precio", columnDefinition = "DECIMAL(3,2)")
	private Float precio;
	
	@OneToOne(mappedBy = "cita", fetch = FetchType.LAZY)
	private Consulta consulta;
}
