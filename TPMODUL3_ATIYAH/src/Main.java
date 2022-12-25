import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Restaurant resto = new Restaurant();
        int customerID, orderQty;
        try {

            System.out.println("Enter Customer ID: ");
            customerID = input.nextInt();

            System.out.println("Enter how much food to made: ");
            orderQty = input.nextInt();

            Thread tr1 = new Thread(resto);
            Waiters waiter = new Waiters(customerID, orderQty);
            Thread tr2 = new Thread(waiter);

            tr1.start();
            tr2.start();
            tr1.join();
            tr2.join();

        } catch (Exception e) {
            System.out.println("Input must be Integer");
        }

    }

}