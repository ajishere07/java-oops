package polymorphism;

public class Triangle extends Shapes {
    void area(){
        System.out.println("area triangle.....");
    }

    //not overriding static method which is declared and defined in parent class of triangle
//    @Override
//    void perimeter(){
//        System.out.println("triangle perimeter...");
//    }
}
