package Notes.BinarySearch;
import java.util.*;
public class des_sorted {
    public static int binarySearch(int[] arr, int ele , int n){
        int i = 0;
        int j = n-1;
        while(i<=j){
            int mid = i+(j-i)/2;
            
            if(ele==arr[mid]){
                return mid;
            }
            else if(ele<arr[mid]){
                i=mid+1;
            }
            else{
                j=mid-1;
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
        System.out.println(binarySearch(arr,ele,n));
        sc.close();
        
    }
}
