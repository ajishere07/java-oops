package ABSTRACT_CLASSES;

public class Daughter extends  Parent {

    public Daughter(int a){
        super(a);
    }
    @Override
    void career() {
        System.out.println("i am going to actor");
    }

    @Override
    void partner(String name, int age) {

        System.out.println("i love iron man");
    }
}
