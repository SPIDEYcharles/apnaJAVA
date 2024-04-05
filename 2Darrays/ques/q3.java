
public class q3 {
    public static void transpose(int matrix[][]){
        int arr[][] = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                arr[j][i] = matrix[i][j];
            }
        }
        printArr(arr);
    }

    public static void printArr(int[][] args) {
        for (int i = 0; i < args.length; i++) {
            for (int j = 0; j < args[0].length; j++) {
                System.out.print(args[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        
        int matrix[][] = {{1,2},{3,4},{5,6}};
        
        
        transpose(matrix);
    }
}
