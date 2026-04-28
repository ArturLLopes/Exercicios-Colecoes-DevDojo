package innerClasses;

public class OuterClassEx2 {
    private String name = "Artur";
    static  class  Nested{

        void print(){
            System.out.println(new OuterClassEx2().name);
        }

    }

    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();
    }
}
