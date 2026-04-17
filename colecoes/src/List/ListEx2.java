package List;

import entity.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class ListEx2 {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Artur" ,"Lopes");
        Pessoa p2 = new Pessoa("Diego" ,"Silva");
        Pessoa p3 = new Pessoa("Rosangela" ,"Maria");

        List<Pessoa> pessoas = new ArrayList<>(6);
        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);

        for (Pessoa pessoa:pessoas){
            System.out.println(pessoa);
        }

        Pessoa p4 = new Pessoa("Artur", "Lopes");
        pessoas.add(0,p4);

        System.out.println(p4.equals(p1));
        System.out.println(pessoas.contains(p4));
        int indexPessoa = pessoas.indexOf(p2);
        System.out.println(indexPessoa);

        int indexPessoa4 = pessoas.indexOf(p4);
        System.out.println(indexPessoa4);

    }
}
