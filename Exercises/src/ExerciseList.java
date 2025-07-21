import java.util.*;

public class ExerciseList {

    public static void main(String[] args){

        List<String> names = Arrays.asList("Alice", "Bob", "Alice", "David", "Bob");

        // TODO: Print the original list



        System.out.println(names);


        // TODO: Convert the list to a LinkedHashSet to remove duplicates while preserving order

        Set<String> s = new LinkedHashSet<>();

        s.addAll(names);

        // TODO: Print the set of unique names

        System.out.println(s);


    }

}