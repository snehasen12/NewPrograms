package com.sneha.DSAFinalArrayandSorting.java;
import java.util.Scanner;
public class CountEvenNumberOfDigits {
    public static void main(String[] args) {
        //int num = 0;
        CountEvenNumberOfDigits s = new CountEvenNumberOfDigits();
        System.out.println(s.Count());
    }

    public int Count(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array:");
        int size = sc.nextInt();

        System.out.println("Enter the array elements are:");
        int[] arr = new int[size];
        int i;
        for(i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The array elements are:");
        for(i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
        int count = 0;
        System.out.println("The no. of elements whose length is even:");
        for(i=0;i< arr.length;i++) {
            int numberofdigits = EvenNumberOfDigits(arr[i]);
            if (numberofdigits % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public int EvenNumberOfDigits(int num){
        int count =0;
        while(num > 0){
            count++;
            num = num / 10;
        }
        return count;
    }
}
