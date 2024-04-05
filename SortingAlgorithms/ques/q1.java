public class q1{

    public static void printArr(int []arr){
        for(int i =0 ;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void bubbleSort(int arr[]){
        
        for(int i=0 ;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int arr[]){

        for (int i = 0; i < arr.length; i++) {
            int p=i;
            for (int j = i; j < arr.length; j++) {
                
                if (arr[p]>arr[j]) {
                    p=j;
                }
                int temp = arr[i];
                arr[i] = arr[p];
                arr[p] = temp;
            }
        }
    }

    public static void insertiSort(int arr[]){

        for (int i = 0; i < arr.length-1; i++) {
            int temp;
            int k= i;
            while ( k>=0 && arr[k]>arr[k+1] ) {
                
                temp = arr[k];
                arr[k] = arr[k+1];
                arr[k+1]= temp;
                --k;
                
            }
                
        }
        
    }

    public static void countingSort(int arr[]){

        int large = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            large = Math.max(large, arr[i]);
        }
        int count[] = new int[large+1];
        for (int i = 0; i < arr.length; i++) {
            
            count[arr[i]]++;
        }
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            int k = count[i];
            while (k>0) {
                arr[j] = i;
                j++;
                k--;
            }
        }
    }
    public static void main (String arg[]){
        int []arr = {3,6,2,1,8,7,4,5,3,1};
        
        countingSort(arr);
        printArr(arr);
    }
}