package tipos;
import java.time.LocalDate;

public class Mascota {
	private final String id;
	private String nombre;
	private Tipos tipo;
	private final especie;
	private final raza;
	private final LocalDate fechaNacimiento;
	private Boolean disponibleAdopcion;
	private LocalDate fechaBaja;
	private Boolean estaEsterelizado;
}
