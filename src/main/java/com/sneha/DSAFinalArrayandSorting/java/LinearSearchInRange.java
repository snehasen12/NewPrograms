package com.sneha.DSAFinalArrayandSorting.java;
import java.util.Scanner;
public class LinearSearchInRange {
    public static void main(String[] args) {
        LinearSearchInRange sr = new LinearSearchInRange();
        System.out.println(sr.Search_In_Range(1, 6));
    }

    public int Search_In_Range(int start, int end) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter the size of an array:");
        int size = sc.nextInt();

        System.out.println("Enter the array elements:");
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("The array elements are:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println("Enter the element whose index is to be searched:");
        int item = sc.nextInt();
        int i;
        for (i = start; i <= end; i++) {
            int element = arr[i];
            if (element == item) {
                count++;
                break;
            }
        }
        if (count > 0) {
            //System.out.println("Item exist at:"+i);
            System.out.println("The index is:"+i);
            //return i;
        }
//        else{
//            System.out.println("item does not exist in the given array.");
//        }
        return -1;
    }
}
