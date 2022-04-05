package com.sneha.DSAFinalArrayandSorting.java;

public class ProductOfDigitsRecursion {
    public static void main(String[] args) {
        ProductOfDigitsRecursion s = new ProductOfDigitsRecursion();
        int ans = s.Product(1342);
        System.out.println(ans);
    }

    public int Product(int n){
        if(n%10 == n){
            return n;
        }

        return ((n%10) * Product(n/10));
    }
}
