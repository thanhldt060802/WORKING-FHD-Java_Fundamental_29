import java.util.Collection;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import entity.Course;
import entity.Enrollment;
import entity.Student;
import entity.DTO.DTO1;
import entity.DTO.DTO2;
import entity.DTO.Pair;
import enumeration.Gender;
import mockdata.MockData;

public class Task implements ITask {

    private List<Student> students;
    private List<Course> courses;
    private List<Enrollment> enrollments;

    public Task() {
        MockData mockData = new MockData(2025L);
        List<Student> students = mockData.students();
        List<Course> courses = mockData.courses();
        List<Enrollment> enrollments = mockData.enrollments(students, courses);

        this.students = students;
        this.courses = courses;
        this.enrollments = enrollments;
    }

    public void showDataset() {
        System.out.println("Mock data - Student:");
        this.students.forEach(
                (student) -> System.out.println(student));
        System.out.println();
        System.out.println("Mock data - Course:");
        this.courses.forEach(
                (course) -> System.out.println(course));
        System.out.println();
        System.out.println("Mock data - Enrollment:");
        this.enrollments.forEach(
                (enrollment) -> System.out.println(enrollment));
        System.out.println();
    }

    public static void print(Object data) {
        if (data instanceof Collection<?> dataCollection) {
            for (Object element : dataCollection) {
                System.out.println(element);
            }
        } else if (data instanceof Map<?, ?> dataMap) {
            for (Entry<?, ?> entry : dataMap.entrySet()) {
                if (entry.getValue() instanceof Collection<?> dataCollection) {
                    System.out.println(entry.getKey() + ":");
                    print(dataCollection);
                } else if (entry.getValue() instanceof Map<?, ?> nestedDataMap) {
                    System.out.println(entry.getKey() + ":");
                    print(nestedDataMap);
                } else {
                    System.out.println(entry.getKey() + ": " + entry.getValue());
                }
            }
        } else {
            System.out.println(data);
        }
    }

    @Override
    public List<Student> A1() throws Exception {
        List<Student> result = this.students.stream()
                .filter((stu) -> stu.getGender() == Gender.FEMALE)
                .collect(Collectors.toList());

        return result;
    }

    @Override
    public List<Student> A2() throws Exception {
        throw new Exception("You must handle this task");
    }

    @Override
    public List<Student> A3() throws Exception {
        List<Student> result = this.students.stream()
                .sorted(Comparator.<Student, Integer>comparing((stu) -> stu.getAge()))
                .collect(Collectors.toList());

        return result;
    }

    @Override
    public List<Student> A4() throws Exception {
        throw new Exception("You must handle this task");
    }

    @Override
    public List<String> A5() throws Exception {
        List<String> result = this.students.stream()
                .map((stu) -> stu.getName())
                .collect(Collectors.toList());

        return result;
    }

    @Override
    public List<String> A6() throws Exception {
        throw new Exception("You must handle this task");
    }

    @Override
    public Map<String, List<Student>> A7() throws Exception {
        Map<String, List<Student>> result = this.students.stream()
                .collect(Collectors.groupingBy((stu) -> stu.getClassName()));

        return result;
    }

    @Override
    public Map<Gender, List<Student>> A8() throws Exception {
        throw new Exception("You must handle this task");
    }

    @Override
    public long A9() throws Exception {
        long result = this.students.stream()
                .filter((stu) -> stu.getGender() == Gender.FEMALE)
                .count();

        return result;
    }

    @Override
    public double A10() throws Exception {
        Course foundCourse = this.courses.stream()
                .filter((c) -> c.getName().equals("Math"))
                .findFirst()
                .orElse(null);

        double result = this.enrollments.stream()
                .filter((e) -> foundCourse != null && e.getCourseId() == foundCourse.getId())
                .mapToDouble((e) -> e.getScore())
                .average()
                .orElse(0);

        return result;
    }

    @Override
    public List<Student> A11() throws Exception {
        List<Student> result = this.students.stream()
                .filter((stu) -> stu.getGender() == Gender.FEMALE)
                .sorted(Comparator.<Student, Integer>comparing((stu) -> stu.getAge()))
                .collect(Collectors.toList());

        return result;
    }

    @Override
    public List<Long> A12() throws Exception {
        throw new Exception("You must handle this task");
    }

