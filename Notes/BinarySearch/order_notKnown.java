package Notes.BinarySearch;
import java.util.*;

public class order_notKnown {
    public static int binarySearcha(int[] arr, int ele,int n){//ascending
        int i = 0;
        int j = n-1;
        while(i<=j){
            int mid = i +(j-i)/2;
            if(ele == arr[mid]){
                return mid;
            }
            else if(arr[mid]<ele){
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        return -1;
    }
    public static int binarySearchd(int[] arr, int ele,int n){//ascending
        int i = 0;
        int j = n-1;
        while(i<=j){
            int mid = i +(j-i)/2;
            if(ele == arr[mid]){
                return mid;
            }
            else if(arr[mid]<ele){
                j=mid-1;
            }
            else{
                i=mid+1;
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
        if(arr[0]<arr[1]){
        System.out.println(binarySearcha(arr,ele,n));}
        else{
        System.out.println(binarySearchd(arr, ele, n));}
        sc.close();
        
    }
}
