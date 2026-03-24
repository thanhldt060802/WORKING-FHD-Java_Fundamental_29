import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.LongBinaryOperator;
import java.util.function.LongUnaryOperator;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Main {

    public static void main(String[] args) {

        // List<String> list = Arrays.asList("Java", "Python", "Ruby", "C++", "Javascript");

        // forEach(list, str -> {
        //     System.out.println(str.toUpperCase());
        //     System.out.println(str.toLowerCase());
        // });

        // Map<Integer, String> map = new HashMap<Integer, String>();
		// map.put(1, "Java");
		// map.put(2, "C#");
		// map.put(3, "Python");
		// map.put(4, "Javascript");

		// Main.forEach(map, (k, v) -> {
		// 	System.out.println(k + ": " + v);
		// });

        // List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		// List<Integer> result = Main.filter(list, (e) -> {
		// 	return e % 2 == 0;
		// });
		// System.out.println(result);

        // List<String> list = Arrays.asList("Java", "Python", "Ruby", "C++", "Javascript");

        // List<Integer> result = map(list, (str) -> str.length());
        // System.out.println(result);

        // List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        // List<Integer> result = map(list, (n) -> n * n);
        // System.out.println(result);

        // List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        // List<Double> result = map(list, (n) -> Math.sqrt(n));
        // System.out.println(result);

        // Map<Integer, Double> map = new HashMap<Integer, Double>();
		// map.put(2, Math.sqrt(2));
		// map.put(4, Math.sqrt(4));
		// map.put(6, Math.sqrt(6));

		// List<String> result = Main.map(map, (k, v) -> {
		// 	return String.format("SQRT(%d) = %f", k, v);
		// });
		// for(String s : result) {
		// 	System.out.println(s);
		// }

        // List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

		// List<Integer> result = Main.map(list, (n) -> n * n);
		// System.out.println(result);

        // List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

		// Integer result = Main.reduce(list, (e1, e2) -> {
		// 	return e1 + e2;
		// });
		// System.out.println(result);

        List<Integer> list = Arrays.asList(5, 2, 4, 6, 3, 4, 1, 8, 7, 4);

        List<Integer> result = sorted(list, (n1, n2) -> n1 - n2);
        System.out.println(result);

    }

    public static <T> void forEach(List<T> list, Consumer<T> consumer) {
		for(T e : list) {
			consumer.accept(e);
		}
	}

    public static <T, U> void forEach(Map<T, U> map, BiConsumer<T, U> biConsumer) {
		for(Entry<T, U> entry : map.entrySet()) {
			biConsumer.accept(entry.getKey(), entry.getValue());
		}
	}

    public static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
		List<T> result = new ArrayList<T>();
		for(T e : list) {
			if(predicate.test(e)) {
				result.add(e);
			}
		}
		return result;
	}

    public static <T, R> List<R> map(List<T> list, Function<T, R> function) {
		List<R> result = new ArrayList<R>();
		for(T e : list) {
			result.add(function.apply(e));
		}
		return result;
	}

    public static <T, U, R> List<R> map(Map<T, U> map, BiFunction<T, U, R> biFunction) {
		List<R> result = new ArrayList<R>();
		for(Entry<T, U> entry : map.entrySet()) {
			result.add(biFunction.apply(entry.getKey(), entry.getValue()));
		}
		return result;
	}

    public static <T> List<T> map(List<T> list, UnaryOperator<T> unaryOperator) {
		List<T> result = new ArrayList<T>();
		for(T e : list) {
			result.add(unaryOperator.apply(e));
		}
		return result;
	}

    public static <T> T reduce(List<T> list, BinaryOperator<T> binaryOperator) {
		T result = null;
		if(list.size() > 0) {
			result = list.get(0);
            for(int i = 1; i < list.size(); i++) {
				result = binaryOperator.apply(result, list.get(i));
			}
		}
		return result;
	}

    public static <T> List<T> sorted(List<T> list, Comparator<T> comparator) {
		List<T> result = new ArrayList<T>();
		for(T e : list) {
			result.add(e);
		}
		for(int i = 0; i < result.size() - 1; i++) {
			int minIndex = i;
			for(int j = i + 1; j < result.size(); j++) {
				if(comparator.compare(result.get(minIndex), result.get(j)) > 0) {
					minIndex = j;
				}
			}
			T temp = result.get(minIndex);
			result.set(minIndex, result.get(i));
			result.set(i, temp);
		}
		return result;
	}

}
