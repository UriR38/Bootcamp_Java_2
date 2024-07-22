public class Banco {
	final static String ANSI_BOLD = "\033[1m";
	final static String ANSI_RESET = "\033[0m";

	// Atributos privados
	private String entidadEmisora;
	private String numeroCuenta;
	private String fechaCaducidad;
	private String titularCuenta;
	private boolean activa;
	private float saldo;

	// Constructor con parámetros
	public Banco(String entidadEmisora, String numeroCuenta, String fechaCaducidad, String titularCuenta) {
		this.entidadEmisora = entidadEmisora;
		this.numeroCuenta = numeroCuenta;
		this.fechaCaducidad = fechaCaducidad;
		this.titularCuenta = titularCuenta;
		this.activa = false;
		this.saldo = 1000.0f;
	}

	// Constructor vacío
	public Banco() {
		this.activa = false;
		this.saldo = 1000.0f;
	}

	// Getters y Setters públicos
	public String getEntidadEmisora() {
		return entidadEmisora;
	}

	public void setEntidadEmisora(String entidadEmisora) {
		this.entidadEmisora = entidadEmisora;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public String getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	public String getTitularCuenta() {
		return titularCuenta;
	}

	public void setTitularCuenta(String titularCuenta) {
		this.titularCuenta = titularCuenta;
	}

	public boolean isActiva() {
		return activa;
	}

	public void setActiva(boolean activa) {
		this.activa = activa;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	// Métodos públicos
	public void activar() {
		if (!activa) {
			activa = true;
			System.out.println("\tLa tarjeta ha sido activada!");
		} else {
			System.out.println("\tLa tarjeta ya estaba activada.");
		}
	}

	public void pagar(float cantidadAPagar) {
		if (!activa) {
			System.out.println("\tLa tarjeta no está activada, activala para poder pagar.");
		} else if (saldo < cantidadAPagar) {
			System.out.println("\tEl saldo de la tarjeta es insuficiente.");
		} else {
			saldo -= cantidadAPagar;
			System.out.println("\tCompra validada. Saldo restante: " + saldo + "€");
		}
	}

	public void anular() {
		if (activa) {
			activa = false;
			System.out.println("\tLa tarjeta ha sido anulada.");
		} else {
			System.out.println("\tLa tarjeta ya estaba anulada.");
		}
	}

	// Método main para probar la clase
	public static void main(String[] args) {
		// Objeto 1
		Banco tarjeta1 = new Banco();
		tarjeta1.setEntidadEmisora("N Bank");
		tarjeta1.setNumeroCuenta("1234 5678 9876 5432");
		tarjeta1.setFechaCaducidad("12/99");
		tarjeta1.setTitularCuenta("AL HOLDER");
		
		System.out.println("-----------------------------------------------");
		System.out.println(ANSI_BOLD + "DATOS DE LA PRIMERA TARJETA" + ANSI_RESET+"\n");
		System.out.println(ANSI_BOLD + "\tEntidad Emisora: " + ANSI_RESET + tarjeta1.getEntidadEmisora());
		System.out.println(ANSI_BOLD + "\tNúmero de cuenta: " + ANSI_RESET + tarjeta1.getNumeroCuenta());
		System.out.println(ANSI_BOLD + "\tFecha de caducidad: " + ANSI_RESET + tarjeta1.getFechaCaducidad());
		System.out.println(ANSI_BOLD + "\tNombre del titular: " + ANSI_RESET + tarjeta1.getTitularCuenta());
		System.out.println(ANSI_BOLD + "\tSaldo disponible: " + ANSI_RESET + tarjeta1.getSaldo());
		

		System.out.println(ANSI_BOLD + "\nOperaciones sobre la tarjeta:" + ANSI_RESET);
		tarjeta1.activar();
		tarjeta1.pagar(438.89f);
		tarjeta1.anular();
		System.out.println("-----------------------------------------------");

		// Objeto 2
		Banco tarjeta2 = new Banco();
		tarjeta2.setEntidadEmisora("N Bank");
		tarjeta2.setNumeroCuenta("9876 5432 1234 5678");
		tarjeta2.setFechaCaducidad("11/25");
		tarjeta2.setTitularCuenta("JOHN DOE");

		System.out.println(ANSI_BOLD + "DATOS DE LA SEGUNDA TARJETA" + ANSI_RESET+"\n");
		System.out.println(ANSI_BOLD + "\tEntidad Emisora: " + ANSI_RESET + tarjeta2.getEntidadEmisora());
		System.out.println(ANSI_BOLD + "\tNúmero de cuenta: " + ANSI_RESET + tarjeta2.getNumeroCuenta());
		System.out.println(ANSI_BOLD + "\tFecha de caducidad: " + ANSI_RESET + tarjeta2.getFechaCaducidad());
		System.out.println(ANSI_BOLD + "\tNombre del titular: " + ANSI_RESET + tarjeta2.getTitularCuenta());
		System.out.println(ANSI_BOLD + "\tSaldo disponible: " + ANSI_RESET + tarjeta2.getSaldo());

		System.out.println(ANSI_BOLD + "\nOperaciones sobre la tarjeta:" + ANSI_RESET);
		tarjeta2.activar();
		tarjeta2.pagar(800.0f);
		tarjeta2.anular();
		System.out.println("-----------------------------------------------");

		// Objeto 3
		Banco tarjeta3 = new Banco("N Bank", "5678 1234 8765 4321", "01/27", "JANE SMITH");

		System.out.println(ANSI_BOLD + "DATOS DE LA TERCERA TARJETA" + ANSI_RESET+"\n");
		System.out.println(ANSI_BOLD + "\tEntidad Emisora: " + ANSI_RESET + tarjeta3.getEntidadEmisora());
		System.out.println(ANSI_BOLD + "\tNúmero de cuenta: " + ANSI_RESET + tarjeta3.getNumeroCuenta());
		System.out.println(ANSI_BOLD + "\tFecha de caducidad: " + ANSI_RESET + tarjeta3.getFechaCaducidad());
		System.out.println(ANSI_BOLD + "\tNombre del titular: " + ANSI_RESET + tarjeta3.getTitularCuenta());
		System.out.println(ANSI_BOLD + "\tSaldo disponible: " + ANSI_RESET + tarjeta3.getSaldo());

		System.out.println(ANSI_BOLD + "\nOperaciones sobre la tarjeta:" + ANSI_RESET);
		tarjeta3.activar();
		tarjeta3.pagar(1200.0f); // Esto debería fallar por saldo insuficiente
		tarjeta3.pagar(150.0f); // Esto debería ser exitoso
		tarjeta3.anular();
		System.out.println("-----------------------------------------------");
	}
}
