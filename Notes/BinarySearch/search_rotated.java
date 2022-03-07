package Notes.BinarySearch;
import java.util.*;

public class search_rotated {
    public static int binarySearch(int[] arr,int n){
        int start = 0;
        int end = n-1;
        
        while(start<=end){
            int mid = start +(end-start)/2;
            int next = (mid + 1)%n;
            int prev = (mid -1 +n)%n;
            if(arr[mid]<arr[next] && arr[mid]<arr[prev] ){
                return mid;
                
            }
            else if(arr[mid]>arr[0]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static int binary(int[] arr ,int lo, int hi,int ele){
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid]==ele){
                return mid;
            }
            else if(arr[mid]>ele){
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        } 
        return -1;
    }
    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ele = sc.nextInt();
        int l = binarySearch(arr,n);
        int p1 = binary(arr, 0, l, ele);
        int p2 = binary(arr, l, n-1, ele);
       

        //System.out.println(binarySearch(arr,ele,n));
        sc.close();
        
    }
}
