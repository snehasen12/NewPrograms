package com.sneha.DSAFinalArrayandSorting.java;

import java.util.Scanner;
public class LinearSearchInStrings {
    public static void main(String[] args) {
        LinearSearchInStrings s = new LinearSearchInStrings();
        s.SearchInString();
        System.out.println();
    }

    public boolean SearchInString(){
        int count=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size:");
        int size = sc.nextInt();

        System.out.println("Enter the string:");
        //String s1 = new String();
        String s1 = sc.next();
        char[] arr = new char[size];

        for(int i=0;i<arr.length;i++){
            arr = s1.toCharArray();
        }

        System.out.println("The string is:");
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i] + " ");
        }
        int i = 0;// here i = 0 is used for intializing.

        System.out.println("Enter the target alphabet:");
        char target = sc.next().charAt(i);
        for(i=0;i<arr.length;i++){
            if(arr[i] == target){
                    count++;
                    break;
            }
        }
        if(count>0){
            //System.out.println("The target alphabet exist at:"+i);
            return true;
        }
       else{
//            System.out.println("The target alphabet does not exist.");
            return false;
        }
        //return false;
    }

}
