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

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Tipos getTipo() {
		return tipo;
	}

	public void setTipo(Tipos tipo) {
		this.tipo = tipo;
	}

	public Boolean getDisponibleAdopcion() {
		return disponibleAdopcion;
	}

	public void setDisponibleAdopcion(Boolean disponibleAdopcion) {
		this.disponibleAdopcion = disponibleAdopcion;
	}

	public LocalDate getFechaAdopcion() {
		return fechaAdopcion;
	}

	public void setFechaAdopcion(LocalDate fechaAdopcion) {
		this.fechaAdopcion = fechaAdopcion;
	}

	public LocalDate getFechaEntrada() {
		return fechaEntrada;
	}

	public void setFechaEntrada(LocalDate fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}

	public Boolean getEstaEsterelizado() {
		return estaEsterelizado;
	}

	public void setEstaEsterelizado(Boolean estaEsterelizado) {
		this.estaEsterelizado = estaEsterelizado;
	}

	public String getId() {
		return id;
	}

	public Refugio getRefugio() {
		return refugio;
	}

	public String getEspecie() {
		return especie;
	}

	public String getRaza() {
		return raza;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	
	
}
