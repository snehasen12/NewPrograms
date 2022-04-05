package com.sneha.DSAFinalArrayandSorting.java;

public class FibonacciNumbers {
    public static void main(String[] args) {
        FibonacciNumbers s = new FibonacciNumbers();
        int a = s.Fibo(2);
        System.out.println(a);
    }

    public int Fibo(int n){

        if(n<2){
            return n;
        }
        return (Fibo(n-1)+Fibo(n-2));
    }
}
