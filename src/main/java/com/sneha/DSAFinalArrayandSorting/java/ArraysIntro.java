package com.sneha.DSAFinalArrayandSorting.java;
//Take an array as input from the user.Search for a given number x and print the index at which it occurs
import java.util.*;
public class ArraysIntro {
    public static void main(String[] args) {
        ArraysIntro ss = new ArraysIntro();
        ss.Arrays();
    }
    public void Arrays(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size=sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the array elements:");
        for(int i=0;i<size;i++){
            arr[i]= sc.nextInt();
        }

        System.out.println("The array elements are:");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Enter the search element:");
        int x=sc.nextInt();

        for(int i=0;i<size;i++){
            if(arr[i]==x){
                System.out.println("x is present at "+i+" index");
            }
//            else{
//                System.out.println("The x is not present in the array.");
//            }
        }

        System.out.println("The x is not present in the array.");
    }
}
