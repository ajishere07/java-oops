// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        Person mat =  new Person("mat", 43);
        System.out.println(mat.getAge());
        System.out.println(mat.getName());

        Dog dog1 = new Dog("dog1", "german shephard");
        Dog dog2 = new Dog("dog2", "Golden Retriever");


        //setting the name and breed
        dog1.setName("dog11");
        dog2.setBreed("Sibetian Husky");


        //getting the breed and name
        System.out.println(dog1.getName());
        System.out.println(dog2.getBreed());

        Rectangle rect1 = new Rectangle(2.1f,5.4f);
        System.out.println(rect1.perimeterOfRectangle());
        System.out.println(rect1.areaOfRectangle());
    }
    }



