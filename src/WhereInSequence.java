public class WhereInSequence {

    public static void main(String[] args){
        long target1 = 8;

        long target2 = 1763;
    }

    public static int findPositionInNotFibonacci(long target) {
        long prev2 = 0;
        long prev1 = 2;
        int position = 1;

        if (target <= 0){
            return 0;
        } else if (target < 2){
            return 0;
        }else if (target == 2){
            return 1;
        }
    }


}
