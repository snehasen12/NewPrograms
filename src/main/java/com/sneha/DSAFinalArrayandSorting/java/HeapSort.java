package com.sneha.DSAFinalArrayandSorting.java;
import java.util.*;
public class HeapSort {
    public static void main(String[] args) {
        HeapSort hp = new HeapSort();
        Scanner ss = new Scanner(System.in);
        int n,i,arr[],index;

        System.out.println("Enter the size of an array:");
        n=ss.nextInt();
        arr = new int[n];

        System.out.println("Enter the array elements:");
        for(i=0;i<n;i++){
            arr[i]=ss.nextInt();
        }
        System.out.println("The array elements are:");
        hp.print_Array(arr,n);

        System.out.println("The sorted elements are:");
        hp.buildheap(arr);
        hp.print_Array(arr,n);
    }

    public void heapify(int[] arr,int n,int i){ //i- is used for denoting index of the root
        int largest = i;
        int left = 2*i;
        int right = 2*i+1;
        if(left<n && arr[left]>arr[largest]){
            largest=left;
        }
        if(right<n && arr[right]>arr[largest]){
            largest=right;
        }
        if(largest!=i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;


            heapify(arr,n,largest);
        }
    }
    public void buildheap(int arr[]){
        int n = arr.length;
        for(int i=n/2-1;i>=0;i--){
            heapify(arr,n,i);
        }
    }
//    public void swap(int a,int b){
//        int temp = a;
//        a = b;
//        b = temp;
//    }
    public void print_Array(int[] arr,int n){
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
}
