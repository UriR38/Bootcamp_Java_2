public class Empleado extends Persona {
	private String tipoContrato;
	private float sueldo;

	// Constructor de la subclase
	public Empleado(String nombres, String apellidos, String documento, String tipo, String tipoContrato,
			float sueldo) {
		super(nombres, apellidos, documento, tipo); // Llama al constructor de la superclase
		this.tipoContrato = tipoContrato;
		this.sueldo = sueldo;
	}

	// Método adicional de la subclase
	public float calcularSueldo() {
		// Aquí podrías añadir lógica para calcular el sueldo basado en el tipo de
		// contrato
		return sueldo;
	}

	// Métodos getter y setter
	public String getTipoContrato() {
		return tipoContrato;
	}

	public void setTipoContrato(String tipoContrato) {
		this.tipoContrato = tipoContrato;
	}

	public float getSueldo() {
		return sueldo;
	}

	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}
}
