package com.sneha.DSAFinalArrayandSorting.java;
//here both time complexity is O(n).
public class ReverseNumbersRecursion {
    public static void main(String[] args) {
        ReverseNumbersRecursion s = new ReverseNumbersRecursion();
        //s.Reverse(5);
        //s.func(5);
        s.funcBoth(5);
    }

    public void Reverse(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        Reverse(n-1);
    }
    public void func(int n){
        if(n == 0){
            return;
        }
        func(n-1);
        System.out.println(n);
    }
    public void funcBoth(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        funcBoth(n-1);
        System.out.println(n);
    }
}
