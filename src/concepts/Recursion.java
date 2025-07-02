package concepts;

public class Recursion {
    // Recursion is the technique of making a function call itself.
    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(sum(5));
        System.out.println(sum(-5));
    }
}
