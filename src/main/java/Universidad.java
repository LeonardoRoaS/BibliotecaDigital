import java.time.LocalDate;

public class Universidad {
	public Biblioteca biblioteca;

	public static void main(String[] args) {
		Biblioteca biblioteca = new Biblioteca();
		Usuario usuario = new Usuario("Leonardo", "Roa", 211934875);
		Prestamo prestamo = new Prestamo("null");

		biblioteca.agregarRecursoDigital("titulo1", "autor1", 2020, "tematica1", "publico");
		biblioteca.agregarRecursoDigital("titulo2", "autor2", 2019, "tematica2", "exclusivo");
		biblioteca.agregarRecursoDigital("titulo3", "autor3", 2019, "tematica1", "publico");
		biblioteca.mostrarCatalogo();

		prestamo.TESTEO();

		usuario.buscarRecurso("titulo1", "autor1",2020, "tematica1");

	}
}