import java.util.Scanner;

public class Task1c {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int number;
        int startingnumber = 0;

        do {
            System.out.println("Please enter any integer: ");
            number = reader.nextInt();
            System.out.print("Total of " + startingnumber + " and " + number);
            startingnumber = sum(startingnumber, number);
            System.out.println(" is " + startingnumber);
        }
        while (number != -1000);

        System.out.println("Exit number -1000 is detected!");

    }

    public static int sum(int number1, int number2) {
        int number = number1 + number2;
        return number;
    }
}
