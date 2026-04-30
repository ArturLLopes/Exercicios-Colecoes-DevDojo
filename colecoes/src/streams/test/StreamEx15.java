package streams.test;

import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamEx15 {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        long num = 10_000_000;
        sumFor(num);
        sumStreamInterate(num);
        sumStreamParallelInterate(num);
        sumLongStreamlInterate(num);
        sumLongStreamPrallellInterate(num);

    }

    private static void sumFor(long num){
        System.out.println("Sum for");
        long result = 0;
        long init = System.currentTimeMillis();
        for (long i = 1; i <= num; i++) {
            result += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }
    private static void sumStreamInterate(long num){
        System.out.println("sum Stream Interate ");
        long init = System.currentTimeMillis();
        Long result = Stream.iterate(1L, i -> +i).limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }
    private static void sumStreamParallelInterate(long num){
        System.out.println("sum Stream Parallel Interate ");
        long init = System.currentTimeMillis();
        Long result = Stream.iterate(1L, i -> +i).limit(num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void sumLongStreamlInterate(long num){
        System.out.println("sum Long Stream Interate ");
        long init = System.currentTimeMillis();
        Long result = LongStream.rangeClosed(1l, num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }
    private static void sumLongStreamPrallellInterate(long num){
        System.out.println("sum Long Stream paralle Interate ");
        long init = System.currentTimeMillis();
        Long result = LongStream.rangeClosed(1l, num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }
}
