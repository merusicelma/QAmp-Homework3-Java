import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Please enter array size: ");
        int arraySize = Integer.parseInt(reader.nextLine());
        int[] numberArray = new int[arraySize];
        int arrayNumber = 0;
        int i = 0;


        while (true) {
            System.out.println("Please enter any integer: ");
            arrayNumber = Integer.parseInt(reader.nextLine());
            if (arrayNumber == -10) {
                for (int l = 0; l < i; l++) {
                    System.out.print(numberArray[l] + ", ");
                }
                System.out.println("\nDo you want to continue with entering numbers in array?");
                char answer = reader.nextLine().charAt(0);
                if (answer == 'N' || answer == 'n') {
                    break;
                } else {
                    continue;
                }
            }
            //needed for dynamically resize the array when we reach the length
            if (i == numberArray.length) {
                System.out.println("The current size of the array is small, do you need to expand the array if you want to continue entering numbers? Y/N");
                char answer = reader.nextLine().charAt(0);
                if (answer == 'N' || answer == 'n') {
                    break;
                } else if (answer == 'Y' || answer == 'y') {
                    System.out.println("Size of array will be multiply by 2");
                    int[] newArray = new int[numberArray.length * 2];
                    for (int j = 0; j < numberArray.length; j++) {
                        newArray[j] = numberArray[j];
                    }
                    newArray[numberArray.length] = arrayNumber;
                    numberArray = newArray;
                    i++;
                }
            } else {
                numberArray[i++] = arrayNumber;
            }
        }

        for (int l = 0; l < i; l++) {
            System.out.print(numberArray[l] + ", ");
        }
    }
}

