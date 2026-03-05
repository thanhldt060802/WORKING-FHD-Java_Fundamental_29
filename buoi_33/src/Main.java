import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        // Box<String> box1 = new Box<String>("Le Dao Tan Thanh");
        // System.out.println(box1.getValue().toUpperCase());

        // Box<Integer> box2 = new Box<Integer>(100);
        // System.out.println(box2.getValue() * box2.getValue());

        // Box box = new Box<>(3.14);
        // Box<Object> box = new Box<>(3.14) -> Object value = 3.14 -> Có các tính chất của Object, Number, Double
        // System.out.println((Double)box.getValue() * (Double)box.getValue());
        // if (box.getValue() instanceof Integer) {
        //     Integer parseValue = (Integer)box.getValue();
        //     System.out.println(parseValue * parseValue);
        // }
        // if (box.getValue() instanceof Double) {
        //     Double parseValue = (Double)box.getValue();
        //     System.out.println(parseValue * parseValue);
        // }

        // Box box1 = new Box("Le Dao Tan Thanh");
        // Box box2 = new Box(100);

        // String str = (String)box1.getValue();
        // str.toUpperCase();

        // MyAbstractClass obj1 = new MyClass1(null, null);
        // MyAbstractClass obj2 = new MyClass2(null, null);

        // obj1.feature();
        // obj2.feature();

        // MyAbstractClass obj1 = new MyAbstractClass("ABC") {
        //     @Override
        //     public void feature() {
        //         System.out.println("Hello world!");
        //     }
        // };
        // obj1.feature();

        // MyInterface obj = new MyInterface() {
        //     @Override
        //     public void feature1() {
        //         // TODO Auto-generated method stub
                
        //     }

        //     @Override
        //     public void feature2() {
        //         // TODO Auto-generated method stub
                
        //     }
        // };

        // MyFunctionalInterface obj = new MyFunctionalInterface() {
        //     @Override
        //     public void feature() {
        //         System.out.println("Hello world");
        //     }
        // };
        // obj.feature();

        // MyFunctionalInterface obj = () -> {
        //     System.out.println("Hello world");
        // };
        // obj.feature();

        // MyFunctionalInterface obj = () -> {
        //     return "Goodbye world";
        // };
        // System.out.println(obj.feature());

        // MyFunctionalInterface obj = (x1, x2) -> {
        //     return x1 * x2;
        // };
        // System.out.println(obj.feature(9, 5));

        String[] strings = new String[] {
            "45124541",
            "125124134",
            "41251254124",
            "1241242151",
            "1241235",
            "35273456",
            "523423723",
            "37845834734",
            "123512362347",
            "34672372",
        };
        Comparator<String> c = (str1, str2) -> {
            return sumOfDigit(str1) - sumOfDigit(str2);
        };
        Arrays.sort(strings, c);
        for (String str : strings) {
            System.out.println(str + " " + sumOfDigit(str));
        }
        
    }

    public static int sumOfDigit(String str) {
        int sum = 0;
        for (char c : str.toCharArray()) {
            sum += c - '0';
        }
        return sum;
    }
    
}
