public class RemoveElements {

    public static void main(String[] args){
        double[] nums = {3.5, 2.1, 5.8, 1.2, 6.9, 4.0};
        double val = 4.0;

        int k = removeElements(nums, val);
    }

    public static int removeElements(double[] nums, double val) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}
