package com.sneha.DSAFinalArrayandSorting.java;

public class NumbersExampleRecursion {
    public static void main(String[] args) {
        NumbersExampleRecursion n = new NumbersExampleRecursion();
        n.print(1);
    }

    public void print(int n){

        if(n==5){
            System.out.println(5);
            return;
        }
        System.out.println(n);
        //this is the last function call i.e. tail recursion
        print(n+1);
    }
}
