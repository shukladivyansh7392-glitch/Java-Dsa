import java.util.Scanner;

public class BinarytoDecimal {
   // import java.util.Scanner;

    public class DecToBin {
        public static void main(String[] args) {
            // Input lene ke liye Scanner ka use
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            int ans = 0;
            int i = 0;

            // Jab tak number 0 nahi ho jata, tab tak loop chalega
            while (n != 0) {
                // 1. Last bit nikalna
                int bit = n & 1;

                // 2. Answer mein bit ko sahi position par add karna
                // Math.pow double return karta hai, isliye (int) lagakar typecast kiya
                ans = (int)(bit * Math.pow(10, i)) + ans;

                // 3. Number ko right shift karna (divide by 2)
                n = n >> 1;

                // 4. Position ko badhana
                i++;
            }

            // Output print karna
            System.out.println("Answer is " + ans);

            sc.close();
        }
    }
}
