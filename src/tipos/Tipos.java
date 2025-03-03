package tipos;

import java.util.ArrayList;

public class Tipos {

    public static void main(String[] args) {

        ArrayList<Integer> meuArray = new ArrayList<>();
        
        for (int i = 0; i < 6; i++) {
            meuArray.add(i + 1);
        }

        for (int i : meuArray){
            System.out.println(i);
        }
    }
}