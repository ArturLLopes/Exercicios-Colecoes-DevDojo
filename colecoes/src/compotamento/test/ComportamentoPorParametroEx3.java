package compotamento.test;

import compotamento.dominio.Car;
import compotamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroEx3 {
    private static List<Car> cars = List.of(
            new Car("Prata", 2006),
            new Car("Verde", 2009),
            new Car("Cinza", 1998)
    );
    public static void main(String[] args) {
        List<Car> greenCars = filter(cars, car -> car.getColor().equals("Verde"));
        List<Car> ageCars = filter(cars, car -> car.getYear() < 2009);
        System.out.println(greenCars);
        System.out.println(ageCars);
    }

        //-------------------------*************------------------------------
        //Uso de uma lista generica para qualquer parametros que quiser
        // com genericos e a interface Predicate do java.util

    private static <T> List<T> filter(List<T> list , Predicate<T> predicate){
        List<T> filtererList = new ArrayList<>();
        for (T e : list){
            if (predicate.test(e)){
                filtererList.add(e);
            }
        }
        return filtererList;
    }
}
