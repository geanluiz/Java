package interfaces;

public class Fish implements Prey, Predator{

    @Override
    public void flee() {
        System.out.println("Fish is fleeing from a bigger fish");
    }

    @Override
    public void hunt() {
        System.out.println("Fish is hunting a smaller fish");
    }
}