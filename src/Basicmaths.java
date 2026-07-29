public class Basicmaths {
    static void printDigits(int num){
        //Agar mera Num=0 to mai ruk jaunga.
        //agar mera num!=0 to mai processing krta rahunga.

        while(num != 0){
            int digits = num%10;
            System.out.println(digits);
            //last disit
            num = num/10;

        }
    }
    static int countDigits(int num){
        //Agar mera Num=0 to mai ruk jaunga.
        //agar mera num!=0 to mai processing krta rahunga.
        int count = 0;
        while(num != 0){
            int digits = num%10;
          count++;
            //last disit
            num = num/10;

        }
        return count;
    }

    static int sumDigits(int num){
        //Agar mera Num=0 to mai ruk jaunga.
        //agar mera num!=0 to mai processing krta rahunga.
int sum = 0;
        while(num != 0){
            int digits = num%10;
            sum = sum+digits;
            //last disit
            num = num/10;

        }
        return sum;
    }
    static int reverseNum(int num){
        int revNum =0;
        //ans = ans*10+digits.
        while(num != 0){
            int digits = num % 10;
            //reverse number calculater as per formula.
            revNum = revNum * 10 + digits;
            //last digit remove from number.
            num = num /10;
        }
        return revNum;
    }

      static boolean palidomeNum(int num){
        int originalNum = num;
        int reverseNum = reverseNum(num);
        if(originalNum == reverseNum){
            System.out.println("It is palidrome number: ");
            return true;
        }
        else{
            System.out.println("It is not palidrome number: ");
            return false;
        }
      }

      static boolean isPrimeOrNot(int num){
        //second method
          for(int i=2; i*i<=num; i++){
              if(num % i==0){
                  //not prime
                  return false;
              }
//        for(int i=2; i<=num-1; i++){
//            if (num % i == 0) {
//                //not prime
//                return false;
//            }
            }
        //Yaha tabhi pahuch paoge jab loop se bahar nikloge.
          //aur loop se bahar tabhi nikaloge jab kabhi bhi
          //reminder mai zero n aaye
          //or agar kabhi reminder zero nahi aaya
          //iska matlb its a prime
          return true;

      }

      static int getGDC(int a, int b){
        //gdc(a,b) = gcd(b, a%b);
          while(b != 0){
              int oldVAlueOfb = b;
              b = a%b;
              a = oldVAlueOfb;
          }
          //jab mera b 0 hoga tab a ki place par gdc milega.
          int ans = a;
          return ans;
      }
      static int getLCM(int a, int b){
        int gcd = getGDC(a,b);
        // gcd = 18,12 = 6
          int prod = a*b;
          //prod(a,b) -> 18*12 = 216
          int lcm = prod/gcd;
          //lcm = 216/6 = 36
          return lcm;
      }

      static boolean isArmstrongNumber(int num){
        int sum=0;
        int originalNum = num;
        while(num != 0){
            int digit = num%10;
            int cubeOfDigit = digit*digit*digit;
            sum = sum + cubeOfDigit;
            //digit remove from sum
            num = num/10;
        }
        if(sum == originalNum){
            return true;
        }
        else{
            return false;
        }
      }

      static boolean checkPerfectNumber(int num){
        int sum = 1;
        for(int i=2; i*i<=num; i++){
            if(num % i == 0){
                //i ne num ko perfectly divide ke diya hai.
                //toh ab factor pair kya banega
                //1st fector alredy visible hai (i)
                //2nd factor -> num/i
                int firstFactor = i;
                int secondfactor = num/i;
                sum = sum + firstFactor + secondfactor;
            }
        }
        if(sum == num){
            return true;
        }
        else{
            return false;
        }
      }
      static void checkAllPrimes(int n){
        //print all prime number from 1 to N.
          //1 is not a prime number
          for(int num=2; num<=n; num++){
              boolean isPrime = isPrimeOrNot(num);
              if(isPrime == true){
                  System.out.println(num);
              }
          }
      }

      //Check whether number is prime or not
//    int num =5;
//    for(int i=2; i*i<=num; i++){
//        if(num%i == 0){
//            return false;
//        }
//        return true;
//    }
      static boolean isEvenOdd(int num) {


//        int num = 1;
          for (int i = 1; i <= num; i++) {
              if (num % 2 == 0) {
                  return true;
              }
//            return false;
          }
          return false;
      }

      
    static void main() {
      boolean evenodd = isEvenOdd(22);
        System.out.println(evenodd);

//        checkAllPrimes(100);
        //System.out.println(checkPerfectNumber(7));
       // System.out.println(isArmstrongNumber(122));
//       boolean Arm = isPrimeOrNot(153);
//        System.out.println(Arm);

//System.out.println(getLCM(18,12));
//        int temp = getGDC(18,12);
//        System.out.println(temp);

//            boolean prime = isPrimeOrNot(15);
//              System.out.println(prime);
//        boolean ans = palidomeNum(1221);
//        System.out.println(ans);
//        int num = 1498;
//        int revNum = reverseNum(num);
//        System.out.println(revNum);
//        int num =  53127;
//        int sum = sumDigits(num);
//        System.out.println(sum);
//        int ans = countDigits(num);
//        System.out.println(ans);
//printDigits(num);

    }

}
