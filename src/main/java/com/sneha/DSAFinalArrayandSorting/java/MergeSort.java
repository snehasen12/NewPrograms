package com.sneha.DSAFinalArrayandSorting.java;


import java.util.*;
public class MergeSort {
    public static void main(String[] args) {
        MergeSort ss= new MergeSort();
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int size=s.nextInt();

        System.out.println("Enter the array elements:");
        int[] arr=new int[size];

        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        System.out.println("The array elements are:");
        ss.printArray(arr,size);

        //ss.Divide(arr,0, arr.length-1);

        System.out.println("The sorted array is:");
        ss.Divide(arr,0, arr.length-1);
        ss.printArray(arr,size);
    }
    public void Conquer(int[] arr,int start,int mid,int end){
        int[] mergedArray = new int[end-start+1];
        int k=0;
        int index1=start;
        int index2=mid+1;
        //mid=start+(end-start)/2;
        while(index1<=mid && index2<=end){
            if(arr[index1] <= arr[index2]){
                mergedArray[k] = arr[index1];
                k++;
                index1++;
            }
            else{
                mergedArray[k] = arr[index2];
                k++;
                index2++;
            }
        }
        while(index1<=mid){
            mergedArray[k] = arr[index1];
            k++;
            index1++;

        }
        while(index2<=end){
            mergedArray[k] = arr[index2];
            k++;
            index2++;
        }
        for(int i=0,j=start;i< mergedArray.length;i++,j++){
            arr[j]=mergedArray[i];
        }
    }
    public void Divide(int[] arr,int start,int end){
        if(start>=end){
            return;
        }
        int mid=start+(end-start)/2;
        Divide(arr,start,mid);
        Divide(arr,mid+1,end);
        Conquer(arr,start,mid,end);
    }
    public void printArray(int[] arr,int n){
        int i;
        for (i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
