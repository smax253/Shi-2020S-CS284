package recit2plans;

public abstract class Person {
	private String name;
	private int age;
	private String address;
	public abstract void doJob();
	
	public Person(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public String getName() {
		return name;
	};
	public int getAge() {
		return age;
	};
	public String getAddress() {
		return address;
	};
	public void setAddress(String address) {
		this.address = address;
	};
}
