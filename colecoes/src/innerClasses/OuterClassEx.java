package innerClasses;

public class OuterClassEx {
    private String name = "Midoriya";

    void print(){
        final String lastName= "Izuku";
        class LocalClass{
            public void printLocal(){
                System.out.println(name);
                System.out.println(name + " " +lastName);

            }
        }
//        LocalClass localClass = new LocalClass();
//        localClass.printLocal();
        new LocalClass().printLocal();
    }

    public static void main(String[] args) {
        OuterClassEx outer = new OuterClassEx();
        outer.print();

    }
}
