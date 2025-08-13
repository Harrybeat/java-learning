 import java.util.*;
 public class twentynine {
//     public static void main(String[] args){
//         System.out.print("enter a number :");
//         Scanner sc = new Scanner(System.in);
//         int palindrome = sc.nextInt();
//         if(ispalindrome(palindrome)){
//             System.out.println("Number :"+ palindrome + " it is a palindrome");
//         }
//         else{
//             System.out.println("Number :"+ palindrome + " it is not palindrome");
//         }
//     }
//            public static boolean ispalindrome(int  number){
//             int palindrome = number;
//             int reverse = 0;
//             while(palindrome != 0){
//             int remainder = palindrome % 10;
//             reverse = reverse * 10 + remainder;
//             palindrome = palindrome / 10;
//            }
//            if(number == reverse){
//             return true;
//            }
//            return false;
           
//         }
    

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
                System.out.print("enter a integer : ");
                int digits = sc.nextInt();
                System.out.print("the sum of " + sumDigits(digits));
            }
            public static int sumDigits(int n){
            int sumofDigits = 0;
            while(n>0){
                int lastDigit = n % 10;
                sumofDigits += lastDigit;
                n /= 10;
            }
            return sumofDigits;
        }
 }