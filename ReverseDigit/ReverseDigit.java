package ReverseDigit;

import java.util.Scanner;

public class ReverseDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number to reverse:");
        int userChoice = scanner.nextInt();
        scanner.nextLine();
        int sum = 0;
        int remainder;
        while (userChoice != 0) {
            remainder = userChoice % 10;
            sum = sum*10 + remainder;
            userChoice = userChoice / 10;


        }
        System.out.println(sum);
        scanner.close();
    }
}
