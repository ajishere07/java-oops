package access_modifiers;

public class Base_class_A {

    protected int a;
    private float b;
    String name;

    public Base_class_A(int a, String name,float b){
        this.a  = a;
        this.b = b;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getA() {
        return a;
    }

    public float getB() {
        return b;
    }
}
