package generics;

public class GenericsMain {

    public static void main (String[] args) {
        Printer<String> p = new Printer<> ("a");

        p.printAny();
    }
}
