package ABSTRACT_CLASSES;

public abstract class Parent {

    int a;

    public Parent(int a){
        this.a = a;
    }

    public static void hello(){
        System.out.println("hello i am a static method");
    }

    abstract void career();
    abstract void partner(String name, int age);



}
