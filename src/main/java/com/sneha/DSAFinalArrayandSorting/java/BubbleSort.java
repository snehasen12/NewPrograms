package com.sneha.DSAFinalArrayandSorting.java;
import java.util.*;
public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array is:");
        int size = sc.nextInt();
        int i;
        System.out.println("Enter the array elements are:");
        int[] arr = new int[size];
        for (i=0;i< arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The array elements are:");
        for (i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
        BubbleSort s = new BubbleSort();
            s.Bubble(arr,size);
            System.out.println();

            System.out.println("Sorted array is:");
                s.printArray(arr,size);
    }
    public void Bubble(int[] arr,int size){
        int i,j;
        boolean swapped;
        for(i=0;i<size;i++){
            swapped = false;
            for (j=1;j<size-i;j++){
                if(arr[j-1] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
//                System.out.println("The array is already sorted.");
                break;
            }
        }
//        if(!swapped) {
//            break;
//        }
    }

    public void printArray(int[] arr,int s){

        int i;
        for(i=0;i<s;i++){
            System.out.println(arr[i] + " ");
        }
    }
}
