package innerClasses;

public class InnerClass {
    private String name = "Monkey D. Luffy";

    class  Inner{
        public void printOutClassAtt(){
            System.out.println(name);
            System.out.println(this);
            System.out.println(InnerClass.this);
        }
    }
    public static void main(String[] args) {
        InnerClass innerClass = new InnerClass();
        Inner inner = innerClass.new Inner();
        Inner inner2 = new InnerClass().new Inner();
        inner.printOutClassAtt();
        inner2.printOutClassAtt();

    }
}
