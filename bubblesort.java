public class bubblesort {
    public static void bubblearray(int arry[]){
        for(int turn=0; turn<arry.length-1; turn++ ){
            for(int j=0; j<arry.length-1-turn; j++){
                if(arry[j] > arry[j+1]){
                    int temp = arry[j];
                    arry[j] = arry[j+1];
                    arry[j+1]= temp;
                }
            }
        }
    }
    public static void isarray(int arry[]){
        for(int i=0; i<arry.length; i++){
            System.out.print(arry[i]);
        }
    }
    public static void sortingsort(int arry[]){
       
        for(int i=0; i<arry.length-1;i++){
            int minpos = i;
            for(int j=i+1;j<arry.length;j++){
                if(arry[minpos] > arry[j]){
                    minpos = j;
                   
                }
                
            }
            int temp = arry[minpos];
            arry[minpos] = arry[i];
            arry[i] = temp;
        }
    }
    public static void insertion(int arry[]){
        for(int i =1;i<arry.length;i++){
            int curr = arry[i];
            int prev = i-1;
           while(prev >=0 && arry[prev] > curr){
               arry[prev + 1] = arry[prev];
               prev--;
           }
           arry[prev + 1] = curr;
        }
    }
    
    
    public static void main(String args[]){
        int arry[] = { 5,4,3,2,1};
       insertion(arry);
        isarray(arry);
    }
    
    
}
