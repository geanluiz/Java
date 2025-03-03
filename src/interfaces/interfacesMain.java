package interfaces;

public class interfacesMain {
    
    public static void main(String[] args) {
        Hawk hawk = new Hawk();
        Rabbit rabbit = new Rabbit();
        Fish smallFish = new Fish();
        Fish bigFish = new Fish();

        hawk.hunt();
        rabbit.flee();
        smallFish.flee();
        bigFish.hunt();
    }
}