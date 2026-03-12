public class Student /* implements Comparable<Student> */ {

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
	public boolean equals(Object obj) {  // Cần cho chức năng (*)
		return this.id.equals(((Student)obj).id);
	}

	// @Override
	// public int compareTo(Student stu) {  // Cần cho chức năng (*)
	// 	if(this.age > stu.age) {
	// 		return 1;
	// 	} else if(this.age < stu.age) {
	// 		return -1;
	// 	} else {
	// 		return 0;
	// 	}
	// }
	
	@Override
	public String toString() {
		return String.format("Student [id=%s, name=%s, age=%d]", this.id, this.name, this.age);
	}

}