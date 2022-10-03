package Student;

public class StudentDTO {
	
	private int id;
	private String name;
	private int rollNo;
	private int age;
	private int marks;
	
	// creating getter setter
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
	@Override
	public String toString() {
		return "StudentDTO [id=" + id + ", name=" + name + ", rollNo=" + rollNo + ", age=" + age + ", marks=" + marks
				+ "]";
	}
	
	
	
	
	
	
}
