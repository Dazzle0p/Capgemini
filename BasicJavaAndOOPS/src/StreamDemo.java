import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> list = List.of(23,32,43,35,54,65,67,87);
        Stream<Integer> stream = list.stream();

        boolean allMatch = stream.allMatch(x -> x >= 10);
        System.out.println("All greater than 10 " + allMatch);

        boolean anyMatch = list.stream().anyMatch(x -> x >= 90);
        System.out.println("Any above 90 "+ anyMatch);

        System.out.println(list.stream().count());
    }
}
