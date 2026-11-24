package tipos;

import java.util.List;

public class Refugio {
	private final String id;
	private String nombre;
	private String direccion;
	private Integer telefono;
	private Integer capacidadMaxima;
	private List<Mascota> mascotas;
	
	public Refugio(String id, String nombre, String direccion, Integer telefono, Integer capacidadMaxima,
			List<Mascota> mascotas) {
		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.capacidadMaxima = capacidadMaxima;
		this.mascotas = mascotas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	public Integer getCapacidadMaxima() {
		return capacidadMaxima;
	}

	public void setCapacidadMaxima(Integer capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}

	public List<Mascota> getMascotas() {
		return mascotas;
	}

	public void setMascotas(List<Mascota> mascotas) {
		this.mascotas = mascotas;
	}

	public String getId() {
		return id;
	}
	
	
}
