public class array4 {
    public static int largeSmallNo(int number[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<number.length;i++){
            if(largest <number[i]){
                largest = number[i];
            }
            if(smallest > number[i]){
                smallest = number[i];
            }
        }
        System.out.println("smallest number :"+ smallest);
        return largest;
    }
    public static void main(String[] args){
        int number[] = {1,2,4,6,3,7,8};
        System.out.println("largest number :"+ largeSmallNo(number));
    }    
}
