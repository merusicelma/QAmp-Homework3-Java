import java.util.Scanner;

public class Task1b {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int number;

        do {
            System.out.println("Please enter any integer: ");
            number = reader.nextInt();
        }
        while (number != -1000);

        System.out.println("Exit number -1000 is detected!");
    }
}

