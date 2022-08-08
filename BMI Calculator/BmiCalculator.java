public class BmiCalculator {
    public static void main(String[] args) {
        double feetHeight = 5.5; // This is Height in feet and inch
        double height = feetHeight * 0.3; // Height in inch conveted into Height in meter
        double weight = 64; // This weight is in KG

        double result = weight / Math.pow(height, 2); // used formula

        // check condition using nested if else condition
        if (result > 40)
            System.out.println("Obese");
        else if (result > 25 && result < 39.9)
            System.out.println("Overweight");
        else if (result > 18.5 && result < 24.9)
            System.out.println("normal");
        else
            System.out.println("Under Weight");

        // printed out the final result
        System.out.println(result);
    }
}