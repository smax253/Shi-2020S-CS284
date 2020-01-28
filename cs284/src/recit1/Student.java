package recit1;

public class Student implements Person{
	private String name;
	private int age;
	private String address;
	public Student(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	@Override
	public void doJob() {
		// TODO Auto-generated method stub
		System.out.println("Studying");
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
	public static void main(String[] args) {
		StevensStudent max = new StevensStudent("Max",19,"1 Castle Point Terr");
		Person xu = new Teacher("Jia Xu", 25, "Hoboken");
		max.doJob();
		xu.doJob();
		System.out.println(max.getDebt());
	}
}
