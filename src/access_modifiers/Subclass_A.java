package access_modifiers;

public class Subclass_A extends Base_class_A{
    int c;
    String subclass_name_;

    Subclass_A(int a,float b, String name,int c , String subclass_name_){
        super(a,  name,  b);
        this.c = c;
        this.subclass_name_ = subclass_name_;

    }
}
