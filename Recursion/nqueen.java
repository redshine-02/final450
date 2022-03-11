package Recursion;

// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0) {
            int n = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            ArrayList<ArrayList<Integer>> ans = ob.nQueen(n);
            if(ans.size() == 0)
                System.out.println("-1");
            else {
                for(int i = 0;i < ans.size();i++){
                    System.out.print("[");
                    for(int j = 0;j < ans.get(i).size();j++)
                        System.out.print(ans.get(i).get(j) + " ");
                    System.out.print("] ");
                }
                System.out.println();
            }
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution{
    static ArrayList<ArrayList<Integer>> nQueen(int n) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        int[][] chess = new int[n][n];    
        puzzle( chess , 0 , ans);
        return ans;
    }
    
    static void puzzle(int[][] chess , int row , ArrayList<ArrayList<Integer>> result){
        if(row > chess.length){
            return;
        }
        if(row == chess.length){
            ArrayList<Integer> ans = new ArrayList<>();
            for(int i=0; i<chess.length; i++) {
                for(int j=0; j<chess[0].length; j++) {
            		if(chess[i][j] == 1)
                	ans.add(j+1);
                	//break;
                }
            }
            result.add(ans);
		    return;
            
        }
        
        for(int c = 0 ; c<chess.length ; c++){
            chess[row][c]=1;
            if(isSafe( row , c , chess )){
               
                puzzle(chess , row+1 , result);
            }
            chess[row][c]=0;
        }
        
        
    }
    
    static boolean isSafe(int r , int c ,  int[][] chess){
        for(int i = r-1 , j = c+1 ; i>=0 && j<chess.length ; i--,j++){
            if(chess[i][j]==1){
                return false;
            }
        }
        for(int i = r-1 , j = c ; i>=0  ; i--){
            if(chess[i][j]==1){
                return false;
            }
        }
        for(int i = r-1 , j = c-1 ; i>=0 && j>=0 ; i--,j--){
            if(chess[i][j]==1){
                return false;
            }
        }
        return true;
    }
}