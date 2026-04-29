package lambdas;

import java.util.List;
import java.util.function.Consumer;

public class LambdaEx {
    public static void main(String[] args) {
        List<String> string = List.of("Artur", "Rosangela", "Mauricio");
        forEach(string,(String s) -> System.out.println(s));//lambda
        forEach(string, System.out::println);//refatoração do metodo

    }
    private static <T> void forEach(List<T> list, Consumer<T> consumer){
        for (T e : list){
            consumer.accept(e);
        }
    }
}
