package com.sneha.DSAFinalArrayandSorting.java;
import java.util.*;
public class FactorialinRecursion {
    public static void main(String[] args) {
        FactorialinRecursion s = new FactorialinRecursion();
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter a integer:");
        int n = ss.nextInt();
        int ans = s.Fact(n);
        System.out.println("The factorial of a given number is : "+ans);
    }

    public int Fact(int x){
        if(x<=1){
            return 1;
        }
        return (x * Fact(x-1));
    }
}
