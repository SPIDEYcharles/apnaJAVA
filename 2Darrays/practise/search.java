import java.util.*;

public class search {
    
    public static boolean searchMatrix(int [][] matrix,int key){

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j]==key) {
                    System.out.println(key+" found at ("+i+","+j+")");
                    return true;
                }
            }
        }
        return false;
    }

    public static void MinMaxSearch(int matrix[][]){

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int a,b,p,q;
        a=b=p=q=0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                max = Math.max(max, matrix[i][j]);
                if(max == matrix[i][j]){
                     a = i;
                     b = j;
                }
                min = Math.min(min,matrix[i][j]);
                if (min == matrix[i][j]) {
                     p = i;
                     q = j;
                }
            }
        }
        System.out.println(max+" "+min+" "+"are max,min at"+"("+a+","+b+")"+"and ("+p+","+q+")");
    }

    public static void main(String arg[]){
        int matrix[][] = new int [3][3];
        int n = matrix.length; int m = matrix[0].length;

        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();

            }
        }
        MinMaxSearch(matrix);
        searchMatrix(matrix,3);
    }
}
