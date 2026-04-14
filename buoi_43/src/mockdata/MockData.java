package mockdata;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import entity.Course;
import entity.Enrollment;
import entity.Student;
import enumeration.Gender;

public class MockData {

    private static final String[] STUDENT_NAMES = {
        "Alice","Bob","Charlie","Diana","Eve","Frank","Grace","Henry","Ivy","Jack",
        "Karen","Leo","Mona","Nina","Oscar","Paul","Quinn","Rose","Steve","Tracy",
        "Uma","Victor","Wendy","Xander","Yara","Zane","Amy","Brian","Clara","David",
        "Ella","Fiona","George","Hannah","Ian","Julia","Kevin","Laura","Mike","Nora",
        "Oliver","Patty","Quincy","Rachel","Sam","Tina","Ulysses","Vera","Will","Xenia"
    };

    private static final String[] CLASSE_NAMES = {"CSE1","CSE2","CSE3","CSE4","CSE5"};

    private static final String[] COURSE_NAMES = {
        "Math","Physics","Chemistry","English","History","Programming",
        "Databases","AI","Networking","Statistics","Economics","Philosophy"
    };

    private Random rand;

    public MockData(Long seed) {
        this.rand = new Random(seed);
    }

    public List<Student> students() {
        List<Student> list = new ArrayList<>();
        for (long i = 1; i <= STUDENT_NAMES.length; i++) {
            String name = STUDENT_NAMES[(int)(i - 1)];
            int age = 18 + this.rand.nextInt(8);
            Gender gender = this.rand.nextInt(2) == 0 ? Gender.MALE : Gender.FEMALE;
            String className = CLASSE_NAMES[this.rand.nextInt(CLASSE_NAMES.length)];
            list.add(new Student(i, name, age, gender, className));
        }
        return list;
    }

    public List<Course> courses() {
        List<Course> list = new ArrayList<>();
        for (long i = 1; i <= COURSE_NAMES.length; i++) {
            String name = COURSE_NAMES[(int)(i - 1)];
            int credit = 2 + this.rand.nextInt(3);
            list.add(new Course(i, name, credit));
        }
        return list;
    }

    public List<Enrollment> enrollments(List<Student> students, List<Course> courses) {
        List<Enrollment> list = new ArrayList<>();
        long enrollmentId = 1;

        for (Student s : students) {
            int numCourses = 5 + this.rand.nextInt(3);
            Set<Integer> chosen = new HashSet<>();
            while(chosen.size() < numCourses){
                chosen.add(this.rand.nextInt(courses.size()));
            }
            for (int idx : chosen) {
                Course c = courses.get(idx);
                double score = 4.0 + this.rand.nextDouble() * 6.0;
                list.add(new Enrollment(enrollmentId++, s.getId(), c.getId(), Math.round(score * 10) / 10.0));
            }
        }
        return list;
    }

}