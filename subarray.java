public class subarray {
    public static void MAXSUMsubarray(int number[]){
        int currsum = 0;
        int MAXSUM = Integer.MIN_VALUE;

      for(int i=0; i<number.length;i++){
        int start =i;
        for( int j=i; j<number.length;j++){
            int end = j;
            currsum = 0;
           for(int k=start;k<=end;k++){
              
           currsum += number[k];

              }

            System.out.println(currsum);
            if(MAXSUM < currsum){
                MAXSUM = currsum;
            }

          

        }
        System.out.println();
      }
      System.out.println("max sum : " + MAXSUM);

    }
    public static void main(String args[]){
        int number[] = {2,4,6,8,10};
       MAXSUMsubarray(number);
    }
    
}
