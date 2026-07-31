
import java.util.Scanner;

public class Arrays {
    static void main() {
        int arr[][]= {{1,2,3}, {21,20,33}};
        int minValue = arr [0][0];
        //int maxValue = arr[0][0];

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j] < minValue){
                    //Update minValue
                    minValue = arr[i][j];
                }
            }
        }
        System.out.println(minValue);

//        for(int i=0; i<arr.length; i++){
//            for(int j=0; j<arr[i].length; j++){
//                if(arr[i][j] > maxValue){
//                    //Update Max Value
//                    maxValue = arr[i][j];
//
//                }
//            }
//        }
//        System.out.println(maxValue);
//        int sum = 0;
//        int ans = 1;
//
//        //Multiply Of Every Elemnts Of The Given Arrays.
//        for(int i=0; i< arr.length; i++){
//            for(int j=0; j< arr[i].length; j++){
//                int value = arr[i][j];
//                ans = ans*value;
//            }
//        }
//        System.out.println(ans);

        //sum of the every elments
//        for(int i=0; i< arr.length; i++) {
//            for (int j = 0; j <arr[i].length; j++) {
//                int value = arr[i][j];
//                sum = sum + value;
//            }
//        }
//        System.out.println(sum);

//        int arr[][] = new int[3][4];
//        Scanner sc = new Scanner(System.in);
//
//        for(int i=0; i<arr.length; i++){
//            for(int j=0; j<arr[i].length; j++){
//                System.out.println("Provide Value for row=" + i + "and column=" +j);
//                arr[i][j] = sc.nextInt();
//
//            }
//        }
//        for(int rowIndex = 0; rowIndex<=arr.length-1; rowIndex++){
//            for(int colIndex = 0; colIndex<=arr[rowIndex].length-1; colIndex++){
//                System.out.print(arr[rowIndex][colIndex] + " ");
//            }
//            System.out.println();
//        }




          //Declaration
//        int[][] arr;
//        //allocation
//        arr = new int[3][4];
//        //init
//        int [][] brr={
//                {1,2},
//                {2,3,4,5},
//                {3,4,4,5,6,7},
//                {4}
//        };
        //System.out.println(brr[3][1]);
//        int rowlength = brr.length;
//        //int collength = brr[0].length;
//        for(int rowindex=0; rowindex<=rowlength-1;  rowindex++){
//            //jaise hi mai kishi nai row mai aaya
//            //Same point par maine uss row ka collength find out kr liya
//            //current row -> brr[rowIndex]
//            //isame Kitne Columns
//            int collength = brr[rowindex].length;
//            for(int colindex=0; colindex<=collength-1; colindex++){
//                System.out.print(brr[rowindex][colindex] + " ");
//            }
//            System.out.println();
//        }

        //traversal 2D array
//        for(int rowIndex = 0; rowIndex<=brr.length-1; rowIndex++){
//            for(int colIndex = 0; colIndex<=brr[rowIndex].length-1; colIndex++){
//                System.out.print(brr[rowIndex][colIndex] + " ");
//            }
//            System.out.println();
//        }



//        //Fin The Minimum Value
//        int arr[] = {3,2,-5,21,10};
//        int n = arr.length;
//        int minValue = arr[0];
//
//        //Compare to every Elements Of This array.
//        for(int i=0; i<=n-1; i++){
//          if(arr[i]<minValue){
//              //Update to minValue
//              minValue = arr[i];
//          }
//        }
//        System.out.println(minValue);

//        //Max MValue Find Out.
//        int arr[]={3,2,-5,21,15};
//        int n = arr.length;
//        int maxValue = arr[0];
//
//        //Compare to maxvalue every Array Elements.
//
//        for(int i=0; i<=n-1; i++){
//            if(arr[i]>maxValue){
//                //Update To maxValue
//                maxValue = arr[i];
//
//            }
//        }
//        System.out.println(maxValue);

//        int arr[] = {2,3,4,5,6};
//        int ans=1;
//        int n =arr.length;
//        for(int i=0; i<=n-1; i++){
//            int value = arr[i];
//            ans=ans*value;
//        }
//        System.out.println(ans );

//        int arr[] = {10,20,40,50,70};
//        int sum=0;
//        int n = arr.length;
//
//        for(int i=0; i<=n-1; i++){
//            int value = arr[i];
//            sum = sum + value;
//
//        }
//        System.out.println(sum);

//        int arr[] = {12,13,1234};
//
//                int n = arr.length;
//        for(int i=0; i<=n-1; i++) {
//            System.out.println(arr[i]);
//        }

//        int arr[] = new int[5];
//        Scanner sc= new Scanner(System.in);
//        int n = arr.length;
//        //Input
//        for(int i=0; i<=n-1; i++){
//            System.out.println("Provide input for index: " + i);
//            arr[i] = sc.nextInt();
//
//        }
//
//        //print
//        System.out.println("You arry contains: ");
//        for(int val: arr){
//            System.out.println(val);
        }

    public static void sort(Integer[] arr, ReverseCmp reverseCmp) {
    }

//        //declaration
//        int arr[];
//        //allocation
//        arr = new int[5];
//        //intialization
//        int brr[] = {10,20,30,40};
//
//        int n = brr.length;
//        for(int val : brr){
//            System.out.println(val);
//        }
//        for(int index=0; index<=n-1; index++){
//            System.out.println(brr[index]);
//        }

        //Accessing
//        System.out.println("Value at 0 index" + brr[0]);
//        System.out.println("Value at 1 index" + brr[1]);
//        System.out.println("Value at 2 index" + brr[2]);
//        System.out.println("Value at 2 index" + brr[3]);

    }

