package inheritance;

public class Vehicle {

    Double speed = 0.0;

    void go() {
        this.speed += 10;
        System.out.println("This vehicle is moving");
    }

    void stop() {
        System.out.println("This vehicle is stopped");
    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }
}