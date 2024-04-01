import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String nombre;
	private String apellido;
	private int rut;
	private Prestamo historialPrestamos;
	Biblioteca biblioteca = new Biblioteca();

	ArrayList <RecursoDigital> recursosLista = biblioteca.getRecursos();

	public void buscarRecurso(String titulo, String autor, int anio, String tematica) {


		for (RecursoDigital recurso : recursosLista) {
			if (recurso.getTitulo().equalsIgnoreCase(titulo)){
				System.out.println("LO PILLE HAHAHAHAHSDJKSADHSAKDJL");

			}
			System.out.println(recurso);
		}


	}


	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getRut() {
		return this.rut;
	}

	public void setRut(int rut) {
		this.rut = rut;
	}

	public Usuario(String nombre, String apellido, int rut) {

		this.nombre = nombre;
		this.apellido = apellido;
		this.rut = rut;
	}

	@Override
	public String toString() {
		return this.nombre + this.apellido + ", RUT: " + this.rut;
	}
}