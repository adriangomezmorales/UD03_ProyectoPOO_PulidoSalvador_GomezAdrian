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
}
