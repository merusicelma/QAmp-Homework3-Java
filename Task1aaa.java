import java.util.Scanner;

public class Task1aaa {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);


        int number;

        do {
            System.out.println("Enter a positive number: ");
            number = reader.nextInt();
        }
        while (number >= 0);

    }
}
