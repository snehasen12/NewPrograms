package com.sneha.DSAFinalArrayandSorting.java;

import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        LinearSearch s = new LinearSearch();
        s.Linear();

    }

    public void Linear(){
        int count=0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size = s.nextInt();

        System.out.println("Enter the array elements:");
        int arr[] = new int[size];
        for(int i=0;i< arr.length;i++) {
            arr[i] = s.nextInt();
        }

        System.out.println("The array elements are:");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println("Enter the element which is to be searched:");
        int item = s.nextInt();
        int i;
        for(i=0;i<arr.length;i++) {
            if (arr[i] == item) {
                count++;
                break;
            }
        }
        if (count > 0){
            System.out.println("Item exist at:"+i);
        }
        else{
            System.out.println("item does not exist in the given array.");
        }

    }
}
