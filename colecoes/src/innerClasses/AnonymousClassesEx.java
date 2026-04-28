package innerClasses;

class Animal{
    public void walk(){
        System.out.println("Animal andando");
    }
}

public class AnonymousClassesEx {
    public static void main(String[] args) {
        Animal animal = new Animal(){
            //class anonima sobrescrevendo

            @Override
            public void walk() {
                System.out.println("Animal correndo...");
            }
        };
        animal.walk();
    }

}
