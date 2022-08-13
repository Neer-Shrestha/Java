package LengthConversion;

import java.util.Scanner;

public class LengthConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. mm to cm");
        System.out.println("2. mm to m");
        System.out.println("3. mm to km");
        System.out.println("4. cm to mm");
        System.out.println("5. cm to m");
        System.out.println("6. cm to km");
        System.out.println("7. km to mm");
        System.out.println("8. km to cm");
        System.out.println("8. km to m");

        int userConvertChoice = scanner.nextInt();
        scanner.nextLine();

        int meter, centiMeter, kiloMeter, miliMeter;

        switch (userConvertChoice) {
            case 1:
                miliMeter = scanner.nextInt();
                scanner.nextLine();
                centiMeter = miliMeter / 10;
                System.out.println(centiMeter);
                break;
            case 2:
                miliMeter = scanner.nextInt();
                scanner.nextLine();
                meter = miliMeter / 1000;
                System.out.println(meter);
                break;
            case 3:
                miliMeter = scanner.nextInt();
                scanner.nextLine();
                kiloMeter = miliMeter / 1000000;
                System.out.println(kiloMeter);
                break;
            case 4:
                centiMeter = scanner.nextInt();
                scanner.nextLine();
                miliMeter = centiMeter * 10;
                System.out.println(miliMeter);
                break;
            case 5:
                centiMeter = scanner.nextInt();
                scanner.nextLine();
                meter = centiMeter / 100;
                System.out.println(meter);
                break;
            case 6:
                centiMeter = scanner.nextInt();
                scanner.nextLine();
                kiloMeter = centiMeter / 100000;
                System.out.println(kiloMeter);
                break;
            case 7:
                kiloMeter = scanner.nextInt();
                scanner.nextLine();
                centiMeter = kiloMeter * 100000;
                System.out.println(centiMeter);
                break;
            case 8:
                kiloMeter = scanner.nextInt();
                scanner.nextLine();
                centiMeter = kiloMeter * 100000;
                System.out.println(centiMeter);
                break;
            case 9:
                kiloMeter = scanner.nextInt();
                scanner.nextLine();
                meter = kiloMeter * 1000;
                System.out.println(meter);
                break;
            default: 
                System.out.println("You entered the wrong number");
        }

        scanner.close();
    }
}
