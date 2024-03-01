public class RevrseArr {

    public static void reverse(int []arr){

        for (int i = 0; i < (arr.length/2); i++) {
            int temp;
            temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    } 
    public static void main(String[] args) {
        int []duck = {2,4,5,7,9,15,21,31};

        for (int i : duck) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println(":::...........:::");
        System.out.println("     ''':''''    ");

        
        reverse(duck);
    }
}
