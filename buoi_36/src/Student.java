import java.util.Objects;

public class Student {

	public String id;
	public String name;
	public int age;
	
	public Student(String id) {
		this.id = id;
	}
	
	public Student(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int hashCode() {  // Cần cho chức năng (*)
		return Objects.hash(this.id);
	}
	
	@Override
	public boolean equals(Object obj) {  // Cần cho chức năng (*)
		return this.id.equals(((Student)obj).id);
	}
	
	@Override
	public String toString() {
		return String.format("Student [id=%s, name=%s, age=%d]", this.id, this.name, this.age);
	}

}