package com.sneha.DSAFinalArrayandSorting.java;
import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args) {
        BinarySearch s = new BinarySearch();
        s.Binary();
    }

    public void Binary(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array:");
        int x = sc.nextInt();

        System.out.println("Enter the array elements:");
        int[] arr = new int[x];
        int i,count=0,mid=0,start=0,end=x-1;
        for(i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The array elements are:");

        for (i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }

        System.out.println("Enter the item which is to be searched:");
        int item = sc.nextInt();
        while(start<=end){
            mid = (start+end)/2;
            if(item == arr[mid]){
                count++;
                break;
            }
            else if(item <= arr[mid]){
                end = mid-1;
            }
            else if(item >= arr[mid]){
                start = mid+1;
            }
        }
        if(count>0){
            System.out.println("Item is found at:"+mid);
        }
        else{
            System.out.println("Item is not found.");
        }
    }
}
