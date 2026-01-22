public class WhereInSequence {

    public static void main(String[] args){
        int target = 1763;
        System.out.println("Input: " + target);
        System.out.println("Output: " + findPositionInNotFibonacci(target));
        System.out.println();
    }

    public static int findPositionInNotFibonacci(int target) {
        int prev2 = 0;
        int prev1 = 2;
        int position = 1;

        if (target <= 0){
            return 0;
        } else if (target < 2){
            return 0;
        }else if (target == 2){
            return 1;
        }

        while (true) {

            int current = (3 * prev1 + 4 * prev2) / 2;

            if (current == target) {
                return position + 1;
            }

            if (current > target) {
                return position;
            }

            prev2 = prev1;
            prev1 = current;
            position++;

            if (position > 100) {
                break;
            }
        }

        return position;
    }


}
