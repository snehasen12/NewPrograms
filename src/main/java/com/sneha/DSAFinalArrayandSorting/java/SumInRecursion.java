package com.sneha.DSAFinalArrayandSorting.java;

public class SumInRecursion {
    public static void main(String[] args) {
        SumInRecursion s = new SumInRecursion();
        int ans = s.Sum(5);
        System.out.println(ans);
    }

    public int Sum(int n){
        if(n<=1){
            return n;
        }
        return (n+Sum(n-1));
    }
}
