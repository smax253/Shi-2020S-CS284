package recit2plans;

public class Teacher extends Person{
	private String name;
	private int age;
	private String address;
	public Teacher(String name, int age, String houseaddress) {
		super(name, age, houseaddress);
	}
	@Override
	public void doJob() {
		// TODO Auto-generated method stub
		System.out.println("Teaching");
	}
	
	
}
