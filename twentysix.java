import java.util.*;
public class twentysix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a first number :");
        double a = sc.nextDouble();
        System.out.print("enter a second  number :");
        double b = sc.nextDouble();
        System.out.print("enter a third number :");
        double c = sc.nextDouble();
        System.out.println("enter the average :" +average(a,b,c)+ "/n");
       
    }
    public static double average(double a , double b, double c){
        return (a+b+c)/3;
    }
}
    
    

