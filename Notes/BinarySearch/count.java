package Notes.BinarySearch;

import java.util.*;

public class count {

    public static int c_binary(int[] arr , int ele , int n){
        int lo = 0;
        int hi = n-1;
        int res = -1;
        while(lo <= hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid]==ele){
                res = mid;
                hi = mid-1;
            }
            else if(arr[mid]<ele){
                lo = mid+1;
            }
            else{
                hi = mid-1;
            }
        }
        return res;
    }
    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        int ele = sc.nextInt();
        int t = c_binary(arr , ele , n);
        int c = 0;
        for(int i=t;i<n;i++){
            if(arr[i]==ele){
                c++;
            }
        }

        System.out.println(c);
        sc.close();
    }
}
