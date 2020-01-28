package recit2plans;

public class Student extends Person{
	private String name;
	private int age;
	private String address;
	public Student(String name, int age, String address) {
		super(name, age, address);
	}
	@Override
	public void doJob() {
		// TODO Auto-generated method stub
		System.out.println("Studying");
	}

	
	public static void main(String[] args) {
		StevensStudent max = new StevensStudent("Max",19,"1 Castle Point Terr");
		Person xu = new Teacher("Jia Xu", 25, "Hoboken");
		max.doJob();
		xu.doJob();
		System.out.println(max.getDebt());
	}
}
