package com.sneha.DSAFinalArrayandSorting.java;

import java.util.Scanner;
public class LinearSearchin2DArray {
    public static void main(String[] args) {
        LinearSearchin2DArray s = new LinearSearchin2DArray();
        s.SearchIn2DArray();
    }
    public void SearchIn2DArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row size of an array:");
        int rows = sc.nextInt();
        System.out.println("Enter the column size of an array:");
        int columns = sc.nextInt();
        System.out.println("Enter the 2D array elements are:");
        int[][] arr = new int[rows][columns];
        //int i,j;
        for(rows=0;rows<arr.length;rows++){
            for(columns=0;columns<arr[rows].length;columns++){
                arr[rows][columns] = sc.nextInt();
            }
        }
        System.out.println("The array elements are:");
        for(rows=0;rows< arr.length;rows++){
            for(columns=0;columns<arr[rows].length;columns++){
                System.out.print(arr[rows][columns] + " ");
            }
            System.out.println();
        }
        System.out.println("Enter the target element which is to be searched:");
        int target = sc.nextInt();
        int count = 0;
        for(rows=0;rows< arr.length;rows++){
            for(columns=0;columns<arr[rows].length;columns++){
                if(arr[rows][columns] == target){
                        count++;
                        break;
                }
            }
        }
        if(count>0){
            System.out.println(rows);
            System.out.println("The target element exist at:"+columns);
        }
        else{
            System.out.println("The target element does not exist.");
        }
    }
}
