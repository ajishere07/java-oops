public class Dog {
    private String name,breed;

    void setName(String newName){
        this.name = newName;
    }

    void setBreed(String newBreed){
        this.breed = newBreed;
    }

    public Dog(String name, String breed){
        this.name = name;
        this.breed = breed;
    }

    String getName(){
        return this.name;
    }
    String getBreed(){
        return this.breed;
    }
}
