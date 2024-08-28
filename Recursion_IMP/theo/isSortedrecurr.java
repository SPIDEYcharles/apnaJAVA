public class isSortedrecurr{
    public static boolean isSorted(int arr[],int i){
        if (i==arr.length-1) {
            return true;
        
        }
        if (arr[i]>arr[i+1]) {
            return false;
        }
        return isSorted(arr, i+1);  
    }
    public static void main(String arf[]){
        int arr[] = {1,4,6,8 };
        int i =0;
        System.out.print(isSorted(arr,i));
    }
}