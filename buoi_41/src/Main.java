import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        list.add(new Student("412", "Tran Van A", 19, "A2", 7.9));
        list.add(new Student("132", "Nguyen Thi B", 21, "A3", 8.9));
        list.add(new Student("245", "Le Van D", 23, "A1", 6.9));
        list.add(new Student("642", "Tran Thi A", 22, "A2", 7.5));
        list.add(new Student("536", "Nguyen Van C", 22, "A1", 8.9));
        list.add(new Student("315", "Le Van D", 23, "A1", 9.6));
        list.add(new Student("531", "Nguyen Van C", 21, "A2", 5.9));
        list.add(new Student("431", "Tran Thi B", 22, "A3", 8.5));
        list.add(new Student("267", "Le Thi D", 19, "A3", 7.7));
        list.add(new Student("647", "Tran Van C", 20, "A1", 9.9));

        // Map<String, List<Student>> result = list.stream()
        // .collect(Collectors.groupingBy((stu) -> stu.getClassName()));

        // result.forEach((k, v) -> {
        // System.out.println("Key: " + k);
        // v.forEach((stu) -> System.out.println(stu));
        // });

        // for (Entry<String, List<Student>> entry : result.entrySet()) {
        // System.out.println("Key: " + entry.getKey());
        // for (Student stu : entry.getValue()) {
        // System.out.println(stu);
        // }
        // }

        // Map<String, Double> result = list.stream()
        // .collect(Collectors.groupingBy(
        // (stu) -> stu.getClassName(),
        // Collectors.averagingDouble((stu) -> stu.getAvg())
        // ));

        // result.forEach((k, v) -> System.out.println("Key: " + k + ", value: " + v));

        // Map<String, Double> result = list.stream()
        // .collect(Collectors.groupingBy(
        // (stu) -> stu.getClassName(),
        // () -> new LinkedHashMap<>(),
        // Collectors.averagingDouble((stu) -> stu.getAvg())
        // ));

        // result.forEach((k, v) -> System.out.println("Key: " + k + ", value: " + v));

        // Map<String, Map<Integer, List<Student>>> result = list.stream()
        // .collect(Collectors.groupingBy(
        // (stu) -> stu.getClassName(),
        // Collectors.groupingBy((stu) -> stu.getAge())
        // ));

        // result.forEach((k1, v1) -> {
        // System.out.println("Key class name: " + k1);
        // v1.forEach((k2, v2) -> {
        // System.out.println("Key age: " + k2);
        // v2.forEach((stu) -> System.out.println(stu));
        // });
        // System.out.println();
        // });

        // for (Entry<String, Map<Integer, List<Student>>> entry : result.entrySet()) {
        // System.out.println("Key class name: " + entry.getKey());
        // for (Entry<Integer, List<Student>> nestedEntry : entry.getValue().entrySet())
        // {
        // System.out.println("Key age: " + nestedEntry.getKey());
        // for (Student stu : nestedEntry.getValue()) {
        // System.out.println(stu);
        // }
        // }
        // System.out.println();
        // }

        // Map<String, List<String>> result = list.stream()
        // .collect(Collectors.groupingBy(
        // (stu) -> stu.getClassName(),
        // Collectors.mapping((stu) -> stu.getName(), Collectors.toList())
        // ));

        // result.forEach((k, v) -> {
        // System.out.println("Key: " + k);
        // v.forEach((stu) -> System.out.println(stu));
        // });

        // List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        // Integer result = list.stream().reduce((n1, n2) -> n1 * n2).orElse(null);
        // System.out.println(result);

        // Student result = list.stream().findAny().orElse(null);
        // System.out.println(result);

        // boolean result = list.stream().anyMatch((stu) -> stu.getAge() > 21);
        // System.out.println(result);

        // boolean result = list.stream().allMatch((stu) -> stu.getAge() > 18);
        // System.out.println(result);

        // boolean result = list.stream().noneMatch((stu) -> stu.getAge() > 25);
        // System.out.println(result);

        // Student result = list.stream().min((stu1, stu2) -> stu1.getAge() -
        // stu2.getAge()).orElse(null);
        // System.out.println(result);

        // Student result = list.stream().max((stu1, stu2) -> stu1.getAge() -
        // stu2.getAge()).orElse(null);
        // System.out.println(result);

        // double result = list.stream().mapToDouble((stu) -> stu.getAvg()).sum();
        // System.out.println(result);

        // double result = list.stream().mapToDouble((stu) ->
        // stu.getAvg()).average().orElse(0);
        // System.out.println(result);

        // DoubleSummaryStatistics result = list.stream().mapToDouble((stu) ->
        // stu.getAvg()).summaryStatistics();
        // System.out.println(result);
        // System.out.println(result.getCount());
        // System.out.println(result.getSum());
        // System.out.println(result.getMin());
        // System.out.println(result.getMax());
        // System.out.println(result.getAverage());

        List<Student> result = list.stream()
                .sorted(
                        Comparator.<Student, Integer>comparing((stu) -> -stu.getAge())
                                .thenComparing((stu) -> stu.getClassName()))
                .toList();

        for (Student stu : result) {
            System.out.println(stu);
        }

    }

}
