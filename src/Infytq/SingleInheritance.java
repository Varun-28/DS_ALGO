package Infytq;

class Parent1{
    public Parent1(){
        System.out.println("Parent1 constructor");
    }
}
class Child1 extends Parent1{
    public Child1(){
        System.out.println("Child1 constructor");
    }
}
class Child2 extends Parent1{
    public Child2(){
        System.out.println("Child2 constructor");
    }
}
public class SingleInheritance {
    public static void main(String[] args) {
        Child2 obj1 = new Child2();
        System.out.println();
        Child1 obj2 = new Child1();
    }
}
