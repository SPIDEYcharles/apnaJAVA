

public class diagonalSUm {
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        int count1 =0;
        int count2 = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i==j) {
                    count1+=matrix[i][j];
                }
                if(i+j==matrix.length-1){
                    count2+=matrix[i][j];
                }           

            }
        }
        System.out.println(count1+count2);
    }
}
