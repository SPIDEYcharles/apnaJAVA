public class OccurenceInArray {

    public static int firstOccur(int arr[], int k, int i){
        if (arr[i]==k) {
            return i;
        }
        if(i==arr.length){

            return -1;
        }
        return firstOccur(arr,k,i+1);
    }

    public static int lastOccur(int arr[],int k , int i){
        
        if(i==arr.length){
            return -1;
        }
        int isFound = lastOccur( arr, k,i+1);
        if (isFound==-1 && arr[i]==k) {
            return i;
        }
        return isFound;
    }
    public static void main(String arg[]){
        int arr[] = {1,3,5,4,6,7,8,5,3,8};
        System.out.println(lastOccur(arr, 5, 0));
    }
}
