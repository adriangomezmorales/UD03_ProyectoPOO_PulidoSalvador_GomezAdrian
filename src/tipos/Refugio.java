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
	
	
}
