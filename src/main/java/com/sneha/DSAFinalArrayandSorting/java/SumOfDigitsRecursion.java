package com.sneha.DSAFinalArrayandSorting.java;

public class SumOfDigitsRecursion {
    public static void main(String[] args) {
        SumOfDigitsRecursion s = new SumOfDigitsRecursion();
        int ans = s.Recursion(1342);
        System.out.println(ans);
    }

    public int Recursion(int n){
        if(n%10 == n){
            return n;
        }

        return ((n%10) + Recursion(n/10));
    }
}
