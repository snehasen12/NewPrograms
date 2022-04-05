package com.sneha.DSAFinalArrayandSorting.java;

import java.util.*;
public class QuickSort {
    public static void main(String[] args) {
        QuickSort sc = new QuickSort();
        Scanner ss = new Scanner(System.in);
//        int[] arr={6,3,9,5,2,8};
//
//        sc.Quick_Sort(arr,0, arr.length-1);
//        sc.print_Array(arr,6);
        int n,i,arr[];
        System.out.println("Enter the size of an array:");
        n=ss.nextInt();
        arr = new int[n];
        System.out.println("Enter the array elements:");
        for(i=0;i<n;i++){
            arr[i]=ss.nextInt();
        }
        System.out.println("The array elements are:");
        sc.print_Array(arr,n);

        System.out.println("The sorted elements are:");
        sc.Quick_Sort(arr,0, arr.length-1);
        sc.print_Array(arr,n);
    }
    public void Quick_Sort(int[] arr,int start,int end){
        if(start<end){
            int Pidx = Partition(arr,start,end);

            Quick_Sort(arr,start,Pidx-1);
            Quick_Sort(arr,Pidx+1,end);
        }
    }
    public int Partition(int[] arr,int start,int end){
        int Pidx = start;
        int pivot = arr[end];

        for(int i=start;i<end-1;i++){
            if(arr[i]<=pivot){
                int temp = arr[Pidx];
                arr[Pidx] = arr[i];
                arr[i] = temp;
                Pidx++;
            }
//            else{
//                i++;
//            }
        }
        int temp= arr[Pidx];
        arr[Pidx]=arr[end];
        arr[end]=temp;

        return Pidx;
    }
    public void print_Array(int[] arr,int n){
        for (int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
}
