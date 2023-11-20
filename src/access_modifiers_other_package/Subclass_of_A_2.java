package access_modifiers_other_package;

import access_modifiers.Base_class_A;

public class Subclass_of_A_2 extends Base_class_A {

    int d;
    String name_sub_class_a_2_name;

    public Subclass_of_A_2(int a,float b, String name,int d, String name_sub_class_a_2_name){
        super(a,name, b);
        this.d = d;
        this.name_sub_class_a_2_name = name_sub_class_a_2_name;
    }

    public static void main(String[] args) {

        Subclass_of_A_2 obj_of_sub_class_A_2 = new Subclass_of_A_2(3,43.5f,"fdasdfds",3,"sub_2_asdfas");
        System.out.println(obj_of_sub_class_A_2.a);
    }
}
