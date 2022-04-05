package com.sneha.DSAFinalArrayandSorting.java;
import java.util.*;
public class SelectionSort {
    public static void main(String[] args) {
        SelectionSort m = new SelectionSort();
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

//        System.out.println("The sorted array by finding minimum element is:");
//        m.Selection(arr,s);
//        m.printArray(arr,s);
        System.out.println("The sorted array by finding maximum element is:");
        m.Selectionsort(arr,s);
        m.printArray(arr,s);
    }
    public void Selection(int[] arr,int s){
        int i,j;
        for(i=0;i<s-1;i++){
            int min = i;
            for (j=i+1;j<s;j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
//        for(i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }
    }
    public void Selectionsort(int[] arr,int s){
        int i,j;
        for(i=0;i<s-1;i++){
            int max = i;
            for (j=i+1;j<s;j++){
                if(arr[j]<arr[max]){
                    max = j;
                }
            }
            swap(arr,i,max);
        }
//        for(i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }
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
