package generics.service;

import java.util.List;

public class GenericsRentalService<T> {

    private  List<T> objetosDisponiveis;
    public GenericsRentalService(List<T> objetosDisponiveis){
        this.objetosDisponiveis = objetosDisponiveis;
    }

    public T buscarObjDisponivel(){
        System.out.println("Buscando obj ...");
        T t = objetosDisponiveis.remove(0);
        System.out.println("Alugando obj: " + t);
        System.out.println("obj diponiveis para alugar: ");
        System.out.println(objetosDisponiveis);
        return t;
    }

    public void retornarObjAlugado(T t){
        System.out.println("Devolvendo o obj :" + t);
        objetosDisponiveis.add(t);
        System.out.println("obj dinsponiveis para alugar");
        System.out.println(objetosDisponiveis);
    }
}
