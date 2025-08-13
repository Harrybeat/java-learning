public class thirty {
    public static void hollow_rectangle(int totlrows, int totlcolum){
        for(int i=1; i<=totlrows; i++){
           for(int j=1; j<=totlcolum; j++){
            if(i == 1 || i == totlrows || j == 1 || j == totlcolum){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
           }
           System.out.println();
        }

    }
    public static void left_side_gape_rectangular(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void inverted_side_rectangular_number(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void flyoid_triangle(int n){
       int  counter =1;
        for(int i=1;i<=n;i++){
         for(int j=1;j<=i;j++){
            System.out.print(counter+" ");
            counter++;
         }
         System.out.println();
        }
    }
    public static void zero_one_triangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public static void butterfly(int n){
        for(int i=1;i<=n;i++){
           for(int j=1;j<=i;j++){
            System.out.print("*");
           }
           for(int j=1;j<=2*(n-i);j++){
            System.out.print(" ");
           }
           for(int j=1;j<=i;j++){
           System.out.print("*");
           }
           System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
               }
               for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
               }
               for(int j=1;j<=i;j++){
               System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void solid_rombus(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void rombus(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void diamond(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
    //   hollow_rectangle(10, 8);
        // left_side_gape_rectangular(4);
    //     inverted_side_rectangular_number(5);
    // flyoid_triangle(5);
    // zero_one_triangle(5);
    // butterfly(010);
    // rombus(7);
    diamond(7);
     }
    
}
