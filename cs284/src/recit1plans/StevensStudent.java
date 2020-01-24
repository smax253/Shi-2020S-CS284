package recit1plans;

public class StevensStudent extends Person {
	private String major;
	private double debt;
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public double getDebt() {
		return debt;
	}
	public void setDebt(double debt) {
		this.debt = debt;
	}
	public boolean isGraduated() {
		return age>23;
	}
	public StevensStudent(String name, int age, String address, String major) {
		super(name, age, address);
		this.setMajor(major);
		this.setDebt(Double.MAX_VALUE);
	}
	public static void main(String[] args) {
		StevensStudent max = new StevensStudent("Max",19,"1 Castle Point Terrace", "Computer Science");
		System.out.println(max.getAge());
		System.out.println(max.isGraduated());
	}
}
