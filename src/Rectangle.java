public class Rectangle {
    private float width;
    private float height;

    public Rectangle(float width, float height){
        this.width = width;
        this.height = height;

    }

    float areaOfRectangle(){
        return width * height;
    }

    float perimeterOfRectangle(){
        return 2*(width+height);
    }
}
