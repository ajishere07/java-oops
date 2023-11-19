package single_inheritance;

public class Creature {
    private Boolean isAlive;
    float height;

    public Creature(Boolean isAlive, float height) {
        this.isAlive = isAlive;
        this.height = height;
    }

    public Creature(float height) {
        this.height = height;
    }

    public Creature(Boolean isAlive) {
        this.isAlive = isAlive;
    }

    Boolean getIsAlive(){
        return isAlive;
    }

    void setIsAlive(Boolean isAlive){
        this.isAlive = isAlive;
    }

}
