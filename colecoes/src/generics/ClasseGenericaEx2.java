package generics;

import generics.dominio.Barco;
import generics.dominio.Carro;
import generics.service.BarcoRentavelService;
import generics.service.CarroRentavelService;

public class ClasseGenericaEx2 {
    public static void main(String[] args) {
        BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
        Barco barco = barcoRentavelService.buscarBarcoDisponivel();

        System.out.println("Usando o carro...");
        barcoRentavelService.retornanrBarcoAlugado(barco);

    }
}
