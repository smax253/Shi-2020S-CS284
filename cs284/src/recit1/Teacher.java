package recit1;

public class Teacher implements Person{
	private String name;
	private int age;
	private String address;
	public Teacher(String name, int age, String houseaddress) {
		address = houseaddress;
		this.age = age;
		this.name = name;
		
	}
	@Override
	public void doJob() {
		// TODO Auto-generated method stub
		System.out.println("Teaching");
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return age;
	}

	@Override
	public String getAddress() {
		// TODO Auto-generated method stub
		return address;
	}

	@Override
	public void setAddress(String address) {
		// TODO Auto-generated method stub
		this.address = address;
	}
	
	
}
