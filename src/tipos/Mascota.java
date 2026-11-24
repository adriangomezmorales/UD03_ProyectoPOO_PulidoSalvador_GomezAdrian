package tipos;
import java.time.LocalDate;

public class Mascota {
	private final String id;
    private final Refugio refugio;
	private String nombre;
	private Tipos tipo;
	private final String especie;
	private final String raza;
	private final LocalDate fechaNacimiento;
	private Boolean disponibleAdopcion;
	private LocalDate fechaAdopcion;
	private LocalDate fechaEntrada;
	private Boolean estaEsterelizado;
	
	public Mascota(String id, Refugio refugio, String nombre, Tipos tipo, String especie, String raza,
			LocalDate fechaNacimiento, Boolean disponibleAdopcion, LocalDate fechaAdopcion, LocalDate fechaEntrada,
			Boolean estaEsterelizado) {
		this.id = id;
		this.refugio = refugio;
		this.nombre = nombre;
		this.tipo = tipo;
		this.especie = especie;
		this.raza = raza;
		this.fechaNacimiento = fechaNacimiento;
		this.disponibleAdopcion = disponibleAdopcion;
		this.fechaAdopcion = fechaAdopcion;
		this.fechaEntrada = fechaEntrada;
		this.estaEsterelizado = estaEsterelizado;
	}
	
	
	
}
