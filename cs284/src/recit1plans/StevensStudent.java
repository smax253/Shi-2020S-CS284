package recit1plans;

public class StevensStudent extends Student {
	private double debt;
	public StevensStudent(String name, int age, String address, String major) {
		super(name, age, address, major);
		this.debt = Double.MAX_VALUE;
	}
	
}
