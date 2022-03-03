import java.util.Scanner;

public class Task1a {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Please enter number one: ");
        int number1 = reader.nextInt();
        System.out.println("Please enter number two: ");
        int number2 = reader.nextInt();
        System.out.println("Sum of numbers " + number1 + " and " + number2 + " is: " + sum(number1,number2));
        System.out.println("Difference of numbers " + number1 + " and " + number2 + " is: " + difference(number1,number2));
        System.out.println("The result of multiplying numbers " + number1 + " and " + number2 + " is: " + multiply(number1,number2));
        System.out.println("The result of dividing numbers " + number1 + " and " + number2 + " is: " + divide(number1,number2));
    }

    public static int sum(int number1, int number2) {
        int number = number1 + number2;
        return number;
    }

    public static int difference(int number1, int number2) {
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
