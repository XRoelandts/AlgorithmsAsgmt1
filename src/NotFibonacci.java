public class NotFibonacci {

    public static void main(String[] args){
        int n = 10;
        System.out.println("Input: " + n);
        System.out.print("Output: ");

        generateNotFibonacci(n);
        System.out.println();

    }

    public static void generateNotFibonacci(int n) {
        if (n <= 0) {
            return;
        }

        long prev2 = 0;
        long prev1 = 2;

        if (n >= 1) {
            System.out.print(prev2);
        }
        if (n >= 2) {
            System.out.print(", " + prev1);
        }

        for (int i = 2; i < n; i++) {
            long current = (long) (1.5 * prev1 + 2.0 * prev2);

            System.out.print(", " + current);

            prev2 = prev1;
            prev1 = current;
        }
    }
}

