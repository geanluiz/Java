package lists;

import java.util.ArrayList;

public class Lists {

    public static void main(String[] args) {

        ArrayList<String> food = new ArrayList<>();

        food.add("Pizza");
        food.add("Hamburger");
        food.add("Hot dog");

        food.set(2, "Lasagna");

        // food.clear();

        for (String s : food) {
            System.out.println(s);
        }
    }
}
