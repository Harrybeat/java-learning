public class codearray {
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
    public static void Isanarray(int array[]) {
        for(int i=0;i<array.length;i++){
            System.out.println(array[i] + " ");
        }
        System.out.println();
        
    }
    public static void selectionslot(int arry[]){
        for(int i=0;i<arry.length-1;i++){
            int minpos = i;
            for(int j=i+1;j<arry.length;j++){
                if(arry[minpos]>arry[j]){
                    minpos = j;
                   
                }
            }
            int temp = arry[minpos];
            arry[minpos] = arry[i];
            arry[i] = temp;
        }
        
    }
    public static void insertion(int arry[]){
        for(int i=0;i<arry.length;i++){
            int curr = arry[i];
            int prev = i-1;
            while(prev>=0 && arry[prev]>curr){
                arry[prev+1] = arry[prev];
                prev--;
            }
            arry[prev+1] = curr;
        }
    }
    public static void countingsort(int arry[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arry.length;i++){
            largest = Math.max(largest,arry[i]);
        }
        int count[] = new int [largest+1];
        for(int i=0;i<arry.length;i++){
            count[arry[i]]++;
        }
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arry[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void main(String[] args) {
        int arry[] = {1,4,2,1,4,3,7};
        countingsort(arry);
        Isanarray(arry);
        //pratices1
        // float marks[] = {45.7f,67.8f,63.4f,99.2f,100.0f};
        // float sum = 0;
        // for(float element:marks){
        //     sum = sum + element;
        // }
        // System.out.println(sum);
        //pratices2
        // float marks[] = {45.7f,67.8f,63.4f,99.2f,100.0f};
        //  float num = 45.72f;
        //  boolean Isanarray = false;
        //  for(float element: marks){
        //     if(num == element){
        //         Isanarray = true;
        //         break;

        //     }
        // }
        //    if(Isanarray){
        //     System.out.println("this is a element : " +num);
        //    }
        //    else{
        //     System.out.println("this is not an array :" + num);
        //  }

        //pratices3
        // float marks[] = {45.7f,67.8f,63.4f,99.2f,100.0f};
        //  float sum = 0;
        //  for(float element:marks){
        //     sum = sum + element;
        //  }
        //  System.out.println("the value of average is : " +sum/marks.length);

    }
    
}


