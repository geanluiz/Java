package generics;

public class Printer <T> {

    T input;

    public Printer(T i){
        this.input = i;
    }

    public void printAny() {
        System.out.println(input);
    }
}
