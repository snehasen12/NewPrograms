package com.sneha.DSAFinalArrayandSorting.java;

public class CountNoOfZeroesinaNumber {
    public static void main(String[] args) {
        CountNoOfZeroesinaNumber s = new CountNoOfZeroesinaNumber();
        int ans = s.Count(1024);
        System.out.println(ans);
    }
    public int Count(int n){
        int c=0;
        return helper(n,c);
    }

    private int helper(int n, int c) {
        if(n==0){
            return c;
        }
        int rem = n%10;
        if(rem==0){
            return helper(n/10,c+1);
        }
        return helper(n/10,c);
    }
}
