
public class sortedSearchinMatrix {

    public static void stairSearch(int [][] matrix,int key){
        int i,j;
        i=matrix.length-1;
        j=0;
        while((i>=0) &&(j<=matrix[0].length-1) && (matrix[i][j]!=key)) {
            if (matrix[i][j]<key) {
                j++;
            }
            else{
                i--;
            }
        }
        if (matrix[i][j]==key) {
            System.out.println(i+" "+j);
        }
    }


    public static void main(String fack[]){
        int matrix[][]={{10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50}};

        stairSearch(matrix,32);
    }
}
