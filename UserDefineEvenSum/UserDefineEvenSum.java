package UserDefineEvenSum;

import java.util.Scanner;

public class UserDefineEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter The Lowenumber range");
        int userLower = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter The Uppernumber range");
        int userUpper = scanner.nextInt();
        scanner.nextLine();
        int sum = 0;

        if (userLower < userUpper) {
            for (int i = userLower; i < userUpper; i++) {
                if (i % 2 == 0) {
                    sum += i;
                }
            }
            System.out.println(sum);
        } else {
            System.out.println("Lower Limit should smaller.");
        }

        scanner.close();
    }
}
