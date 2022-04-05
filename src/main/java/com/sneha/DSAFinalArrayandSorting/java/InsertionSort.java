package com.sneha.DSAFinalArrayandSorting.java;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        InsertionSort m = new InsertionSort();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array:");
        int s = sc.nextInt();

        System.out.println("Enter the array elements:");
        int[] arr = new int[s];
        int i;
        for (i=0;i<s;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The array elements are:");
        m.printArray(arr,s);

        System.out.println("The sorted array is:");
        m.Insertion_Sort(arr);
        m.printArray(arr,s);
    }
    public void Insertion_Sort(int[] arr){
        int i,j;
        for(i=0;i< arr.length-1;i++){
            for (j=i+1;j>0;j--){
                if(arr[j] < arr[j-1]){
                    swap(arr,j,j-1);
                }
            }
        }
    }
    public void printArray(int[] arr,int n){
        int i;
        for (i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
    public void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
