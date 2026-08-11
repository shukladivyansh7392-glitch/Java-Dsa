public class Arraypart3 {
    public static void sortArray(int[] nums) {


        int n = nums.length;
        int i = 0;
        int j = n - 1;

        System.out.println("Sort an Array of 0s and 1s : ");
        while (i < j) {
            if (nums[i] == 1 && nums[j] == 0) {
                //swap
                nums[i] = 0;
                nums[j] = 1;
            }
            if (nums[i] == 0) {
                //i ko  aage le jaao
                i++;
            }
            if (nums[j] == 1) {
                // j ko left decrement kr do
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = {1, 0, 1, 1, 0, 0, 1};
        sortArray(nums);
        for (int x : nums) {
            System.out.print(x + ", ");

        }
    }
}