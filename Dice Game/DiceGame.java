public class DiceGame {
    public static void main(String[] args) {
        int i = 0;
        int min = 1;
        int max = 6;
        int range = max - min + 1;
        for(i=0; i<5; i++) {
            int rand = (int)(Math.random() * range) + min;
            System.out.println(rand);
        }
    }
}