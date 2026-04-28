package compotamento.test;

import compotamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroEx {
    private static List<Car> cars = List.of(
            new Car("Prata", 2006),
            new Car("Verde", 2009),
            new Car("Cinza", 1998)
    );
    public static void main(String[] args) {
        System.out.println(filterVerdeCar(cars));
        System.out.println(filterCarByColor(cars, "Cinza"));
        System.out.println(filterCarByColor(cars, "Prata"));
        System.out.println(filterByAge(cars, 2009));
    }

    private static List<Car> filterVerdeCar(List<Car> cars){
        List<Car> greenCars = new ArrayList<>();
        for(Car car : cars){
            if (car.getColor().equals("Verde")){
                greenCars.add(car);
            }
        }
        return greenCars;
    }

    private static List<Car> filterCarByColor(List<Car> cars, String cor){
        List<Car> greenCars = new ArrayList<>();
        for(Car car : cars){
            if (car.getColor().equals(cor)){
                greenCars.add(car);
            }
        }
        return greenCars;
    }
    private static List<Car> filterByAge(List<Car> cars, int year){
        List<Car> greenCars = new ArrayList<>();
        for(Car car : cars){
            if (car.getYear() < year){
                greenCars.add(car);
            }
        }
        return greenCars;
    }
}
