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
        int n=10;
        System.out.println((n&(n-1)));
        System.out.println(n & -(n));
        }
}
