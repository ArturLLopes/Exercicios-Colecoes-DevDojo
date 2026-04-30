package streams.test;

import java.util.List;

public class StreamEx7 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6);

        integers.stream()
                .reduce((x, y) -> x + y)
                .ifPresent(System.out::println);
        System.out.println(integers.stream().reduce(0, (x, y) -> x + y));
        //--------usando um replace de soma
        integers.stream()
                .reduce(Integer::sum)
                .ifPresent(System.out::println);

        integers.stream()
                .reduce((x, y) -> x * y)
                .ifPresent(System.out::println);
        System.out.println(integers.stream().reduce(1, (x, y) -> x * y));

        //-------quantidade total de obj

        integers.stream().reduce((x, y) -> x > y ? x : y ).ifPresent(System.out::println);// se x for maior de y retorna x se nao retorna y
        System.out.println(integers.stream().reduce(Integer::max));
    }
}
