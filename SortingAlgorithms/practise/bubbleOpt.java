public class bubbleOpt {

    public static void optSort(int arr[]){
        
        for (int turns = 0; turns < arr.length-1; turns++) {
                int swap =0;
                for (int i = 0; i < arr.length-1-turns; i++) {
                if (arr[i]>arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    swap++;
                }
                if(swap != 0){
                    break;
                }
            }
        }
    }
    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        optSort(arr);
        printArr(arr);

    }
}
