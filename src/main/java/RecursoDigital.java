public class RecursoDigital {
	private String titulo;
	private String autor;
	private int anio;
	private String tematica;
	private String tipoAcceso;
	public Prestamo prestamo;
	public Biblioteca biblioteca;

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return this.autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAnio() {
		return this.anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public String getTematica() {
		return this.tematica;
	}

	public void setTematica(String tematica) {
		this.tematica = tematica;
	}

	public String getTipoAcceso() {
		return this.tipoAcceso;
	}

	public void setTipoAcceso(String tipoAcceso) {
		this.tipoAcceso = tipoAcceso;
	}

	public RecursoDigital(String titulo, String autor, int anio, String tematica, String tipoAcceso) {
		this.titulo = titulo;
		this.autor = autor;
		this.anio = anio;
		this.tematica = tematica;
		this.tipoAcceso = tipoAcceso;
	}

	@Override
	public String toString() {
		return this.titulo + ", autor: " + this.autor + ", año: " + this.anio + ", temática: " + this.tematica + ", tipo de Acceso: " + this.tipoAcceso;
	}
}