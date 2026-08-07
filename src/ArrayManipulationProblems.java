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
            System.out.println(k);
        }


    }

    //2 shift array Elements By one position
    static void shiftBy1(int[] arr) {
        //step1: store last wale ki value
       int n = arr.length;
       int temp = arr[n-1];
        //Step2: shift all value of array
       for(int i=n-1; i<=0; i++){
           arr[i] = arr[i-1];
       }
        //step3: temp ki value ko 0 index par copy
        arr[0] = temp;

    }

    static void printAlternate(int arr[]) {
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        while (i <= j) {
            if (i == j) {
                System.out.println(arr[i]);
                return;
            } else {
                //i<j
                System.out.println(arr[i]);
                i++;
                System.out.println(arr[j]);
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
//
//        }
        return 0;
    }

    static void main() {
//        int arr[] = {1,2,2,3,3,3,4,4,5,5,5,5,5};
//        getMode(arr);
//        int arr[] = {1,2,3,4,5};
//        printAlternate(arr);
        //}
//        int arr[] = {1, 2, 3, 4, 5};
//        reversArray(arr);
//        shiftBy1(arr);
//        for (int a : arr) {
//            System.out.print(a + " ");
//        }
//        System.out.println();
//    }
    }
}