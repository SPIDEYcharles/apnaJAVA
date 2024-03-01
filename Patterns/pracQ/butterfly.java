public class butterfly {
    public static void main(String[] args) {
        int n =4;
                     
        for (int i = 1; i <= n; i++) {
            // for (int j = 1; j <=i; j++) {
            //     System.out.print("* ");
            // }
            // for (int j = i; j <n; j++) {
            //     System.out.print("  ");
            // }
            // for (int j = i; j <n; j++) {
            //     System.out.print("  ");
            // }
            // for (int j = 1; j <=i; j++) {
            //     System.out.print("* ");
            // }
            for (int j = 1; j <=n; j++) {
                if (j<=i) {
                    System.out.print("* ");
                }
                else{
                System.out.print("  ");
                }
            }
            for (int j = n; j >=1; j--) {
                if (j>i) {
                    System.out.print("  ");
                }
                else{
                System.out.print("* ");
                }
            }
                System.out.println();
        }        


        for (int i = 1; i <=n; i++) {
            // for (int j = n; j >=i; j--) {
            //     System.out.print("* ");
            // }
            // for (int j = i; j >1; j--) {
            //     System.out.print("  ");
            // }
            // for (int j = i; j >1; j--) {
            //     System.out.print("  ");
            // }
            // for (int j = n; j >=i; j--) {
            //     System.out.print("* ");
            // }
            for (int j = n; j >=1; j--) {
                if (j>=i) {
                    System.out.print("* ");
                }
                else{
                System.out.print("  ");
                }
            }
            for (int j = 1; j <=n; j++) {
                if (j<i) {
                    System.out.print("  ");
                }
                else{
                System.out.print("* ");
                }
            }
            
            System.out.println();
        }
    }
}
