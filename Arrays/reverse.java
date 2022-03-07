package Arrays;

import java.util.*;

public class reverse{
public static void reverse(int[] arr,int n){
    int i = 0;
    int j = n-1;
    while(i<=j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
public static void main(String[] args)throws Exception{
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    reverse(arr,n);
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
}
}