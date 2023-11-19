package single_inheritance;

public class Human extends Creature{
    String gender;
    int age;

    public Human(String gender, float height){
        super(height);
        this.gender =gender;
    }
    void speaks(){
        System.out.println("this is me human");
    }
}
