package generics;

import generics.dominio.Barco;
import generics.dominio.Carro;
import generics.service.GenericsRentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaEx3 {
    public static void main(String[] args) {
        List<Carro> carrosDiposniveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Dobblo")));
        List<Barco> barcosDiposniveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));

        GenericsRentalService<Carro> rentalService = new GenericsRentalService<>(carrosDiposniveis);
        Carro carro = rentalService.buscarObjDisponivel();
        System.out.println("Usando o carro...");
        rentalService.retornarObjAlugado(carro);

        GenericsRentalService<Barco> rentalServiceBarco = new GenericsRentalService<>(barcosDiposniveis);
        Barco barco = rentalServiceBarco.buscarObjDisponivel();
        System.out.println("Usando o barco...");
        rentalServiceBarco.retornarObjAlugado(barco);

    }

}
