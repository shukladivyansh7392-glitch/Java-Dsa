import java.util.Arrays;
import java.util.HashSet;

public class ArrayProblems {
    static double getAverage(int[] arr) {
        double sum =0;
        for(int i : arr){
            sum += i;
        }
        int size = arr.length;
        double avg = sum /size;
        return avg;
    }

    static int[] multiplyBy10(int[] arr) {
       int size = arr.length;
       int newArray[] = new int[size];

       for(int i=0; i<size; i++){
        int element = arr[i];
        int newElement = element * 10;
        newArray[i] = newElement;

       }
       //new updated return
        return newArray;
    }

    //linear search
    static boolean findTarget(int arr[], int target) {
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                return true;
            }
        }

    //agar poora array travel ho chuka hai
    //and ek baar bhi target nahi mila
    //iska mtlb , target is not present in array
    //return false;
    return false;
}

static int getMaximum(int arr[]){

        int maxi = arr[0];

        for(int i=0; i<arr.length; i++){

            maxi = Math.max(maxi,arr[i]);
//            if(arr[i]>maxi){
//                maxi = arr[i];
//            }
        }
        return maxi;
         //jab main vaha pahuchunga, toh poora array compare ho chuka hoga
        //and maxi k andar sabse badi value hogi

}
//Homework -> Math.max()

    static int[] getPosNegSum(int arr[]){
      int posSum = 0;
      int negSum = 0;

      for(int i=0; i<arr.length; i++){
          if(arr[i] > 0){
              //if number is positive
              posSum = posSum + arr[i];
          }
          else{
              //if number is negative
              negSum = negSum + arr[i];
          }
      }
      int ans[] = {posSum, negSum};
      return ans;
    }

    static int[] getZeroOneCount(int arr[]){
       int zeroCount = 0;
       int oneCount = 0;

       for(int i=0; i<arr.length; i++){
           if(arr[i] == 0){
               zeroCount++;
           }
           else{
               oneCount++;
           }
       }
       int ans[] = {oneCount, zeroCount};
       return ans;
    }

    static int getUnsortedElement(int arr[]){
       for(int i=0; i<arr.length; i++){
           if(arr[i+1] > arr[i]){

           }
       }
        return 0;
    }
//            if (arr[i+1] > arr[i]){
//                //toh sab kuchh theek hai
//                //kuchh karne ki need nahi hai
//            }
//            else{
//                //arr[i+1] <= arr[i]
//                return arr[i+1];
//            }


    //jis case me main loop se bahar ajaunga




    //Homework Questions_________________________________!
    //Que1.Swap Alternate Elements in an array
   public static void swapArray(int arr[]) {
        for (int i = 0; i < arr.length; i += 2) {
            if (i + 1 < arr.length) {

                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
    }
    //Question2. Print Array Intersection Element
    public static void ArrayIntersiction(int[] arr1, int[] arr2){
        System.out.println("Intersection Elements :");
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    System.out.println(arr1[i]);
                    break;
                }


            }
        }
    }

    static void main(){
     int[] a = {10,20,30,40};
        int[] b = {30,40,50,60};
        ArrayIntersiction(a,b);


        //Example:1. Even Array
//        int arr[] = {1,2,3,4,5,6};
//        System.out.println("Origin Even Array :" + Arrays.toString(arr));
//        swapArray(arr);
//        System.out.println("Swapped Even Array :" + Arrays.toString(arr));
//
//        System.out.println("----------------------------------------");
//
//        //Example:2. Odd Array
//        int Oddarr[] = {1,2,3,4,5};
//        System.out.println("Origin Odd Array" + Arrays.toString(Oddarr));
//        swapArray(Oddarr);
//        System.out.println("Swapped Odd Array" + Arrays.toString(Oddarr));

//          int arr[] = {1,2,5,4,9};
//        System.out.println(getUnsortedElement(arr));

//        int arr[] = {0,1,1,0,1,0,1,0};
//        int ans[] = getZeroOneCount(arr);
//        System.out.println("zeroCount = " +ans[0]);
//        System.out.println("oneCount = " +ans[1]);


//        int arr[] = {1,-3,-5, -7,9};
//        int ans[] = getPosNegSum(arr);
//        System.out.println("Positive Sum = " +ans[0]);
//        System.out.println("Negative Sum = " +ans[1]);

//        int arr[] = {2,5,3,1,7};
//        System.out.println(getMaximum(arr));

//        int arr[] = {1,3,5,7,9};
//        boolean ans = findTarget(arr,9);
//        System.out.println(ans);

//        int arr[] = {1,2,3,4,5};
//       int ans[] = multiplyBy10(arr);
//        System.out.println("printing ans array: ");
//        for(int i:ans){
//            System.out.println(i);
//        }
        //}
//        int[] arr = {1,4,1,3};
//        System.out.println(getAverage(arr));
    }
}
