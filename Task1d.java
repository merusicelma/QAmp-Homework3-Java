import java.util.Scanner;

public class Task1d {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int number;
        int startingnumber = 0;

        do {
            System.out.println("Which operation would you like to use: *,/,+,-?");
            char operation = reader.nextLine().charAt(0);
            System.out.println("Please enter any integer: ");
            number = Integer.parseInt(reader.nextLine());
            if (operation == '+') {
                System.out.print("Total of " + startingnumber + " and " + number);
                startingnumber = sum(startingnumber, number);
                System.out.println(" is " + startingnumber);
            } else if (operation == '-') {
                System.out.print("Total of " + startingnumber + " and " + number);
                startingnumber = minus(startingnumber, number);
                System.out.println(" is " + startingnumber);
            } else if (operation == '*') {
                System.out.print("Total of " + startingnumber + " and " + number);
                startingnumber = multiply(startingnumber, number);
                System.out.println(" is " + startingnumber);
            } else {
                System.out.print("Total of " + startingnumber + " and " + number);
                startingnumber = divide(startingnumber, number);
                System.out.println(" is " + startingnumber);
            }

        }
        while (number != -1000);

        System.out.println("Exit number -1000 is detected!");
    }

    public static int sum(int number1, int number2) {
        int number = number1 + number2;
        return number;
    }

    public static int minus(int number1, int number2) {
        int number = number1 - number2;
        return number;
    }

    public static int multiply(int number1, int number2) {
        int number = number1 * number2;
        return number;
    }

    public static int divide(int number1, int number2) {
        int number = number1 / number2;
        return number;
    }
}
