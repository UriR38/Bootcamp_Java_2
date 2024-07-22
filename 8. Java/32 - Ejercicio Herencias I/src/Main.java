public class Main {
	public static void main(String[] args) {

		Employee emp = new Employee(50000);
		System.out.println("Employee Salary: " + emp.getSalary());

		Programmer prog = new Programmer(60000, 5000);
		System.out.println("Programmer Salary: " + prog.getSalary());
		System.out.println("Programmer Bonus: " + prog.getBonus());
	}
}
