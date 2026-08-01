import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class BitwiseOperator {
    static void main() {

//        int a = 5;
//        int b = 6;
//        System.out.println(a & b);
//        System.out.println(a | b);
//        System.out.println(a ^ b);
//        System.out.println(~a);

//        int n = 5;
//        for(int i=1; i<=34; i++){
//            n = n << 1;
//            System.out.println(n);
//            System.out.println();
//        }

//        int n = 100;
//        for (int i = 1; i <= 10; i++) {
//            n = n >> 1;
//            System.out.println(n);
//            System.out.println();
//        }

//        int n =11;
//        if((n&2)==0){
//            System.out.println("even");
//        }
//        else{
//            System.out.println("odd");
//        }


        //Count number of set bits (1s)
//        int n=0;
//        int count = 0;
//        while(n != 0){
//            if((n&1) != 0){
//                //mujhe ek set bit milai
//                count ++;
//            }
//            //right shift to remove this bit
//            n = n >>1;
//        }
//        System.out.println("Set Bit :" +count);
//    }


//        Check if number is power of 2
//        int n=15;
//        if((n&(n-1)) == 0){
//            System.out.println("This is power of 2");
//        }
//        else{
//            System.out.println("This is not Power of 2");
//        }

//        System.out.println(3 << 2);
        //3 *2 *2


        //Last set bit remove trick
//        int n=10;
//        System.out.println((n&(n-1)));
//        System.out.println(n & -(n));
//


        //Home work questions.....


        //Que:1. Write a program to count number of set bits.
//        int n = 15;
//        int count = 0;
//        while (n != 1) {
//            if ((n & 1) != 0) {
//                count++;
//            }
//            n = n >> 1;
//        }
//        System.out.println("Set Bit :" + count);


        //Que:2. Find missing number in array (using XOR).
//         int arr[] = {1,2,3,5};
//         int n = 0;
//         for(int i=1; i<=(n&(n-1)); i++){
//
//                 System.out.println(arr);
//             }

         //Que:3. Find two unique numbers (others appear twice).

//            int arr[] = {10,24,17,24,10,13,17};
//            int n = 0;
//
//            for(int i=1; i<=n-1; i++){
//                arr = arr^0;
//            }
//        System.out.println(arr);


//            //Que:4. Check if number is power of 4
//        int n =16;
//        if((n&(n-1)) == 0){
//            System.out.println("this is the power of 2");
//        }
//        else{
//            System.out.println("This is not power of 2");
//        }

        //Que:5.Convert decimal to binary manually











        //Que:6.Implement fast exponentiation using bitwise

















        //que:7. Decimal to binary convert.

//        public class DecToBin {
//            public static void main(String[] args) {
                // Input lene ke liye Scanner ka use
//                Scanner sc = new Scanner(System.in);
//                int n = sc.nextInt();
//
//                int ans = 0;
//                int i = 0;
//
//                // Jab tak number 0 nahi ho jata, tab tak loop chalega
//                while (n != 0) {
//                    // 1. Last bit nikalna
//                    int bit = n & 1;
//
//                    // 2. Answer mein bit ko sahi position par add karna
//                    // Math.pow double return karta hai, isliye (int) lagakar typecast kiya
//                    ans = (int)(bit * Math.pow(10, i)) + ans;
//
//                    // 3. Number ko right shift karna (divide by 2)
//                    n = n >> 1;
//
//                    // 4. Position ko badhana
//                    i++;
//                }
//
//                // Output print karna
//                System.out.println("Answer is " + ans);

                //sc.close();




        //Binary to Decimal


                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt(); // Jaise input diya: 101

                int ans = 0;
                int i = 0;

                while (n != 0) {
                    // 1. Aakhiri digit nikalna (10 se remainder)
                    int digit = n % 10;

                    // 2. Agar digit 1 hai, toh 2 ki power ko answer mein jodna
                    if (digit == 1) {
                        ans = ans + (int)Math.pow(2, i);
                    }

                    // 3. Number ka aakhiri digit hatana (10 se divide)
                    n = n / 10;

                    // 4. Power ki position badhana
                    i++;
                }

                System.out.println("Answer is " + ans);
                sc.close();
            }
        }















//         }
//    }



