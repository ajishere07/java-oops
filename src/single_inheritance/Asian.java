package single_inheritance;

public class Asian extends Human{
    String skinTone = "extremely fair";

    public String getSkinTone() {
        return skinTone;
    }
    public Asian(String skinTone, float height, String gender){
        super(gender, height);
        this.gender = gender;
    }
}
