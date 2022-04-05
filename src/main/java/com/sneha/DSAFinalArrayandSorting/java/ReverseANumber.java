package com.sneha.DSAFinalArrayandSorting.java;

public class ReverseANumber {
    static int sum = 0;
    public static void main(String[] args) {
        ReverseANumber s = new ReverseANumber();
        s.funcReverse(123);
        System.out.println(sum);
    }
    //static int sum = 0;
    public void funcReverse(int n){
        if(n == 0){
            return;
        }
        int rem = n%10;
        sum = sum*10+rem;
        funcReverse(n/10);
    }
}
