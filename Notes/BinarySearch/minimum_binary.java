package Notes.BinarySearch;
import java.util.*;

public class minimum_binary {
    public static int findMin(int[] arr) {
        int n = arr.length;
        int lo = 0;
        int hi = n-1;
        while(lo<=hi){
            int mid = lo + (hi - lo)/2;
            if(arr[mid]>=arr[(mid+1)%n]){
                return arr[(mid+1)%n];
            }
            else if(arr[mid]<arr[(mid-1+n)%n]){
                return arr[mid];
            }
            else if(arr[mid]>=arr[lo]){
                lo = mid+1;
            }
            else if(arr[mid]<=arr[hi]){
                hi = mid-1;
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
        int ele = findMin(arr);
        System.out.println(ele);
        sc.close();

    }
}
