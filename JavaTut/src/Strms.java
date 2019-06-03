// Streams
import java.util.*;


import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Strms {

    public static void main(String[] args) {

        List<Integer> oneto10 = IntStream.rangeClosed(1,10).boxed().collect(Collectors.toList());
        List<Integer> squares = oneto10.stream().map(x -> x*x).collect(Collectors.toList());
        for(Integer x : squares) System.out.println(x);

        List<Integer> evens = oneto10.stream().filter(x -> (x % 2) == 0).collect(Collectors.toList());
        for(Integer x : evens) System.out.println(x);

        IntStream limitTo5 = IntStream.range(1,10).limit(5);
        limitTo5.forEach(System.out::println);

        int multAll = IntStream.range(1,5).reduce(1, (x,y) -> x * y);
        System.out.println(multAll);

        //DoubleStream stream = IntStream.range(1,5).mapToDouble((i -> i));

    }
}
