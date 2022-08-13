package GravityForce;

public class GravityForce {
    public static void main(String[] args) {
        double G = 6.673e-11;
        double M = 5.98e24;
        double R = 6.371;
        // int massOne = 5000;
        int massTwo = 50;
        // int radius = 500;

        double gravityForce = (G * M * massTwo) / Math.pow(R, 2);


        System.out.println(gravityForce);
    }
}
