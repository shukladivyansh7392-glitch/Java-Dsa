import java.util.Scanner;

public class StringBasics {



 static void printString(String str){
  int n = str.length();
  for(int i=0; i<n; i++){
   char ch = str.charAt(i);
   System.out.println(ch);
  }

 }

 static int getLengthOfString(String str){
  char[] arr = str.toCharArray();
  int len = arr.length;
  return len;
 }
 static int getConsonantsCount(String str){
  int count = 0;
  for(int i=0; i<str.length(); i++){
   char ch =str.charAt(i);
//   if(ch == 'b' || ch == 'c' || ch == 'd' || ch == 'f' || ch == 'g'  || ch == 'j' || ch == 'k' || ch == 'l' || ch == 'm' || ch == 'n' || ch == 'p'  || ch == 'q' || ch == 'r' || ch == 's' || ch == 't' || ch == 'v' || ch == 'w' || ch == 'x' || ch == 'y'  || ch == 'z'){
   if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' ){
   count++;
  }
 }
  return count;
 }


 static int getVowelCount(String str){
  int count = 0;
  for(int i=0; i<str.length(); i++){
   char ch = str.charAt(i);
   if(ch == 'b' || ch == 'c' || ch == 'd' || ch == 'f' || ch == 'g' || ch == 'j' || ch == 'k' || ch == 'l' || ch == 'm' || ch == 'n' || ch == 'p'  || ch == 'q' || ch == 'r' || ch == 's' || ch == 't' || ch == 'v' || ch == 'w' || ch == 'x' || ch == 'y'  || ch == 'z'){

    count++;
     }
   }
  return count;
 }

 static String reverseString(String str){
  String reverse = "";
  int n = str.length();
  for(int i=n-1; i>=0; i--){
   char ch = str.charAt(i);
   reverse = reverse+ch;
  }
  return reverse;
 }

 static boolean isPalindrome(String str){
  String original = str;
  String reverse = reverseString(original);
  //compare
  for(int i=0; i<original.length(); i++){
   char ch1 = original.charAt(i);
   char ch2 = reverse.charAt(i);
   if(ch1 != ch2){
    //no match
    return false;
   }
  }
  //loop se bahar mai tabhi aaunga
  //jab saare elements match kar rahe honge
  //iska matalab return true
  return true;
 }



 static void main() {

  String words = "my name is divyansh";

//  String str ="0123456789";
//  System.out.println(str.contains("11"));

//  String ba = "  Divya   ";
//  ba.trim();
//  ba = ba.trim();
//  System.out.println(ba.length());

 //String str = "Divyansh";
  //System.out.println(getConsonantsCount(str));
//  System.out.println(isPalindrome(str));
  //System.out.println(reverseString(str));
 // System.out.println(getVowelCount(str));
 // System.out.println(getLengthOfString(str));
//  printString(str);
//  String name = "divyansh";
//  name=name.replace('v','k');
//  System.out.println(name);

//  //split -> output -> String array
//  String input = "My,name,i s,love,babbar";
//  String[] words = input.split(",");
//     for(String str: words){
//   System.out.println(str);
//  }



//  String name = "BAbbar";
//  char[] crr = name.toCharArray();
//
//  //Print the char array
//  for(char ch : crr){
//   System.out.println("Value of Char: " +ch);
//  }

//  String name = "Rana Love Babbar";
//  System.out.println(name.startsWith("Rana"));
//  System.out.println(name.endsWith("Babbar"));

//  int num = 54321;
//  String str = String.valueOf(num);
//  System.out.println(num+1);
//  System.out.println(str +1);




  //Empty -> length = 0
  //Blank -> Empty or Sirf Spaces h String
//  String str = "  ";
//  System.out.println(str.length());
//  System.out.println(str.isEmpty());
//  System.out.println(str.isBlank());
//  String name = " love   ";
//  System.out.println(name.length());
//  name = name.trim();
//  System.out.println(name.length());
//  String name = "Divyansh";
//  System.out.println(name.toUpperCase());
//  String str = "LOVe";
//  System.out.println(str.toLowerCase());

//  String str = "My Name Is Divyansh Shukla";
//  //0 -> M
//  //1 -> y
//  //2 -> Spaces
//  //Beginindex -> 3 ->inclusive
//  //Endindex -> 6 -> exclusive
//  System.out.println(str.substring(3, 7));
//  System.out.println(str.contains("Divyansh"));


//  String str = "Divyansh";
//  System.out.println(str.length());
//  System.out.println(str.charAt(0));
//  String name = "DIVYANSH";
//  System.out.println(str.equals(name));
//  System.out.println(str.equalsIgnoreCase(name));

//  Scanner sc = new Scanner(System.in);
//  System.out.println("Provide The String Content");
//  String str = sc.nextLine();
//  System.out.println("Value of nextLine(): " + str);
//
//  System.out.println("Provide the string Content: ");
//  String str2 = sc.next();
//  System.out.println("Value of next(): " + str2);

//  String name1 = "Love";
//  String name2 = "LOVE";
//
//  if(name1.equals(name2)){
//   System.out.println("Both String are Equal");
//  }
//  else{
//   System.out.println("Both String Are not equal");
//  }












//  String firstName = "Divyansh";
//  String lastName = new String("Shukla");
//  System.out.println(firstName + " " + lastName);
//  //System.out.println(firstName[0]);
//  System.out.println(firstName.length());
//  System.out.println(firstName.charAt());

//  String name = "Rana";
//  // name[0] = 'B';
//  name = "Bana";
//  System.out.println(name);


 }
}
