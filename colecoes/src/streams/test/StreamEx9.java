package streams.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx9 {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 50)//do 1 ao 50
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.print(n + " "));

        Stream.of("Gomu", "No", "Gomu", "Mi")
                .map(String::toUpperCase)
                .forEach(s -> System.out.println(s + " "));

        int num[] = {1, 2, 3, 4, 5};
        Arrays.stream(num)
                .average()
                .ifPresent(System.out::println);

        //trabalhando com files


        try (Stream<String> lines = Files.lines(Paths.get("file.txt"))) {
            lines.filter(l -> l.contains("java"))
                    .forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
