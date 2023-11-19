package OOPS_PRINCIPLES;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight(double l, double w, double h, double weight) {
        super(l, w, h);
        this.weight = weight;
    }

    BoxWeight (){
        this.weight = -1;

    }
}
