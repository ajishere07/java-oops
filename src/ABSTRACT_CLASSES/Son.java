package ABSTRACT_CLASSES;

public class Son extends Parent{

    public Son(int a){
        super(a);
    }
    @Override
    void career(){
        System.out.println("i am going to be a doctor");
    }

    @Override
    void partner(String name, int age){
        System.out.println("I love barbie");
    }
}
