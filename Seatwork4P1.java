public class Seatwork4P1 {

    public void processPayment(double amount, String currency) {
        System.out.println("Processing payment of " + amount + " " + currency);
    }

    public void processPayment(double amount, String currency, String method) {
        System.out.println("Processing payment of " + amount + " " + currency + " using " + method);
    }

    public static void main(String[] args) {
        Seatwork4P1 process = new Seatwork4P1();
        process.processPayment(120, "Dollah");
        process.processPayment(500, "Petot", "GCash");

        System.out.println("Seatwork 4 part 1. 2nd sem");
    }
}
