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
// int n = arr.length;
//         int start = 0;
//         int end = n - 1;
//         while(start<=end){
//             int mid = start + (end - start)/2;
//            // mid = (mid+n)%n;
//             if(arr[mid] == target){
//                 return mid;
//             }
//             else if(arr[mid]>=arr[start]){
//                 if(target>=arr[start] && target<=arr[mid]){
//                     end = mid-1;
//                 }
//                 else{
//                     start = mid+1;
//                 }
//             }
//             else{
//                 if(target >=arr[mid] && target <=arr[end]){
//                     //end = mid-1;
//                     start = mid+1;
//                 }
//                 else{
//                    // start = mid+1;
//                     end = mid-1;
//                 }
//             }
//         }
//         return -1;