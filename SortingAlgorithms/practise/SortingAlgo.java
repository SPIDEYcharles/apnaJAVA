

public class SortingAlgo {

     public static int min(int arr[]){
        int mini = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (mini>arr[i]) {
                mini = arr[i];
            }
        }
        return mini;
    }

    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void bubbleSort(int arr[]){
    
        for (int turns = 0; turns < arr.length-1; turns++) {
            for (int i = 0; i < arr.length-1-turns; i++) {
                if (arr[i]>arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }   
    }

    public static void selectionSort(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            int p = i;
            for (int j = i; j < arr.length; j++) {
                
                if (arr[p] > arr[j]) {
                    p = j;
                }
            }
            
            int temp = arr[i] ;
            arr[i] = arr[p];
            arr[p] = temp;
        }    
    }
    
    public static void insertionSort(int arr[]){

        for (int i = 0; i < arr.length-1; i++) {
            int k=i;
            while(k>=0 && arr[k]>arr[k+1]){

                int temp = arr[k];
                arr[k] = arr[k+1];
                arr[k+1] = temp;
                --k;
            }
        }
    }

    public static void countingSort(int arr[]){
        int largeNum = Integer.MIN_VALUE;
        
        for (int i = 0; i < arr.length; i++) {
                largeNum = Math.max(largeNum,arr[i]);
        }
        
        int[] count = new int[largeNum+1];
        for (int i = 0; i < arr.length; i++) {            
            count[arr[i]]++;
        }

        int k = 0;
        for (int i = 0; i < count.length; i++) {
            int j = count[i];
            while(j>0) {
                arr[k] = i;
                k++;
                j--;
            }
        }
    }

    public static void main(String args[]){
        int arr[] = {2,6,3,2,1,5,4,4,4};

        insertionSort(arr);
        
        printArr(arr);
    }
}
