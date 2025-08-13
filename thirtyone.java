import javax.swing.plaf.synth.SynthScrollPaneUI;

public class thirtyone {
    public static void diamond(int n){
        // char counter  = 'a';
      
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
                // counter++;
                
            }
            System.out.println();
        }
       
    }
    public static void main(String[] args) {
        diamond(8);
    }
    
}

