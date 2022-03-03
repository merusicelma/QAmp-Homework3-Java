import java.util.Scanner;

public class Task1aa {
    public static void main(String[] args) {


        int total = 1;
        if (total != 0) {
            positiveNumber();
        }

    }

    public static void positiveNumber() {
        int positiveNumber;
        Scanner reader = new Scanner(System.in);
        do {
            System.out.println("Please enter a positive number: ");
            positiveNumber = reader.nextInt();
        } while (positiveNumber > 0);
    }
}
