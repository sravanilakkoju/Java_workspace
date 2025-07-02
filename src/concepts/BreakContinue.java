package concepts;

public class BreakContinue {
    public static void main(String[] args) {
        // The break statement can also be used to jump out of a loop
        System.out.println("example stops the loop when i is equal to 4: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i == 4) {
                break;
            }
        }

        // The continue statement breaks one iteration (in the loop), if a specified
        // condition occurs,and continues with the next iteration in the loop.

        System.err.println("This example skips the value of 4:");
        for (int i = 0; i < 6; i++) {
            if (i == 4) {
                continue;// sips in the loop
            }
            System.out.println(i);
        }

        // Break and Continue in While Loop
        System.out.println("Break in While Loop");
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
            if (i == 4) {
                break;
            }
        }

        System.out.println("continue in While Loop");
        int j = 0;
        while (j < 10) {
            if (j == 4) {
                j++;
                continue;
            }
            System.out.println(j);
            j++;
        }
    }
}
