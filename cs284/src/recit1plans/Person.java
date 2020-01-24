package recit1plans;

public class Person {
	protected int age;
	protected String name;
	protected String address;
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Person(String name, int age, String address) {
		this.setAge(age);
		this.setName(name);
		this.setAddress(address);
	}
}
