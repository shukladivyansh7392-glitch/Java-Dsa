import java.util.HashMap;

import static java.util.Arrays.sort;
import static java.util.Collections.max;

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
//                //i ko  age le jato
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
        //Xor Array ke Elements ka
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

    public static int findUniqueNumber(int[] arr){
        int xorSum = 0;
        for(int n: arr){
            xorSum = xorSum ^ n;
        }
        return xorSum;

    }
    public static int maxConsecutive(int[] arr){
        int maxi = 0;
        int count = 0;
        for(int i = 0; i < arr.length; i++){
           if(arr[i] == 1){
               count++;
               maxi = Math.max(maxi, count);
           }
           else{
               count = 0;
           }
        }
        return maxi;
    }

//    public static int[] twoSum(int[] arr, int target){
//        int n = arr.length;
//
//        for(inti = 0; i < arr.length-1; i++){
//            for(int j = i+1; j<arr.length; j++){
//                if(arr[i] + arr[j] == target){
//                    int ans[] = {arr[i], arr[j]};
//                    return ans;
//                }
//            }
//        }
//        int ans[] = {};
//        return ans;
//    }


    public static  int[] threeSum(int[] arr, int target ){
        int n = arr.length;

//        int[] ans;
        System.out.println("Three Sum :-");
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length-1; j++ ){
                for(int k = i+2; k < arr.length-2; k++ ){

                    if(arr[i] + arr[j] + arr[k] == target){
                        int ans[] = {arr[i], arr[j], arr[k]};
                        return ans;
                    }
                }
            }
        }
        int[] ans = {};
        return ans;
    }

    public static int duplicateMissing(int[] arr){
        int i = 0;
        int j = 1;
        int n = arr.length;
        while(j < n) {
            if (arr[i] == arr[j]) {
                j++;
            } else {
                //npMatch
                i++;
                arr[i] = arr[j];
                j++;
            }
        }
        return i + 1;
    }

    public static int reapitedElements(int[] arr){
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int num: arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
            for(int i: arr){
                if(freq.get(i) > 1){
                    return i;
                }
            }
        //agar koi bhi freq > 1 nahi hai to
        return -1;

    }

    public static int findPivot(int[] arr){
        int n = arr.length;
        int leftSum[] = new int[n];
        int rightSum[] = new int[n];

        //fill leftSum bala array
        leftSum[0] = arr[0];
        for(int i=1; i<n; i++){
            leftSum[i] = leftSum[i-1] + arr[i];
        }
        //fill rightSum bala array
        rightSum[n-1] = arr[n-1];
        for(int i=n-2; i>=0; i--){
            rightSum[i] = rightSum[i+1] + arr[i];
        }
        //check for equality
        for(int i=0; i<n; i++){
            if(leftSum[i] == rightSum[i]){
                return  i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 7, 3, 6, 5, 6};
        System.out.println("This Is Pivot  :-- " + findPivot(arr));

//        int[] arr = {2, 4, 6, 8, 7, 6, 8};
//        System.out.println("The ReapetedElements :- " + reapitedElements(arr));
//        int remove = reapitedElements(arr);
//        System.out.println("The Reapited Elements Remove :- " + remove);
//        int[] arr = {1, 2, 2, 2, 2, 3, 3, 4};
//        int missing = duplicateMissing(arr);
//        System.out.println("The Missing Element :- " + missing);

//        int[] arr = {2, 1, 3, 5, 4, 6};
//        int[] result = threeSum(arr, 9);
//        System.out.println("[" + result[0] + ", " + result[1] + ", " + result[2] + "]");

//        int[] arr = {2, 1, 3, 5, 4, 6};
//        int[] result = twoSum(arr, 9);
//        System.out.println("[" + result[0] + ", " + result[1] + "]");
//        int[] fii = {1, 1, 0, 1, 1, 1, 0, 1, 1};
//        System.out.println(maxConsecutive(fii));



//        int[] arr = {2, 5, 4, 5, 3, 3, 4};
//        int unique = findUniqueNumber(arr);
//        System.out.println("The unique number is : " + unique);

//        int[] arr = {1, 0, 1, 0, 0, 1};
//        sort(arr);
//        for(int num: arr){
//            System.out.print(num + " ");
//        }

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