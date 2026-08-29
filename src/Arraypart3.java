import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static java.util.Arrays.sort;
import static java.util.Collections.max;
public static class Arraypart3 {
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

    public static List<Integer> findDisappearedNumber(int[] arr) {
        List<Integer> ans = new ArrayList<>();

        //Marking
        int n = arr.length;
        for (int index = 0; index < n; index++) {
            int value = Math.abs(arr[index]);
            int position = value - 1;
            //mark kardo ye position
            if (arr[position] > 0) {
                arr[position] = -arr[position];
            }
        }
        //travel array and whenever you encounter a positive value, print the number at the same time
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                int valueAtThisIndex = i + 1;
                ans.add(valueAtThisIndex);
            }
        }
        return ans;
    }
    }
    public static List<Integer> rowSum(int[][] arr){
    //implementation logic
        List<Integer> result = new ArrayList<>();
        int m = arr.length;
        int n = arr[0].length;
        //Traversal
        for(int row = 0; row<m; row++){
            //jaise hi mai kishi new row mai aaunga
            //waise hi main sum = 0
            int sum = 0;
            for(int col = 0; col<n; col++) {
                int value = arr[row][col];
                sum = sum + value;
            }
            //jab mai saare columns ki value travel and add kar chuka
            //hounga, tab mere pass sum wale variable
            //me entire row ka sum ready hoga
            result.add(sum);
            }
        return result;
        }


        public static List<Integer> colSum(int[][] matrix){
    //implementation Logc
    List<Integer> result = new ArrayList<>();
    int m = matrix.length;
    int n = matrix[0].length;
            //Traversal
            for(int col=0;  col<n; col++){
                //ye jaise hi mai kishi new column mai aaunga
                //waie hi sum zero kr dunga
                int sum = 0;
                for(int row=0; row<m; row++){
                    int value = matrix[row][col];
                    sum = sum + value;
                }
                //jaise hi mein ek column me entire traversal karke
                //sum nikal chuka hounga, tab mein uss sum ko result mai store kr dunga
                result.add(sum);
            }
            return result;

        }
        public static List<Integer> waveMatrixprint(int[][] matrix){
            List<Integer> result = new ArrayList<>();
            int m = matrix.length;
            int n = matrix.length;

            //lets move column wise
            for(int col=0; col<n; col++){
                //har ek column index ko check karo even/odd
                if((col & 1) == 1){
                    //odd
                    //bottom to top
                    for(int row=m-1; row>=0; row--){
                        result.add(matrix[row][col]);
                    }
                }
                else{
                    //even
                    //top to bottom
                    for(int row=0; row<m; row++){
                        result.add(matrix[row][col]);
                    }
                }
            }
            return result;
        }
        public static int[][] transposeMatrix(int[][] matrix){
          if(matrix == null || matrix.length == 0){
              return new int[0][0];
          }
          //for original array
            int totalRows = matrix.length;
            int totalCols = matrix[0].length;
            //for new array
            int newTotalRows = totalCols;
            int  newtotalCols = totalRows;
            int ans[][] = new int[newTotalRows][newtotalCols];

            //actual logic
            for(int i=0; i<totalRows; i++){
                for(int j=0; j<totalCols; j++){
                    ans[j][i] = matrix[i][j];
                }
            }
            return ans;
        }

public static void rotate90Clockwise(int[][] matrix, int N){
    //step-1 rotate Transpose of A matrix
    //swap mtrix[i][j], matrix[j][i]
    for(int row=0; row<N; row++){
        for(int col=row+1; col<N; col++){
            //swap mtrix[i][j], matrix[j][i]
            int temp = matrix[row][col];
            matrix[row][col] = matrix[col][row];
            matrix[col][row] = temp;
        }
    }
    //step-2 reverse all rows of a matrix
    //har row pr jaunga and
    //use reverse kr dunga
    for(int row=0; row<N; row++){
        //ab main ek new row par a chuka hu ab reverse kr do
        int startcol = 0;
        int endcol = N-1;
        while(startcol <= endcol){
            //swap matrix[endcol][startcol], matrix[startcol][endcol]
            int temp = matrix[row][startcol];
            matrix[row][startcol] = matrix[row][endcol];
            matrix[row][endcol] = temp;

            startcol++;
            endcol--;
        }
    }
}
    public static void main(String[] args) {
        int[][] arr = {
                {10,20,30},
                {40,50,60},
                {70,80,90}
        };
       // System.out.println(rotate90Clockwise(arr, 3));



//         int[][] arr = {
//                 {10,20,30},
//                 {40,50,60},
//                 {70,80,90}
//         };
//        System.out.println("Transpose of a Matrix :-" + Arrays.deepToString(transposeMatrix(arr)));
//         int[][] arr = {
//                 {1,2,3,4},
//                 {5,6,7,8},
//                 {9,10,11,12},
//                 {13,14,15,16}
//         };

       // System.out.println("That is Wave print a matrix" + waveMatrixprint(arr));
//        int[][] arr = {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}};
//        System.out.println("This is 2D array RowSum" +  colSum(arr));
//    int[][] nums = {
//            {1,2,3},
//            {4,5,6},
//            {7,8,9}};
//        System.out.println("This is 2D array RowSum" + rowSum(nums));
//    int[] arr = {1, 4, 4, 5, 2, 2};
//    int frr=findDisappearedNumber(arr);


//        int[] arr = {1, 7, 3, 6, 5, 6};
//        System.out.println("This Is Pivot  :-- " + findPivot(arr));

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
