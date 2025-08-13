 
public class twentyfive {
//     public static void printhelloworld(){
//         System.out.println("hello world");
//         System.out.println("hello world");
//         System.out.println("hello world");
//         System.out.println("hello world");
       

//     }
//     public static int calculatesum(int a, int b) {
//         int sum = a + b;
//         return sum;
//     }
//    /*public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//          int sum = calculatesum(a,b);
//          System.out.println("sum of number:" + sum);
       
       
       
//     }*/
//    /* public static void swap(int a, int b){
//         int temp = a;
//         a= b;
//         b= temp; 
//     }

//    /*  public static void main(String[] args){
//         int a = 5;
//         int b = 10;
//         swap(a,b);
//         System.out.println("a  =" + a);
//         System.out.println("b  =" + b);
       
//     }
    
// }*/
//        /*  public static int multiply(int a , int b){
//             int multiply = a*b;
//             return multiply;
        
//         }
//         public static void main(String[] args){
//             int a = 5;
//             int b = 3;
//              int prod =  multiply(a,b);
//              System.out.println("a*b = " +prod);
//              prod = multiply(10,20);
//              System.out.println("a*b = " +prod);
//              prod = multiply(2,2);
//              System.out.println("a*b = " +prod);
//         }*/ 
//       /*  public static int factorial(int n){
//             int f= 1;
//             for(int i=1; i<=n; i++){
//                 f= f*i;
//             }
//             return f;
//         }
//         public static int binoCoeff(int n, int r){
//             int fact_n = factorial(n);
//             int fact_r= factorial(r);
//             int fact_nmr = factorial(n-r);

//             int binoCoeff = fact_n /(fact_r *fact_nmr);
//             return binoCoeff;
//         }
//         public static void main(String[] args) {
//             System.out.println(binoCoeff(5,2));
//         }*/ 
//         public static int sum(int a , int b)  {
//             return a+b;
//         }
//         public static float sum(float a , float b){
//            return a + b;
//         }
// public static boolean isPrime(int n){
//     if(n == 2){
//         return true;
//       }
//     for(int i=2; i<=Math.sqrt(n); i++){
//         if(n % i == 0){
//             return false;

//         }

//     }
//     return true;
//    }
          
//         public static void primesInRange(int n) {
//             for(int i=2; i<=n; i++){
//                 if(isPrime(i)) {
//                     System.out.print(i+" ");
    
//                 }
//             }
//             System.out.println();
            
//         }
public static void binToDec(int binNum){
    int MyNum= binNum;
    int pow = 0;
    int decNum = 0;
    while(binNum > 0){
        int lastDigit =binNum % 10;
        decNum = decNum + (lastDigit * (int)Math.pow(2, pow));

        pow++;
        binNum = binNum/10;

    }

    System.out.println("my decimal number " + MyNum +" = " +decNum);

}

public static void main(String args[]) {
   binToDec(1010);
}
    }

        
    


