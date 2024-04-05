public class spiral {

    public static void printSpiral(int matrix[][]){

        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;

        while (startRow <= endRow && startCol<= endCol) {
            
            //top;
            for (int i = startCol; i < endCol; i++) {
                System.out.println(matrix[startRow][i]);
            }

            //right;
            for (int i = startRow; i < endRow; i++) {
                System.out.println(matrix[i][endCol]);
            }

            //bottom
            for (int i = endCol; i > startCol; i-- ) {
                System.out.println(matrix[endRow][i]);
            }

            //left
            for (int i = endRow; i > startRow; i--) {
                System.out.println(matrix[i][startCol]);
            }
            if (endCol==endRow && endRow%2==1 ) {

                System.out.println(matrix[endRow/2+1][endCol/2+1]);
            }

            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
    }
    public static void main (String arg[]){
        int matrix[][]={{1 ,2 ,3 },
                        {6 ,7 ,8 },
                        {11,12,13}};
                        // {16,17,18,19,20},
                        // {21,22,23,24,25}}
            printSpiral(matrix);
    }
    
}
