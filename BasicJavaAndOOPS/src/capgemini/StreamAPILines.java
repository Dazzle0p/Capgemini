package capgemini;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamAPILines {
    public static void main(String[] args) {
        List<String> list = List.of("this is a line in java", "we will convert each line to words", "using stream Api is easy", "lamda expressions are used alot");

        // 1st word of each line
        List<String> firstWords = list.stream().map(line -> line.split(" ")[0]).collect(Collectors.toList());
        System.out.println(firstWords);

        // Map of lines with length


        Optional<String> optString = list.stream().reduce((s1,s2) -> s1 + " " + s2);
        System.out.println(optString.get());

    }
}
