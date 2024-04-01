import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;


public class Prestamo {
	private RecursoDigital registroRecursos;
	private String estadoPrestamo;
	private Date fechaPrestamo;
	private Date fechaDevolucion;
	public Biblioteca biblioteca;
	public ArrayList<RecursoDigital> recursos = new ArrayList<RecursoDigital>();


	public String getEstadoPrestamo() {
		return this.estadoPrestamo;
	}

	public void setEstadoPrestamo(String estadoPrestamo) {
		this.estadoPrestamo = estadoPrestamo;
	}

	public Date getFechaPrestamo() {
		return this.fechaPrestamo;
	}

	public void setFechaPrestamo(Date fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}

	public Date getFechaDevolucion() {
		return this.fechaDevolucion;
	}

	public void setFechaDevolucion(Date fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}



	public Prestamo(String estadoPrestamo){
		this.estadoPrestamo = estadoPrestamo;
	}
}