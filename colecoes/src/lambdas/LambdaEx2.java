package lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaEx2 {
    public static void main(String[] args) {
        List<String> string = List.of("Artur", "Rosangela", "Mauricio");
        List<Integer> integers = map(string, (String s) -> s.length());
        List<String> map = map(string, s -> s.toUpperCase());
        System.out.println(integers);
        System.out.println(map);

    }
    //metodo generico vai receber um Tipo e vai ter um Retorno com uma lista R e recebe o parametro uma lista T
    private static <T, R> List<R> map(List<T> list, Function<T, R> function){
        List<R> result = new ArrayList<>();
        for (T e : list){
            R r = function.apply(e);
            result.add(r);
        }

        return result;
    }
}
