import java.util.List;
import java.util.Map;

import entity.Course;
import entity.Enrollment;
import entity.Student;
import entity.DTO.DTO1;
import entity.DTO.DTO2;
import entity.DTO.Pair;
import enumeration.Gender;

public interface ITask {

    public abstract List<Student> A1() throws Exception;

    public abstract List<Student> A2() throws Exception;

    public abstract List<Student> A3() throws Exception;

    public abstract List<Student> A4() throws Exception;

    public abstract List<String> A5() throws Exception;

    public abstract List<String> A6() throws Exception;

    public abstract Map<String, List<Student>> A7() throws Exception;

    public abstract Map<Gender, List<Student>> A8() throws Exception;

    public abstract long A9() throws Exception;

    public abstract double A10() throws Exception;

    public abstract List<Student> A11() throws Exception;

    public abstract List<Long> A12() throws Exception;

    public abstract List<Student> B1() throws Exception;

    public abstract List<Student> B2() throws Exception;

    public abstract List<Student> B3() throws Exception;

    public abstract List<Student> B4() throws Exception;

    public abstract List<DTO1> B5() throws Exception;

    public abstract List<DTO2> B6() throws Exception;

    public abstract Map<Course, List<Enrollment>> B7() throws Exception;

    public abstract Map<String, List<Student>> B8() throws Exception;

    public abstract Map<Student, Double> B9() throws Exception;

    public abstract Map<Course, Pair<Double>> B10() throws Exception;

    public abstract List<DTO2> B11() throws Exception;

    public abstract Map<Course, List<Student>> B12() throws Exception;

    public abstract Map<Student, Double> C1() throws Exception;

    public abstract List<Student> C2() throws Exception;

    public abstract Map<Student, Double> C3() throws Exception;

    public abstract List<Student> C4() throws Exception;

    public abstract Map<Student, List<Course>> C5() throws Exception;

    public abstract List<DTO2> C6() throws Exception;

    public abstract Map<String, Map<Gender, List<Student>>> C7() throws Exception;

    public abstract Map<Course, Map<String, List<Student>>> C8() throws Exception;

    public abstract Map<String, Double> C9() throws Exception;

    public abstract List<Course> C10() throws Exception;

    public abstract Map<String, List<DTO1>> C11() throws Exception;

    public abstract Map<String, List<DTO1>> C12() throws Exception;

}