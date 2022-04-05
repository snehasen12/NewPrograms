package com.sneha.DSAFinalArrayandSorting.java;

public class Palindrome {
    static int sum = 0;
    public static void main(String[] args) {
        Palindrome s = new Palindrome();
        s.RevFunc(1234321);
        s.Palin(1234321);
    }
    public void RevFunc(int n) {
        if (n == 0) {
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        RevFunc(n / 10);
    }

    public void Palin(int n){
        if(n == sum){
            System.out.println("The given number is palindrome.");
        }
        else{
            System.out.println("Not Palindrome.");
        }
    }
}
