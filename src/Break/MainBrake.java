package Break;

public class MainBrake {

    public static void main(String[] args) {

//        Return how many times a price can be divided in a way that
//        each payment be more than $1000

        int maxValue = 1000;
        double price = 30000;
        double payment;

        for (int n = 1; n <= price; n++) {
            payment = price / n;
            if (payment < maxValue) {
                break;
            }
            System.out.println(n + " Payments" + ": $" + payment);
        }
    }
}
