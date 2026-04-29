package optional;

import java.util.List;
import java.util.Optional;

public class OptionalEx {
    public static void main(String[] args) {
        Optional<String> obj = Optional.of("Estudando");
        Optional<String> obj1 = Optional.ofNullable(null);
        Optional<String> obj2 = Optional.empty();

        System.out.println(obj);
        System.out.println(obj1);
        System.out.println(obj2);

//        Optional<String> nameOptional = Optional.ofNullable(findName("Artur"));
        Optional<String> nameOptional = findName("Artur");
        String empt = nameOptional.orElse("EMPTY");
        System.out.println(empt);
        nameOptional.ifPresent(s -> System.out.println(s.toUpperCase()));


    }
    private static Optional<String> findName(String name){
        List<String> list = List.of("Artur", "Diego");
        int i = list.indexOf(name);
        if (i != 1){
//            return list.get(i);
            return Optional.of(list.get(i));
        }
//        return null;
        return Optional.empty();
    }
}
