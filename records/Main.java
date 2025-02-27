public class Main {

    public static void main(String[] args) {

        Person person = new Person("John");

        System.out.println(person.name());
        System.out.println((person.name().equals("John")) ? "The name is indeed John" : "It has another name");
    }
}