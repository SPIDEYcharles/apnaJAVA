

public class binarySearch {

    public static int BinSearch(int []duck,int key){
        int start =0;
        int end =duck.length;
        
        int mid = (start+end)/2;;
        
        while(start<=end){
            if (key==duck[mid]) {
                break;
                
            }
            else if(key>duck[mid]){
                start = mid+1;
                
             }
             else {
                end = mid-1;
             }
             mid = (start+end)/2;
        }
        return mid;
        
    }
    public static void main(String[] fuck){
        int []duck = {2,4,6,8,9,12};
        int key = 12;
        System.out.println(BinSearch(duck,key));
    }
}
