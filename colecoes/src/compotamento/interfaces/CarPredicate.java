package compotamento.interfaces;

import compotamento.dominio.Car;

public interface CarPredicate {
    boolean test(Car car);
}
