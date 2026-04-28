package compotamento.test;

import compotamento.dominio.Car;
import compotamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroEx2 {
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

    private static List<Car> filter(List<Car> cars, CarPredicate carPredicate) {
        List<Car> filterCar = new ArrayList<>();
        for (Car car : cars) {
            if (carPredicate.test(car)) {
                filterCar.add(car);
            }
        }
        return filterCar;
    }
}
