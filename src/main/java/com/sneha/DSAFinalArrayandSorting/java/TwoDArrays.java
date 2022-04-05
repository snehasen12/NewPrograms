package com.sneha.DSAFinalArrayandSorting.java;
import java.util.*;
public class TwoDArrays {
    public static void main(String[] args) {
        TwoDArrays ss = new TwoDArrays();
        ss.Two_D_A();
    }
    public void Two_D_A(){
        Scanner ss = new Scanner(System.in);

        System.out.println("Enter the no. of rows in the array:");
        int size=ss.nextInt();
        int[][] arr = new int[size][3];

        System.out.println("Enter the array elements:");
        for(int row=0;row< arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                arr[row][col] = ss.nextInt();
            }
        }

        System.out.println("The array is:");
        for(int row=0;row< arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
    }
}
