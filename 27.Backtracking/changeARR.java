public class changeARR{
    public static void changeArr(int arr[],int i,int v){
        //base
        if(arr.length==i){
            printArr(arr);
            System.out.println();
            return;
        }
        //recursion
        arr[i]=v;
        changeArr(arr, i+1, v+1);
        arr[i]=arr[i]-2;

    }

    public static void printArr(int arr[]){
        for (int i : arr) {
            System.out.print(i);
        }
    }
    public static void main(String arg[]){
        int arr[]=new int[5];
        changeArr(arr,0,1);
        printArr(arr);
    }
}