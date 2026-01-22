public class RemoveElements {

    public static void main(String[] args){
        double[] nums = {3.5, 2.1, 5.8, 1.2, 6.9, 4.0};
        double val = 4.0;
        System.out.print("Input: nums = [");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
            if (i < nums.length - 1) System.out.print(", ");
        }
        System.out.println("], val = " + val);

        int k = removeElements(nums, val);
        System.out.println("Output: " + k);
        System.out.print("Modified array (first " + k + " elements): [");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i]);
            if (i < k - 1) System.out.print(", ");
        }
        System.out.println("]");
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
