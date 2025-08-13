import java.util.*;
public class twentyeight {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num ;
        System.out.print("Enter a interger : ");
        num = sc.nextInt();
        if(isEven(num)){
            System.out.print("even number :");
        }
        else{
            System.out.print("odd number :");
        }
    }
    public static boolean isEven(int number){
        if(number%2 == 0){
            return true;
        }
        else{
            return false;
        }
    }

    
}
