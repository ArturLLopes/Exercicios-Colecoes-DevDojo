package generics.service;

import generics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class BarcoRentavelService {
    private List<Barco> barcosDiposniveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));

    public Barco buscarBarcoDisponivel(){
        System.out.println("Buscando Barco ...");
        Barco Barco = barcosDiposniveis.remove(0);
        System.out.println("Alugando Barco: " + Barco);
        System.out.println("Barcos diponiveis para alugar: ");
        System.out.println(barcosDiposniveis);
        return Barco;
    }

    public void retornanrBarcoAlugado(Barco Barco){
        System.out.println("Devolvendo o Barco :" + Barco);
        barcosDiposniveis.add(Barco);
        System.out.println("Barcos dinsponiveis para alugar");
        System.out.println(barcosDiposniveis);
    }
}
