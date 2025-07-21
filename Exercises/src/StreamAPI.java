import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static java.lang.System.*;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
        Stream<Integer> s1 = nums.stream();
        Collections.reverse(nums);

        s1.forEach(n -> out.println(n));

        System.out.println("**************** /n");


        Stream<Integer> s2 = nums.stream()
                .filter(n -> n%2==0)
                .map(n -> n*2);

        s2.forEach(n -> out.println(n));


        System.out.println("**************** /n");

        int res = nums.stream()
                .filter(n -> n%2==0)
                .map(n -> n*2)
                .reduce(0,(c,e) -> c+e+1);

        System.out.println(res);

        System.out.println("**************** /n");

        Stream<Integer> s4 = nums.stream()
                .sorted();

        s4.forEach(n -> out.println(n));


    }
}
