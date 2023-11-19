package single_inheritance;

public class Animal extends Creature{
    String animalName;


    public Animal(Boolean isAlive, float height, String animalName) {
        super(isAlive, height);
        this.animalName = animalName;
    }

    public Animal(Boolean isAlive){
        super(isAlive);
    }


    void speak(){
        System.out.println("this is animal speaking");
    }

}
