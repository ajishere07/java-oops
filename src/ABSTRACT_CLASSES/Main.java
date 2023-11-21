package ABSTRACT_CLASSES;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(3);
        son.career();

        Daughter daughter = new Daughter(3);
        daughter.partner("sammm",26);

//        Parent papa = new Parent(); // showing an error abstract class cannot be instantiated
Parent.hello();
    }
}
