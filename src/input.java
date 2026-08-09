import java.util.Scanner;

public class input {
    static void main(String[] args) {
        System.out.println("Hello divyansh Enter the number");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1 :");
        int a = sc.nextInt();
        System.out.println("Enter the number 2 :");
        int b = sc.nextInt();
       int sum = a+b;
        System.out.println(sum);
    }
}
