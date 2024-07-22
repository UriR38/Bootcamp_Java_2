public class Persona {
	protected String nombres;
	protected String apellidos;
	protected String documento;
	protected String tipo;

	// Constructor de la superclase
	public Persona(String nombres, String apellidos, String documento, String tipo) {
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.documento = documento;
		this.tipo = tipo;
	}

	// Métodos getter y setter
	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