    @Override
    public List<Student> B1() throws Exception {
        Map<Long, Double> mapStudentAvg = this.enrollments.stream()
                .collect(Collectors.groupingBy(
                        (e) -> e.getStudentId(),
                        Collectors.averagingDouble((e) -> e.getScore()))); // Map lookup

        System.out.println("----------------------------------");
        List<Student> result = this.students.stream()
                .filter((stu) -> {
                    System.out.println(stu.getId() + ": " + mapStudentAvg.get(stu.getId()));
                    return mapStudentAvg.get(stu.getId()) >= 8.0;
                })
                .collect(Collectors.toList());
        System.out.println("----------------------------------");

        // Không nên
        // List<Student> result = this.students.stream()
        // .filter((stu) -> this.enrollments.stream()
        // .filter((e) -> e.getStudentId() == stu.getId())
        // .mapToDouble((e) -> e.getScore())
        // .average()
        // .orElse(0) >= 8.0)
        // .collect(Collectors.toList());

        // Không nên
        // List<Student> result = this.enrollments.stream()
        // .collect(Collectors.groupingBy(
        // (e) -> e.getStudentId(),
        // Collectors.averagingDouble((e) -> e.getScore())))
        // .entrySet().stream()
        // .collect(Collectors.toMap(
        // (entry) -> this.students.stream()
        // .filter((stu) -> stu.getId() == entry.getKey())
        // .findFirst()
        // .orElse(null),
        // (entry) -> entry.getValue()))
        // .entrySet().stream()
        // .filter((entry) -> entry.getValue() >= 8.0)
        // .map((entry) -> entry.getKey())
        // .collect(Collectors.toList());

        return result;
    }

    @Override
    public List<Student> B2() throws Exception {
        throw new Exception("You must handle this task");
    }

    @Override
    public List<Student> B3() throws Exception {
        Map<Long, Double> mapStudentAvg = this.enrollments.stream()
                .collect(Collectors.groupingBy(
                        (e) -> e.getStudentId(),
                        Collectors.averagingDouble((e) -> e.getScore())));

        // List<Student> result = this.students.stream()
        // .sorted((s1, s2) -> Double.compare(
        // mapStudentAvg.get(s1.getId()),
        // mapStudentAvg.get(s2.getId())))
        // .collect(Collectors.toList());

        List<Student> result = this.students.stream()
                .sorted(Comparator.<Student, Double>comparing((stu) -> mapStudentAvg.get(stu.getId())))
                .collect(Collectors.toList());

        System.out.println("----------------------------------");
        result.forEach((stu) -> System.err.println(mapStudentAvg.get(stu.getId())));
        System.out.println("----------------------------------");

        return result;
    }

    @Override
    public List<Student> B4() throws Exception {
        Course foundCourse = this.courses.stream()
                .filter((c) -> c.getName().equals("Programming"))
                .findFirst()
                .orElse(null);

        Map<Long, Double> mapStudentProgramming = this.enrollments.stream()
                .filter((enroll) -> foundCourse != null && enroll.getCourseId() == foundCourse.getId())
                .collect(Collectors.toMap((enroll) -> enroll.getStudentId(), (enroll) -> enroll.getScore()));

        List<Student> result = this.students.stream()
                .filter((stu) -> mapStudentProgramming.get(stu.getId()) != null)
                .sorted((s1, s2) -> -Double.compare(
                        mapStudentProgramming.get(s1.getId()),
                        mapStudentProgramming.get(s2.getId())))
                .collect(Collectors.toList());

        System.out.println("----------------------------------");
        result.forEach((stu) -> System.err.println(mapStudentProgramming.get(stu.getId())));
        System.out.println("----------------------------------");

        return result;
    }

    @Override
    public List<DTO1> B5() throws Exception {
        Map<Long, Double> mapStudentAvg = this.enrollments.stream()
                .collect(Collectors.groupingBy(
                        (e) -> e.getStudentId(),
                        Collectors.averagingDouble((e) -> e.getScore())));

        List<DTO1> result = this.students.stream()
                .map((stu) -> new DTO1(stu.getId(), stu.getName(), mapStudentAvg.get(stu.getId())))
                .collect(Collectors.toList());

        return result;
    }

    @Override
    public List<DTO2> B6() throws Exception {
        throw new Exception("You must handle this task");
    }

    @Override
    public Map<Course, List<Enrollment>> B7() throws Exception {
        Map<Long, List<Enrollment>> mapCourseEnroll = this.enrollments.stream()
                .collect(Collectors.groupingBy((enroll) -> enroll.getCourseId()));

        Map<Course, List<Enrollment>> result = this.courses.stream()
                .collect(Collectors.toMap((c) -> c, (c) -> mapCourseEnroll.get(c.getId())));

        return result;
    }

