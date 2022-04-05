package com.sneha.DSAFinalArrayandSorting.java;

public class BinarySearchwithRecursion {
    public static void main(String[] args) {
        BinarySearchwithRecursion s = new BinarySearchwithRecursion();
        int[] arr = {1,23,56,78,99,100};
        int target = 56;
        System.out.println(s.BS(target,arr,0, arr.length-1));
    }

    public int BS(int target,int[] arr,int start,int end){
        if(start > end){
            return -1;
        }
        int mid = start + (end-start)/2;
        if(arr[mid] == target){
            return mid;
        }
        if(target < arr[mid]){
            return BS(target,arr,start,mid-1);
        }
        return BS(target,arr,mid+1,end);
    }
}
