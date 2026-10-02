package RecursionBacktracking;

public class sumOfNnums {
    static int sum(int n){
        if(n == 1){
            return 1;
        }
        return n + sum(n-1);
    }

    static void main(String[] args) {
        System.out.println(sum(4));
    }
}
