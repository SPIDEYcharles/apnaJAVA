
public class q2 {
    
    public static int sumRow(int array[][],int row){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (i==row-1) {
                    count+=array[i][j];
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
    
        int array[][] = {{1,4,9},{11,4,3},{2,2,3}};

        int row = 2;
        System.out.println(sumRow(array,row));

    }
}
