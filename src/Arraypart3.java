import static java.util.Arrays.sort;

public class Arraypart3 {
//    public static void sortArray(int[] nums) {
//
//
//        int n = nums.length;
//        int i = 0;
//        int j = n - 1;
//
//        System.out.println("Sort an Array of 0s and 1s : ");
//        while (i < j) {
//            if (nums[i] == 1 && nums[j] == 0) {
//                //swap
//                nums[i] = 0;
//                nums[j] = 1;
//            }
//            if (nums[i] == 0) {
//                //i ko  aage le jaao
//                i++;
//            }
//            if (nums[j] == 1) {
//                // j ko left decrement kr do
//                j--;
//            }
//        }
//    }


    static int findMissing(int[] arr, int n) {
        System.out.println("Find Missing Element :-");
        int xor = 0;
        //xor 1 se n tak
        for(int i = 0; i<=n; i++){
            xor = xor ^ i;
        }
        //Xor Array ke Elemnts ka
        for(int num: arr){
            xor = xor ^ num;
        }
        return xor;
    }

    static void sortZerosAndOnes(int[] arr) {
        System.out.println("sortZerosAndOnes :- ");
        int left = 0;
        int right = arr.length - 1;

        while (left < right){

            //find 1 from left
        while(left < right && arr[left] == 0){
            left++;
        }

        //find 0 from right
            while(left < right && arr[right] == 1){
                right--;
            }
            //swap
            if(left < right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 0, 1};
        sort(arr);
        for(int num: arr){
            System.out.print(num + " ");
        }

//        int arr[] = {1, 2, 4, 5};
//        int n = 5;
//        System.out.println(findMissing(arr,n));

//        int nums[] = {1, 0, 1, 1, 0, 0, 1};
//        sortArray(nums);
//        for (int x : nums) {
//            System.out.print(x + ", ");

//        }
    }
}