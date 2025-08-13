public class arrayfive {
    public static int binarynumber(int number[],int key){
        int start = 0 ,end = number.length-1;
        while(start<=end){
            int mid = (start + end)/2;
            if(number[mid] == key){
                return mid;
            }
            if(number[mid] < key){
                start = mid+1;
            }else{
                end = mid+1;
            }

        }
        return -1;

    }
    public static void main(String[] args){
        int number[] = {2,4,5,3,6,7,8};
        int key = 8;
        System.out.println(binarynumber(number,key));
    }
    
}
