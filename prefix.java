import java.util.*;
public class prefix {
    public static void MAXSUMsubarray(int number[]){
      int currsum = 0;
      int maxsum = Integer.MIN_VALUE;
      int prefix[] = new int[number.length];
      prefix[0] = number[0];
      for(int i =1;i<prefix.length;i++){
        prefix[i] = prefix[i-1] + number[i];

      }
      for(int i=0;i<number.length;i++)
        {
         int start =i;
           for(int j=i;j<number.length;j++)
            {
            int end = j;
             currsum = start == 0 ?  prefix[end] :prefix[end]-prefix[end - 1];
                 if( maxsum < currsum)
                {
                    maxsum =  currsum;
                }
            }   
     
        }
        System.out.println("sum of number : "+ maxsum);


    }
    public static void kadanes(int number[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for(int i=0; i<number.length; i++){
            cs = cs + number[i];
            if(cs<0){
                cs=0;
            }
            ms = Math.max(ms,cs);

            
        }
        System.out.println("sum of max number : " + ms);
        
    }
    public static void main(String args[]){
        int number[] = { 1,-2,6,-1,3};
      kadanes(number);

    }

    
    
}
