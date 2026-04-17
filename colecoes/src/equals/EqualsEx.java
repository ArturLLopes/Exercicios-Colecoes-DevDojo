package equals;


import entity.Pessoa;

public class EqualsEx {
    public static void main(String[] args) {

//        String nome = "Artur Lopes";
//        String nome2 = new String("Artur Lopes");
//        System.out.println(nome.equals(nome2));
        // resultado verdadeiro ao comparar  o obj

        Pessoa p1 = new Pessoa("Artur", "Artur Lages Lopes");

//        Pessoa p2 = new Pessoa("Artur", "Artur Lages Lopes");
//        System.out.println(p1.equals(p2));
        // resultado falso ao compara o obj

        Pessoa p2 = p1;
        System.out.println(p1.equals(p2));
        // desta forma o obj 1 é = ao obj 2
    }
}
