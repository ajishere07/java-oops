package OOPS_PRINCIPLES;

public class Main {
    public static void main(String[] args) {
        Box box = new Box();
        System.out.println(box.l +" "+box.h+" " + box.w);


        Box box2 = new Box(2.5,3.6,22.2);
        System.out.println(box2.l +" "+box2.h+" " + box2.w);


        Box box3 = new Box(box2); //copy constructor
        System.out.println(box3.l +" "+box3.h+" " + box3.w);


        Box box4 = new Box(300.);
        System.out.println(box4.l+" "+box4.w+" "+box4.h);


        BoxWeight box5 = new BoxWeight();
        System.out.println(box5.h+" "+box5.l+" "+box5.w+" "+box5.weight);

//-------------------------------------------------------------

//        BoxWeight box6 = new Box(2,4,4);


        // box class cannot access weight variable which is a property of boxweight class
        // that is why we are getting this error

//-------------------------------------------------------------

    }
}
