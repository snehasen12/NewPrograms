package com.sneha.DSAFinalArrayandSorting.java;
import java.util.*;
public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        OrderAgnosticBinarySearch m = new OrderAgnosticBinarySearch();
        m.OABS();
    }

    public void OABS(){
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the size of an array:");
        int size = s.nextInt();

        System.out.println("Enter the array elements:");
        int[] arr = new int[size];
        int i,count = 0,mid = 0,start = 0,end = arr.length-1;
        for (i=0;i<arr.length;i++){
            arr[i] = s.nextInt();
        }

        System.out.println("Enter the item which is to be searched:");
        int target = s.nextInt();

        boolean isAsc;
        if(arr[start] < arr[end]){
            isAsc = true;
        }
        else{
            isAsc = false;
        }

        while(start<=end){
            mid = start+(end-start)/2;
            if(target == arr[mid]){
                count++;
                break;
            }
            if(isAsc){
                if(target > arr[mid]){
                    start = mid+1;
                }
                else if(target < arr[mid]){
                    end = mid-1;
                }
            }
            else{                                        //here if(isAsc == false)
                if(target > arr[mid]){
                    end = mid-1;
                }
                else if(target < arr[mid]){
                    start = mid+1;
                }
            }
        }
        if(count>0){
            System.out.println("The target is found at "+mid);
        }
        else{
            System.out.println("The target is not found.");
        }
    }
}
