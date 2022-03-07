package Notes.BinarySearch;
import java.util.*;

public class first_last {
    public static int f_index(int[] arr , int ele, int n){
        int i = 0;
        int j = n-1;
        int res =-1;
        while(i<=j){
            int mid = i +(j-i)/2;
            if(arr[mid]==ele){
                res=mid;
                j=mid-1;
            }
            else if(arr[mid]>ele){
                j=mid-1;
            }
            else{
                i=mid+1;
            }
        }
        return res;
    }
    public static int l_index(int[] arr , int ele, int n){
        int i = 0;
        int j = n-1;
        int res =-1;
        while(i<=j){
            int mid = i +(j-i)/2;
            if(arr[mid]==ele){
                res=mid;
                i=mid+1;
            }
            else if(arr[mid]>ele){
                j=mid-1;
            }
            else{
                i=mid+1;
            }
        }
        return res;
    }
    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ele = sc.nextInt();
        System.out.println(f_index(arr,ele,n)+"\t"+l_index(arr,ele,n));
        sc.close();
        
    }
}
