public class question {
    public static void bubbleshort(int arry[]){
        for(int turn=0;turn<arry.length-1;turn++){
            for(int j=0;j<arry.length-1-turn;j++){
                if(arry[j]>arry[j+1]){
                    int temp = arry[j];
                    arry[j] = arry[j+1];
                    arry[j+1] = temp;
                }
            }
           
            
        }
       
    }
    public static void Isanarray(int arry[]){
        for(int i=0;i<arry.length;i++){
            System.out.println(arry[i]);
        }
        System.out.print(" ");
    }
    public static void selectionslot(int arry[]){
        for(int i=0;i<arry.length-1;i++){
            int minpos = i;
            for(int j=i+1;j<arry.length;j++){
                if(arry[minpos]>arry[j]){
                    minpos= j;
                }

            }
            int temp = arry[minpos];
            arry[minpos] = arry[i];
            arry[i] = temp;
        }
    }
    
  public static void main(String[] args) {
    int arry[] = {3,6,2,1,8,7,4,3,5,1};
    selectionslot(arry);
    Isanarray(arry);
  }
    
}