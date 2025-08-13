import java.util.*;
public class ten {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a weak name = ");
        int weak = sc.nextInt();
        switch(weak){
            case 1 : System.out.println("monday");
            break;
            case 2 : System.out.println("Tuesday");
            break;
            case 3 : System.out.println("Wednesday");
            break;
            case 4 : System.out.println("thursday");
            break;
            case 5 : System.out.println("friday");
            break;
            case 6 : System.out.println("Saturday");
            break;
        
        default :
            System.out.println("Sunday");
        }
          

    }
    
}
