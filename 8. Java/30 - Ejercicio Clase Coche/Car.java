public class Car {
	final static String ANSI_BOLD = "\033[1m";
	final static String ANSI_RESET = "\033[0m";

	// Atributos privados
	private String fuel;
	private float maxSpeed;

	// Constructor con parámetros
	public Car(String fuel, float maxSpeed) {
		this.fuel = fuel;
		this.maxSpeed = maxSpeed;
	}

	// Constructor vacío
	public Car() {
	}

	// Getters y Setters públicos
	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public float getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(float maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	// Método drive
	public void drive() {
		System.out.println("El coche va a " + maxSpeed + " km/h.");
	}

	// Método refuel
	public void refuel() {
		System.out.println("El coche ha sido recargado con " + fuel + ".");
	}

	// Método main para probar la clase
	public static void main(String[] args) {
		// Crear tres objetos de la clase Car

		// Objeto 1
		Car car1 = new Car();
		car1.setFuel("Gasolina");
		car1.setMaxSpeed(180);

		System.out.println(ANSI_BOLD + "Tipo de fuel: " + ANSI_RESET + car1.getFuel() + ANSI_BOLD
				+ "\nVelocidad máxima: " + ANSI_RESET + car1.getMaxSpeed());
		car1.refuel();
		car1.drive();
		System.out.println();

		// Objeto 2
		Car car2 = new Car();
		car2.setFuel("Electricidad");
		car2.setMaxSpeed(90);

		System.out.println(ANSI_BOLD + "Tipo de fuel: " + ANSI_RESET + car2.getFuel() + ANSI_BOLD
				+ "\nVelocidad máxima: " + ANSI_RESET + car2.getMaxSpeed());
		car2.refuel();
		car2.drive();
		System.out.println();

		// Objeto 3
		Car car3 = new Car("Gas", 120);

		System.out.println(ANSI_BOLD + "Tipo de fuel: " + ANSI_RESET + car3.getFuel() + ANSI_BOLD
				+ "\nVelocidad máxima: " + ANSI_RESET + car3.getMaxSpeed());
		car3.refuel();
		car3.drive();
	}
}
