

public class patt {
    public static void HOllw_rectangle(int row,int col){
        for(int i =1;i<=row;i++){
            for(int j =1;j<=col;j++){
                
                if( i == row||i == 1||j == 1||j == col){  
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                } 
            }
            System.out.println();
        }
    }

    public static void Inv_rot_half_pyr(int n){
        for(int i =1;i<=n;i++){

            for(int j = 1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void Inv_half_pyr_num(int n){
        for(int i =1;i<=n;i++){

            for(int j = 1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void floyd_pyr(int n ){
        int count =0;
        for(int i =1;i<=n;i++){
            
            for(int j = 1;j<=i;j++){
                count++;
                System.out.print(count+" ");
            }
            System.out.println();
        }
    }

    public static void Zero_one_tri(int n){
        for(int i =1;i<=n;i++){
            
            for(int j = 1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print(1);
                }
                else{
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }

    public static void butterfly_pat(int n){
        for(int i=1;i<=n;i++){

            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){

            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    public static void solid_rhomb(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print("  ");
            }
            for(int j=1;j<=n;j++){

                System.out.print("* ");
            }
        System.out.println();    
        }
    }
    
    public static void hollow_rhomb(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print("  ");
            }
            for(int j=1;j<=n;j++){
                if(i==1||i==n||j==1||j==n){

                    System.out.print("*");
                }
                else{
                    System.out.print("  ");
                }
            }
        System.out.println();    
        }
    }
    
    public static void diamond(int n){
        for(int i=1;i<=n;i++){
            for(int j=(n-i);j>=0;j--){
                System.out.print(" ");
            }
            
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=(n-i);j>=0;j--){
                System.out.print(" ");
            }
            
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
    public static void main(String []args){

        diamond(4);
    }
}
