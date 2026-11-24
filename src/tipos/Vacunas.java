package tipos;

import java.time.LocalDate;

public class Vacunas {
    private final String id;
    private final Mascota mascota;
    private final TiposVacunas enfermedad;
    private final LocalDate fechaVacunacion;
    private LocalDate fechaRenovacion;
    
    
	public Vacunas(String id, Mascota mascota, TiposVacunas enfermedad, LocalDate fechaVacunacion,
			LocalDate fechaRenovacion) {
		this.id = id;
		this.mascota = mascota;
		this.enfermedad = enfermedad;
		this.fechaVacunacion = fechaVacunacion;
		this.fechaRenovacion = fechaRenovacion;
	}


	public LocalDate getFechaRenovacion() {
		return fechaRenovacion;
	}


	public void setFechaRenovacion(LocalDate fechaRenovacion) {
		this.fechaRenovacion = fechaRenovacion;
	}


	public String getId() {
		return id;
	}


	public Mascota getMascota() {
		return mascota;
	}


	public TiposVacunas getEnfermedad() {
		return enfermedad;
	}


	public LocalDate getFechaVacunacion() {
		return fechaVacunacion;
	}
    
    
    
}
	