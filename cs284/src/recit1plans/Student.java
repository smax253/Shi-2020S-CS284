package recit1plans;

public class Student implements Person{
	private String name;
	private int age;
	private String address;
	private String major;
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	public boolean isGraduated() {
		return age>23;
	} 
	public Student(String name, int age, String address, String major) {
		this.name = name;
		this.address = address;
		this.age = age;
		this.setMajor(major);
	}
	public static void main(String[] args) {
		Student max = new Student("Max",19,"1 Castle Point Terrace", "Computer Science");
		System.out.println(max.getAge());
		System.out.println(max.isGraduated());
	}
	@Override
	public String getName() {
		return name;
	}
	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return age;
	}
	@Override
	public String doJob() {
		// TODO Auto-generated method stub
		return "I'm studying!";
	}
	@Override
	public void setAddress(String address) {
		// TODO Auto-generated method stub
		this.address = address;
	}
	@Override
	public String getAddress() {
		// TODO Auto-generated method stub
		return address;
	}
}
