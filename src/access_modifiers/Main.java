package access_modifiers;

public class Main {

    public static void main(String[] args) {
        Base_class_A obj_of_a =new Base_class_A(8,"ahsdfa0",3.4f);
//        System.out.println(obj_of_a.b); // cannot access because /b/ is a private member variable

//        System.out.println(obj_of_a.name);//it a no  modifier member varible it can be accessed direcly by the object

        System.out.println(obj_of_a.a); // /a/ is a protected member variable, so it can be access by object directly.


        // INHERITATED CLASS OF CLASS /A/

        Subclass_A obj_of_subclass_of_A = new Subclass_A(3, 6.4f,"fadsf",3,"sub_asdfsd");//this constructor has a super object which initializes data member of A class


        System.out.println(obj_of_subclass_of_A.a); // Now proctected member var can also be accessed by inheritated class.

    }
}
