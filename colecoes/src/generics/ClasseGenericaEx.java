package generics;

import generics.dominio.Carro;
import generics.service.CarroRentavelService;

public class ClasseGenericaEx {
    public static void main(String[] args) {
        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro = carroRentavelService.buscarCarroDisponivel();

        System.out.println("Usando o carro...");
        carroRentavelService.retornanrCarroAlugado(carro);

    }
}
