import java.util.*;
import java.util.stream.*;

public class StreamExercise {
    public static void main(String[] args) {

        List<String> products = Arrays.asList("Laptop", "Pen", "Notebook", "Headphones", "Smartphone");

        // TODO: Print the original list
        System.out.println(products);

        // TODO: Filter names longer than 5 characters, convert to uppercase, sort, and collect into a list

        Stream<String> s1 = products.stream()
                .filter(n -> n.length() > 5)
                .map(String::toUpperCase)
                .sorted();
        List<String> l = s1.toList();
        // TODO: Print the filtered list

        System.out.println(l);
    }
}
