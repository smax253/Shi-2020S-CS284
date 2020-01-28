package recit1;

public class StevensStudent extends Student{
	private int debt;
	public StevensStudent(String name, int age, String address) {
		super(name, age, address);
		setDebt(Integer.MAX_VALUE);
	}
	public int getDebt() {
		return debt;
	}
	public void setDebt(int debt) {
		this.debt = debt;
	}
	
}
