package Infytq;

class Vehicle {
    int speed = 90;
}
class Car extends Vehicle{
    int speed = 150;
}
public class Wheel{
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Car car = new Car();
        Vehicle vehicle1 = new Car();

        System.out.println(vehicle.speed);
        System.out.println(car.speed);
        System.out.println(vehicle1.speed);

        // variable is loaded 1st of parent class if both variable name is same
        // method if loaded 1st of child class if both method has same name
    }
}
