package polymorphism;

public class Main {


    public static void main(String[] args) {
        Shapes shapes = new Shapes();
        shapes.area();

        Circle circle = new Circle();

        circle.area();

        Shapes triangle = new Triangle();
        triangle.area();

        Shapes.perimeter();

        //static method inherited
        Circle.perimeter();

    }
}
