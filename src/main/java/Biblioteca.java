import java.util.ArrayList;

public class Biblioteca {
	public Universidad universidad;
	public ArrayList<Prestamo> prestamos = new ArrayList<Prestamo>();
	public ArrayList<RecursoDigital> recursos = new ArrayList<RecursoDigital>();

	public ArrayList<RecursoDigital> getRecursos() {
		return recursos;
	}

	public void mostrarCatalogo() {
		for (RecursoDigital recursodigital : this.recursos){
			System.out.println(recursodigital);
		}
	}

	public void extenderPrestamo(Prestamo prestamo) {
		throw new UnsupportedOperationException();
	}

	public void agregarRecursoDigital(String titulo, String autor, int anio, String tematica, String tipoAcceso) {
		RecursoDigital recursoAgregar = new RecursoDigital(titulo, autor, anio, tematica, tipoAcceso);
		this.recursos.add(recursoAgregar);
	}
}