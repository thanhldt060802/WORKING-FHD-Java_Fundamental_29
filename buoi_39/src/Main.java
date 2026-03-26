import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<TripleNumber> list = new ArrayList<TripleNumber>();
        list.add(new TripleNumber(4, 2, 5));
        list.add(new TripleNumber(2, 3, 1));
        list.add(new TripleNumber(4, 5, 1));
        list.add(new TripleNumber(3, 6, 2));
        list.add(new TripleNumber(1, 5, 3));
        list.add(new TripleNumber(4, 3, 1));
        list.add(new TripleNumber(3, 2, 3));
        list.add(new TripleNumber(1, 5, 6));
        list.add(new TripleNumber(3, 5, 4));
        list.add(new TripleNumber(2, 2, 3));

        // List<TripleNumber> result = list.stream().filter((e) -> {
        // return e.n1 % 2 == 0;
        // }).toList();

        // List<TripleNumber> result = list.stream()
        // .filter(
        // (e) -> {
        // if (e.n1 % 2 == 0) {
        // return true;
        // } else {
        // return false;
        // }
        // })
        // .toList();

        // System.out.println("Data before processing:");
        // for (TripleNumber tn : list) {
        // System.out.println(tn);
        // }
        // System.out.println("Data after processing:");
        // for (TripleNumber tn : result) {
        // System.out.println(tn);
        // }

        // Function<TripleNumber, Integer> f = (e) -> {
        // return e.n1 + e.n2 + e.n3;
        // };

        // List<Integer> result = list.stream()
        // .map((e) -> {
        // return e.n1 + e.n2 + e.n3;
        // })
        // .toList();

        // System.out.println("Data before processing:");
        // for (TripleNumber tn : list) {
        // System.out.println(tn);
        // }
        // System.out.println("Data after processing:");
        // for (Integer n : result) {
        // System.out.println(n);
        // }

        // List<Double> result = list.stream()
        // .map((e) -> {
        // return (e.n1 + e.n2 + e.n3) / 3.0;
        // })
        // .toList();

        // System.out.println("Data before processing:");
        // for (TripleNumber tn : list) {
        // System.out.println(tn);
        // }
        // System.out.println("Data after processing:");
        // for (Double n : result) {
        // System.out.println(n);
        // }

        // List<List<TripleNumber>> list2d = new ArrayList<List<TripleNumber>>();
        // list2d.add(new ArrayList<TripleNumber>());
        // list2d.get(0).add(new TripleNumber(4, 2, 5));
        // list2d.get(0).add(new TripleNumber(2, 3, 1));
        // list2d.get(0).add(new TripleNumber(4, 5, 1));
        // list2d.add(new ArrayList<TripleNumber>());
        // list2d.get(1).add(new TripleNumber(3, 6, 2));
        // list2d.get(1).add(new TripleNumber(1, 5, 3));
        // list2d.get(1).add(new TripleNumber(4, 3, 1));
        // list2d.add(new ArrayList<TripleNumber>());
        // list2d.get(2).add(new TripleNumber(3, 2, 3));
        // list2d.get(2).add(new TripleNumber(1, 5, 6));
        // list2d.get(2).add(new TripleNumber(3, 5, 4));
        // list2d.get(2).add(new TripleNumber(2, 2, 3));

        // List<List<Integer>> list2d = new ArrayList<List<Integer>>();

        // List<Integer> list1d_1 = new ArrayList<Integer>();
        // list1d_1.add(2);
        // list1d_1.add(4);
        // list1d_1.add(6);
        // List<Integer> list1d_2 = new ArrayList<Integer>();
        // list1d_2.add(1);
        // list1d_2.add(3);
        // list1d_2.add(5);
        // List<Integer> list1d_3 = new ArrayList<Integer>();
        // list1d_3.add(10);
        // list1d_3.add(20);
        // list1d_3.add(30);

        // list2d.add(list1d_1);
        // list2d.add(list1d_2);
        // list2d.add(list1d_3);

        // System.out.println(list2d);

        // Function<List<Integer>, Stream<Integer>> f = (list1d) -> {
        //     return list1d.stream();
        // };

        // List<Integer> result = list2d.stream()
        //         .flatMap(f)
        //         .toList();
        
        // System.out.println(result);

        // Function<List<Integer>, Stream<Double>> f = (list1d) -> {
        //     return list1d.stream().map((n) -> Math.sqrt(n));
        // };

        // List<Double> result = list2d.stream()
        //         .flatMap(f)
        //         .toList();
        
        // System.out.println(result);

        // List<TripleNumber> result = list.stream()
        // .sorted((e1, e2) -> {
		// 	int n1Comparing = e1.n1 - e2.n1;
        //     if (n1Comparing != 0) {
        //         return n1Comparing;
        //     }

        //     int n2Comparing = -(e1.n2 - e2.n2);
        //     if (n2Comparing != 0) {
        //         return n2Comparing;
        //     }

        //     return -(e1.n3 - e2.n3);
		// })
        // .toList();

        // System.out.println("Data before processing:");
		// for(TripleNumber tn : list) {
		// 	System.out.println(tn);
		// }
		// System.out.println("Data after processing:");
		// for(TripleNumber tn : result) {
		// 	System.out.println(tn);
		// }

        // List<TripleNumber> result = list.stream().distinct().toList();
		
		// System.out.println("Data before processing:");
		// for(TripleNumber tn : list) {
		// 	System.out.println(tn);
		// }
		// System.out.println("Data after processing:");
		// for(TripleNumber tn : result) {
		// 	System.out.println(tn);
		// }

        // List<Integer> numbers = Arrays.asList(1, 2, 3, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8, 9);

        // List<Integer> result = numbers.stream().distinct().toList();

        // System.out.println(numbers);
        // System.out.println(result);

        // List<TripleNumber> result = list.stream().limit(5).toList();
		
		// System.out.println("Data before processing:");
		// for(TripleNumber tn : list) {
		// 	System.out.println(tn);
		// }
		// System.out.println("Data after processing:");
		// for(TripleNumber tn : result) {
		// 	System.out.println(tn);
		// }
		
		// List<TripleNumber> result = list.stream().skip(5).toList();
		 
		// System.out.println("Data before processing:");
		// for(TripleNumber tn : list) {
		// 	System.out.println(tn);
		// }
		// System.out.println("Data after processing:");
		// for(TripleNumber tn : result) {
		// 	System.out.println(tn);
		// }

        // List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);

        // List<Integer> result1 = numbers.stream().limit(5).toList();
        // List<Integer> result2 = numbers.stream().skip(5).toList();
        // List<Integer> result3 = numbers.stream().skip(5).limit(5).toList();

        // System.out.println(numbers);
        // System.out.println(result1);
        // System.out.println(result2);
        // System.out.println(result3);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);

        int numberItemOfPage = 6;
        int numberOfPage = 3;

        List<Integer> result = numbers.stream()
        .skip((numberOfPage - 1) * numberItemOfPage)
        .limit(numberItemOfPage)
        .toList();

        System.out.println(result);

    }

}
