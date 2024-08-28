public class binaryString {
    public static void binaryStringbuilder(int n, int i, String str){
        if(n==0){
            System.out.println(str);
            return;
            
        }

        if (i==0) {
            binaryStringbuilder(n-1, 1, str+"1");
        }
            binaryStringbuilder(n-1, 0, str+"0");
        
    }
    public static void main(String[] args) {
        int n = 3;
        binaryStringbuilder(n,0,"");
    }
}


            //revise this again 
            // do stack analysis
                                                                                   