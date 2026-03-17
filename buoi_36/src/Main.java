import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Map.Entry;

import ldtt_package.App;

public class Main {

    public static void main(String[] args) {

        // HashSet<String> set = new HashSet<>();
        // set.add("A1");
        // set.add("A2");
        // set.add("A3");
        // set.add("A1");
        // set.add("A4");
        // set.add("A5");
        // set.add("A2");
        // set.add("A6");
        // System.out.println(set);
        
        // HashSet<Student> students = new HashSet<Student>();
		// students.add(new Student("ABC", "A", 19));
		// students.add(new Student("BAC", "B", 25));
		// students.add(new Student("AAA", "C", 23));
		// students.add(new Student("BCA", "D", 20));
		// students.add(new Student("ABC", "E", 21));
		// for(Student s : students) {
		// 	System.out.println(s);
		// }

        // LinkedHashSet<Student> students = new LinkedHashSet<Student>();
		// students.add(new Student("ABC", "A", 19));
		// students.add(new Student("BAC", "B", 25));
		// students.add(new Student("AAA", "C", 23));
		// students.add(new Student("BCA", "D", 20));
		// students.add(new Student("ABC", "E", 21));
		// for(Student s : students) {
		// 	System.out.println(s);
		// }
        // System.out.println(students.getFirst());
        // System.out.println(students.getLast());

        // HashMap<String, Integer> map = new HashMap<>();
        // map.put("ABC", 10);
        // map.put("BAC", 20);
        // map.put("AAA", 30);
        // map.put("CAB", 40);
        // map.put("ABC", 100);
        // Set<Entry<String, Integer>> entries = map.entrySet();
        // for (Entry<String, Integer> entry : entries) {
        //     System.out.printf("Key: %s, value: %d\n", entry.getKey(), entry.getValue());
        // }

        // System.out.println(map.get("AAA"));

        // System.out.println();
        // map.remove("AAA");
        // for (Entry<String, Integer> entry : entries) {
        //     System.out.printf("Key: %s, value: %d\n", entry.getKey(), entry.getValue());
        // }

        // System.out.println(map.keySet());
        // ArrayList<Integer> list = new ArrayList<>(map.values());
        // System.out.println(list);

        // LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        // map.put("ABC", 10);
        // map.put("BAC", 20);
        // map.put("AAA", 30);
        // map.put("CAB", 40);
        // Set<Entry<String, Integer>> entries = map.entrySet();
        // for (Entry<String, Integer> entry : entries) {
        //     System.out.printf("Key: %s, value: %d\n", entry.getKey(), entry.getValue());
        // }

        // App app = new App();
        // app.run(new FileDataLoader("excel"));
        // app.run(new DatabaseDataLoader());

        Student[] students = new Student[] {
            new Student("S01", "B", 18),
            new Student("S02", "D", 17),
            new Student("S03", "E", 19),
            new Student("S04", "A", 20),
            new Student("S05", "B", 19),
            new Student("S06", "D", 21),
            new Student("S07", "C", 16),
            new Student("S08", "B", 20),
        };
        // Arrays.sort(students, new StudentAgeComparator());

        // Comparator<Student> lambdaComparator = (s1, s2) -> {
        //     return s1.age - s2.age;
        // };
        // Arrays.sort(students, lambdaComparator);

        Arrays.sort(students, (s1, s2) -> {
            return s1.age - s2.age;
        });

        for (Student stu : students) {
            System.out.println(stu);
        }

    }

    // public static int hash(int n) {
    //     return n % 7;
    // }

}
