public class Programmer extends Employee {
	private int bonus;

	public Programmer(float salary, int bonus) {
		super(salary);
		this.bonus = bonus;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
}
