package generics.service;

import generics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarroRentavelService {
    private List<Carro> carrosDiposniveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Dobblo")));

    public Carro buscarCarroDisponivel(){
        System.out.println("Buscando carro ...");
        Carro carro = carrosDiposniveis.remove(0);
        System.out.println("Alugando carro: " + carro);
        System.out.println("Carros diponiveis para alugar: ");
        System.out.println(carrosDiposniveis);
        return carro;
    }

    public void retornanrCarroAlugado(Carro carro){
        System.out.println("Devolvendo o carro :" + carro);
        carrosDiposniveis.add(carro);
        System.out.println("Carros dinsponiveis para alugar");
        System.out.println(carrosDiposniveis);
    }
}
