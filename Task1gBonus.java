import java.util.Scanner;

public class Task1gBonus {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);


        int number;
        int startingnumber = 0;
        char operation = ' ';
        System.out.println("Do you want to input first number? Y/N");
        if (reader.nextLine().charAt(0) == 'Y' || reader.nextLine().charAt(0) == 'y') {
            System.out.println("Enter it: ");
            startingnumber = Integer.parseInt(reader.nextLine());
        }

        do {
            System.out.println("Which operation would you like to use: *,/,+,-,=?");
            operation = reader.nextLine().charAt(0);
            if (operation != '=') {
                System.out.println("Please enter any integer: ");
                number = Integer.parseInt(reader.nextLine());

                if (operation == '+') {
                    startingnumber = sum(startingnumber, number);
                } else if (operation == '-') {
                    startingnumber = minus(startingnumber, number);
                } else if (operation == '*') {
                    startingnumber = multiply(startingnumber, number);
                } else if (operation == '/') {
                    startingnumber = divide(startingnumber, number);
                }
            }
        }
        while (operation != '=');
        System.out.println("Calculator result is: " + startingnumber);

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

