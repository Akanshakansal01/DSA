package Dynamic_Programming;

public class Divisor_Game {
    public static void main(String[] args) {
        System.out.println(divisorGame(901));
    }
    public static boolean divisorGame(int n) {
            return n % 2 == 0;
    }
}
