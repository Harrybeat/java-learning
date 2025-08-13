public class array2 {
    public static int getslargest(int number[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<number.length;i++){
            if(largest<number[i]){
               largest  = number[i];
            }
            if(smallest > number[i]){
                smallest = number[i];
            }
        }
        System.out.println("samllest number:"+ smallest);
        return largest;

    }
  public static void main(String[] args) {
    int number[]={1,2,3,5,7,8,9};
    System.out.println("largest number : "+ getslargest(number));
  }
}
/*  public static int getlargest(int number[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<number.length;i++){
        if(largest < number[i]){
           largest = number[i];
        }
        if(smallest > number[i]){
          smallest = number[i];
        }
         
        }
        
        System.out.println("smallest number :"+ smallest);
        return largest;

    }
    public static void main(String args[]){
        int number[] = {2,4,6,8,1,5};
        System.out.println("largest number : " + getlargest(number) );
    } */