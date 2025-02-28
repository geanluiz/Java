public class Main {

    public static void main(String[] args) {

        Person1 person1 = new Person1("John");

        System.out.println(person1.name());
        System.out.println((person1.name().equals("John")) ? "The name is indeed John" : "It has another name");
    }
}