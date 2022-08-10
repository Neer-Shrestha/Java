package DigitNumber;

public class DigitNumber {
    public static void main(String[] args) {
        int userNum = 1235;
        int sum = 0;
        int remainder;
         while(userNum != 0) {
            remainder = userNum % 10;
            sum += remainder;
            userNum = userNum / 10;
         }
         System.out.println(sum);
    }    
}
