package Infytq;
class Super{
    Super(){
        System.out.println("I am Super");
    }
}
class Child extends Super{
    int xyz;
    public Child(){
        System.out.println("This is Child's Constructor");
    }
    {
        System.out.println("This is instance initialization block");
        // this is instance initialization block
        //Its all content is copied to constructor of current class
    }
    static{
        System.out.println("This is Static");
    }
    public static final int c = 10;
}
public class Inherit extends Child{

    public static void main(String[] args) {
       Child obj = new Child();
        System.out.println(obj.xyz);
    }
}
