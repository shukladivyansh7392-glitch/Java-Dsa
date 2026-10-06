package RecursionBacktracking;

//public class ArraySumRecursion {
//    public static int sumArray(int[] arr, int index){
//        //base case: if index reaches the end of the array, return 0
//        if(index == arr.length){
//            return 0;
//        }
//        //Recursive step: current
//        return arr[index]+sumArray(arr, index+1);
//    }



public class ArraySumRecursion{
//    public static void printRightToLeft(int[] arr, int index) {
//        // Base Case: Agar index array ki length ke barabar ho jaye
//        if (index == arr.length) {
//            return;
//        }
//
//        // Pehle aage ke elements ke liye call karo (Stack build hoga)
//        printRightToLeft(arr, index + 1);
//
//        // Wapas aate waqt print karo (Ye right-to-left chalega)
//        System.out.print(arr[index] + " ");
//    }
    /**
     * Recursive method to print array from left to right.
     */
    public static void printArrayLeftToRight(int[] arr, int index) {
        // Base Case: If index reaches the length of the array, stop the recursion
        if (index == arr.length) {
            return;
        }

        // 1. Print the current element (Left-to-Right behavior)
        System.out.print(arr[index] + " ");

        // 2. Recursive Call: Move to the next index
        printArrayLeftToRight(arr, index + 1);
    }


    static int sum(int n){
        if(n == 0){
            return 0;
        }
        return n + sum(n - 1);
    }

    static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        return x * power(x, n - 1);
    }

    static int reverse(int n, int rev) {
        if (n == 0) {
            return rev;
        }

        int digit = n % 10;
        rev = rev * 10 + digit;

        return reverse(n / 10, rev);
    }

    static int countDigits(int n) {
        if (n == 0) {
            return 0;
        }

        return 1 + countDigits(n / 10);
    }


    public static void main(String[] args) {

        System.out.println(countDigits(12345));

//        System.out.println(reverse(1234, 0));
    }
//        System.out.println(power(2,5));


//        int ans = sum(5);
//        System.out.println(ans);
//        int[] arr = {10, 20, 30, 40, 50};
//
//        // Start recursion from index 0
//        ArraySumRecursion.printArrayLeftToRight(arr, 0);


//        int[] arr = {1, 2, 3, 4, 5};
//        printRightToLeft(arr, 0); // 0 se start kiya




//        int[] numbers = {1,2,3,4};
//
//        //start recursion from index 0
//        int total = sumArray(numbers,0);
//
//        System.out.println("Sum:"+total);

    }


