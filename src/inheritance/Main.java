package inheritance;

public class Main {

    public static void main(String[] args) {
        
        Car car = new Car();
        Bicycle bike = new Bicycle();

        car.go();
        System.out.println(car.speed);
        car.stop();

        System.out.println(car.wheels);
        System.out.println(bike.occupants);
    }
}