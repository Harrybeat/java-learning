import java.util.*;
public class 2Darray {
    public static void main(string args[]){
        int matrix[][]= new int [3][3];
        int n= matrix.length; int m= matrix[0].length;
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               matrix[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               System.out.print(array[i][j] + " ");
            }
            System.out.print();
        }
       
    }
    
}
