
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
            if(arr[i]>maxi){
                maxi = arr[i];
            }
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
                //num is positive
                posSum = posSum + arr[i];
            }
            else{
                //num is negative
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
                //oneCount
                oneCount++;
            }
        }
        int ans[] = {zeroCount, oneCount};
        return ans;
    }

    static int getUnsortedElement(int arr[]){
        for(int i=0; i<arr.length; i++) {
            if (arr[i + 1] <= arr[i]) {
                return arr[i + 1];
            }
        }
        return -1;
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

    static void main(){
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

        int arr[] = {2,5,3,1,7};
        System.out.println(getMaximum());
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
