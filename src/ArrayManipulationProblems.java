import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ArrayManipulationProblems {

    static void reversArray(int arr[]) {
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        while (i <= j) {
            //swap karna
            int tem = arr[i];
            arr[i] = arr[j];
            arr[j] = arr[tem];
            //i ko aage badhao
            i++;
            //j ko peeche laao
            j--;
        }
        //now you array have been reversed
        //print
        for (int k : arr) {
            System.out.print(k);
        }


    }

    //2 shift array Elements By one position
    static void shiftBy1(int[] arr) {
        //step1: store last wale ki value
        System.out.println("Shift Elements By 1 Position :-");
        int n = arr.length;
        int temp = arr[n - 1];
        //Step2: shift all value of array
        for (int i = n - 1; i <= 0; i++) {
            arr[i] = arr[i - 1];
        }
        //step3: temp ki value ko 0 index par copy
        arr[0] = temp;

    }
    //3. shift array Elements By K position
//    static void shiftByk(int[] arr){
//        //step1: store last wale ki value
//        int k = arr.length;
//        int K = arr[k - 1];
//        //Step: shift all value of array
//        for(int i = k-1; i >= 0; i--){
//            arr[i] = arr[i-1];
//        }
//        //step: K ki value ko 0 index par copy
//        arr[0] = K;
//    }

    static void printAlternate(int arr[]) {
        System.out.println("Print Extrme Elements in an Alternate manner :- ");
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        while (i <= j) {
            if (i == j) {
                System.out.println(" " + arr[i]);
                return;
            } else {
                //i<j
                System.out.print(" " + arr[i]);
                i++;
                System.out.print(" " + arr[j]);
                j--;
            }
        }
    }

    static int getMode(int arr[]) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
//        for (int i : freq.keySet()) {
//            //i -> will represent Key
//            System.out.println(i + " -> " + freq.get(i));
//        }
        int maxFreq = -1;
        int maxFreqwalikey = -1;
        for (int key : freq.keySet()) {
            int currentkey = key;
            int currentKeykifreq = freq.get(key);
            //mujhe naya max mil gaya
            maxFreq = currentKeykifreq;
            maxFreqwalikey = currentkey;
        }
        //jab loop se bahar aaoge to maxFreqwalikey key ready hogi
        return maxFreqwalikey;
    }

    static int[] getHighestLowestFreqElement(int arr[]) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        //insert Data

        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        //Hashmap is ready
        int highestFreq = Integer.MIN_VALUE;
        int highestNum = -1;
        for (int key : freq.keySet()) {
            int currentKey = key;
            int currentFreq = freq.get(key);
            if (currentFreq > highestFreq) {
                //Update highest freqq
                highestFreq = currentFreq;
                highestNum = currentKey;
            }
        }
        int lowestFreq = Integer.MAX_VALUE;
        int lowestNum = -1;
        for (int key : freq.keySet()) {
            int currentkey = key;
            int currentFreq = freq.get(key);
            if (currentFreq < lowestFreq) {
                lowestFreq = currentFreq;
                lowestNum = currentkey;
            }
        }
            int ans[] = {highestNum, lowestNum};
            return ans;
        }

    public static ArrayList<Integer>
    findUnion(int[] arr1, int[] arr2){

        int i = 0;
        int j = 0;

        int n = arr1.length;
        int m = arr2.length;

        ArrayList<Integer> unionList = new ArrayList<>();
        //jab tak dono arrays main elements hain.
        while (i < n && j < m){
            if (arr1[i] <= arr2[j]){
                //Duplicate check
                if(unionList.isEmpty() || unionList.get(unionList.size() - 1) != arr1[i])
                {
                    unionList.add(arr1[i]);
                }
                i++;
                } else{
                //Duplicate check
                if (unionList.isEmpty() || unionList.get(unionList.size() - 1) != arr2[j]){

                    unionList.add(arr2[j]);
                }

                j++;
            }
        }
        // arr 1 ke remaining elements
        while (i < n){
            if (unionList.isEmpty() || unionList.get(unionList.size() - 1) != arr1[i]){

                unionList.add(arr1[i]);
            }
            i++;
        }

        // arr2 ke remaining elements
        while(j < m){
            if (unionList.isEmpty() || unionList.get(unionList.size() - 1) != arr2[j] ){
                unionList.add(arr2[j]);
            }
            j++;
        }
        return unionList;
    }

    public static void reverse(int[] arr, int start, int end){
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
    public static void rotateRight(int[] arr, int k){
        System.out.println("Shift The Array by K position :- ");
        int n = arr.length;
        k = k % n;

        //step 1: reverse complete array
        reverse(arr, 0, n - 1);
        //step 2: Reverse first k elements
        reverse(arr, 0, k - 1);
        //Step 3: Reverse Remaining Array
        reverse(arr, k, n - 1);
    }

      public static void main (String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;

        rotateRight(arr, k);

          System.out.println(Arrays.toString(arr));


//        int[] arr1 = {1, 2, 2, 3, 5};
//        int[] arr2 = {2, 3, 4, 4, 5, 6};
//
//        ArrayList<Integer> union = findUnion(arr1, arr2);
//          System.out.println("Union of arrays: " + union);


//            int arr[] = {1, 2, 2, 3, 3, 3, 4, 4, 5, 5, 5, 5, 5};
//            int ans[] = getHighestLowestFreqElement(arr);
//            System.out.println("highest freq wala" + ans[0]);
//            System.out.println("lowest frq wala " + ans[1]);


//        int ans = getMode(arr);
//        System.out.println(ans);
//        int arr[] = {1,2,3,4,5};
//        printAlternate(arr);
            //}
//        int arr[] = {1, 2, 3, 4};
//            System.out.println("Print reverse Array :- ");
//        reversArray(arr);

//            int arr[] = {10, 20, 30, 40, 50};
//            shiftBy1(arr);
//            for (int a : arr) {
//                System.out.print(a + " ");
//            }
//            System.out.println();
        }
        }

