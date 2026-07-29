import org.w3c.dom.ls.LSOutput;

public class Methods {
    //declaration and defination
    static void print2kaTable() {
        for (int i = 1; i <= 10; i++) {
            int ans = 2 * i;
            System.out.println("-> " + ans);
        }
    }
        static void printSum ( int x, int y){
            System.out.println("sum :" +(x+y) );
        }
        static void printMultiplication(int a, int b){
        int ans=a*b;
            System.out.println("printmultiplication :- " +ans);
        }
        static int add(int p, int q){
        int sum = p+q;
        return sum;
        }

        static int add(int p, int q, int r){
        int ans = p+q+r;
        return ans;
        }
         static void solve(int num){
             System.out.println("Inside Solve :-" +num);
             num = num*10;
             System.out.println("Inside Solve :-" +num);
         }
         static void printMultiples(){
        int value = 20;
        for(int i=1; i<=10; i++){
            System.out.println(20*i);
        }
             System.out.println(value);
         }


     static void main() {
        //System.out.println("hey");
        //Function(Method) CAll
//        print2kaTable();
//        System.out.print("h1");
        //function call
//        printSum(5,20);
        // printMultiplication(5,2);
//         int result= add(5,5);
//         System.out.println("Add : "  +result);
//         int ans1 = add(4,4);
//         int ans2 = add(4,5,6);
//         System.out.println("ans1 :" +ans1);
//         System.out.println("ans1 :" +ans2);

//         int num=5;
//         System.out.println("Inside Solve :-" +num);
//         solve(num);
//         System.out.println("Inside Solve :-" +num);
        printMultiples();


    }
}


