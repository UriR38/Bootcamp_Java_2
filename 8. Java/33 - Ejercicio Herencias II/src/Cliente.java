public class Cliente extends Persona {
	private String categoria;
	private String codigo;

	// Constructor de la subclase
	public Cliente(String nombres, String apellidos, String documento, String tipo, String categoria) {
		super(nombres, apellidos, documento, tipo); // Llama al constructor de la superclase
		this.categoria = categoria;
		this.codigo = generarCodigo();
	}

	// Método adicional de la subclase
	public String generarCodigo() {
		return "C-" + documento;
	}

	// Métodos getter y setter
	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
}
