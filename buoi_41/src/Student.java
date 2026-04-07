public class Student {

    private String id;
    private String name;
    private int age;
    private String className;
    private double avg;
    
    public Student(String id, String name, int age, String className, double avg) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.className = className;
        this.avg = avg;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", age=" + age + ", className=" + className + ", avg=" + avg
                + "]";
    }
    
}
