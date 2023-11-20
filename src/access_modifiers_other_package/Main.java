package access_modifiers_other_package;

public class Main {
    public static void main(String[] args) {
        Subclass_of_A_2 obj_of_sub_class_A_2 = new Subclass_of_A_2(3,43.5f,"fdasdfds",3,"sub_2_asdfas");


//        System.out.println(obj_of_sub_class_A_2.a); //Protected member variables can not be accessed by class of other package, it can only be accessed by subclass of the class in other package

    }
}