    @Override
    public Map<String, List<Student>> B8() throws Exception {
        Map<Long, Double> mapStudentAvg = this.enrollments.stream()
                .collect(Collectors.groupingBy(
                        (e) -> e.getStudentId(),
                        Collectors.averagingDouble((e) -> e.getScore())));

        Map<String, List<Student>> result = this.students.stream()
                .collect(Collectors.groupingBy((stu) -> {
                    if (mapStudentAvg.get(stu.getId()) < 6.0) {
                        return "<6.0";
                    } else if (mapStudentAvg.get(stu.getId()) >= 6.0 && mapStudentAvg.get(stu.getId()) < 8.0) {
                        return "6.0-<8.0";
                    } else {
                        return ">= 8.0";
                    }
                }));

        return result;
    }

    @Override
    public Map<Student, Double> B9() throws Exception {
        throw new Exception("You must handle this task");
    }

    @Override
    public Map<Course, Pair<Double>> B10() throws Exception {
        // Map<Long, List<Enrollment>> mapCourseEnroll = this.enrollments.stream()
        // .collect(Collectors.groupingBy((enroll) -> enroll.getCourseId()));

        // Map<Course, Pair<Double>> result = this.courses.stream()
        // .collect(Collectors.toMap(
        // (c) -> c,
        // (c) -> new Pair<Double>(
        // mapCourseEnroll.get(c.getId()).stream()
        // .map((enroll) -> enroll.getScore())
        // .max((sc1, sc2) -> Double.compare(sc1, sc2))
        // .orElse(0.0),
        // mapCourseEnroll.get(c.getId()).stream()
        // .map((enroll) -> enroll.getScore())
        // .min((sc1, sc2) -> Double.compare(sc1, sc2))
        // .orElse(0.0))));

        // Map<Course, Pair<Double>> result = this.courses.stream()
        // .collect(Collectors.toMap(
        // (c) -> c,
        // (c) -> {
        // DoubleSummaryStatistics stats = mapCourseEnroll.get(c.getId()).stream()
        // .mapToDouble((enroll) -> enroll.getScore())
        // .summaryStatistics();
        // return new Pair<Double>(stats.getMax(), stats.getMin());
        // }));

        Map<Long, DoubleSummaryStatistics> mapCourseIdStats = this.enrollments.stream()
                .collect(Collectors.groupingBy(
                        (enroll) -> enroll.getCourseId(),
                        Collectors.summarizingDouble((enroll) -> enroll.getScore())));

        Map<Course, Pair<Double>> result = this.courses.stream()
                .collect(Collectors.toMap((c) -> c, (c) -> new Pair<Double>(
                        mapCourseIdStats.get(c.getId()).getMax(),
                        mapCourseIdStats.get(c.getId()).getMin())));

        // Map<Long, Pair<Double>> mapCourseIdPair = this.enrollments.stream()
        // .collect(Collectors.groupingBy(
        // (enroll) -> enroll.getCourseId(),
        // Collectors.summarizingDouble((enroll) -> enroll.getScore())))
        // .entrySet().stream()
        // .collect(Collectors.toMap(
        // (entry) -> entry.getKey(),
        // (entry) -> new Pair<Double>(entry.getValue().getMax(),
        // entry.getValue().getMin())));

        // Map<Course, Pair<Double>> result = this.courses.stream()
        // .collect(Collectors.toMap((c) -> c, (c) -> mapCourseIdPair.get(c.getId())));

        return result;
    }

    @Override
    public List<DTO2> B11() throws Exception {
        throw new Exception("You must handle this task");
    }

    @Override
    public Map<Course, List<Student>> B12() throws Exception {
        throw new Exception("You must handle this task");
    }

    @Override
    public Map<Student, Double> C1() throws Exception {
        throw new Exception("You must handle this task");
    }

    @Override
    public List<Student> C2() throws Exception {
        throw new Exception("You must handle this task");
    }

    @Override
    public Map<Student, Double> C3() throws Exception {
        throw new Exception("You must handle this task");
    }

    @Override
    public List<Student> C4() throws Exception {
        throw new Exception("You must handle this task");
    }

    @Override
    public Map<Student, List<Course>> C5() throws Exception {
        throw new Exception("You must handle this task");
    }

    @Override
    public List<DTO2> C6() throws Exception {
        throw new Exception("You must handle this task");
    }

    @Override
    public Map<String, Map<Gender, List<Student>>> C7() throws Exception {
        throw new Exception("You must handle this task");
    }

    @Override
    public Map<Course, Map<String, List<Student>>> C8() throws Exception {
        throw new Exception("You must handle this task");
    }

    @Override
    public Map<String, Double> C9() throws Exception {
        throw new Exception("You must handle this task");
    }

    @Override
    public List<Course> C10() throws Exception {
        throw new Exception("You must handle this task");
    }

    @Override
    public Map<String, List<DTO1>> C11() throws Exception {
        throw new Exception("You must handle this task");
    }

    @Override
    public Map<String, List<DTO1>> C12() throws Exception {
        throw new Exception("You must handle this task");
    }

}