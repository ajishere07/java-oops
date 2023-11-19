package single_inheritance;

public class Main {
    public static void main(String[] args) {

//        Creature creature1 =new Creature();
//        creature1.setIsAlive(true);
//        creature1.isAlive = true;


//        Human sam = new Human(true, 5.4, "kesav");

//        sam.setIsAlive(true);

        Creature peter = new Animal(false);


        System.out.println(peter.getIsAlive());
//        System.out.println(sam.getIsAlive());

        //super object example
        Asian o_lee = new Asian("extremely fair", 5.8f,"male");
        System.out.println(o_lee.height+" "+o_lee.gender+" "+o_lee.skinTone);
    }
}
