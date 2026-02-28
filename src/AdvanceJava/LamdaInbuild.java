package capgemini;

import java.util.function.Consumer;

public class LamdaInbuild {
    public static void main(String[] args) {
        Consumer<String> consumer = (str) -> {
            System.out.println("This is consumer");
            System.out.println("This is consuming");
        };

        consumer.accept("SPRING FRAMEWORK");

    }

}
