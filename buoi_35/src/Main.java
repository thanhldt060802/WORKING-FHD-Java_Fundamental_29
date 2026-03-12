import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {

        // ArrayList<String> al = new ArrayList<>();
        // al.add("Java");
        // al.add("C#");
        // al.add("Python");
        // al.add("C++");
        // al.add("Ruby");
        // System.out.println(al);

        // System.out.println(al.remove(new Student("S02")));
        // System.out.println(al);

        // ArrayList<Student> students = new ArrayList<Student>();
		// students.add(new Student("S01", "A", 19));
		// students.add(new Student("S02", "B", 25));
		// students.add(new Student("S03", "C", 23));
		// for(Student s : students) {
		// 	System.out.println(s);
		// }
		
		// System.out.println();
		// students.remove("S02");
		// for(Student s : students) {
		// 	System.out.println(s);
		// }
        
        // Student s2 = new Student("S02", "B", 25);
        // System.out.println("S02".equals(s2));

        // Queue<Student> students = new LinkedList<Student>();
		// students.offer(new Student("S01", "A", 19));
		// students.offer(new Student("S02", "B", 25));
		// students.offer(new Student("S03", "C", 23));
		// // for(Student s : students) {
		// // 	System.out.println(s);
		// // }

        // while(!students.isEmpty()) {
		// 	System.out.println(students.poll());
		// }

        // Comparator<Integer> c = (n1, n2) -> {
        //     return -(n1 - n2);
        // };

        // PriorityQueue<Integer> pq = new PriorityQueue<>(c);
        // pq.offer(19);
        // pq.offer(29);
        // pq.offer(14);
        // pq.offer(18);
        // pq.offer(11);
        // pq.offer(5);
        // pq.offer(21);
        // pq.offer(13);
        // while(!pq.isEmpty()) {
		// 	System.out.println(pq.poll());
		// }

        Comparator<Student> c = (s1, s2) -> {
            return -(s1.age - s2.age);
        };

        PriorityQueue<Student> pq = new PriorityQueue<>(c);
        pq.offer(new Student("S01", "A", 19));
		pq.offer(new Student("S02", "B", 25));
		pq.offer(new Student("S03", "C", 23));
		pq.offer(new Student("S04", "D", 20));

        while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}

    }
    
}
