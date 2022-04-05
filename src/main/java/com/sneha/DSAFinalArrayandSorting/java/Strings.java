package com.sneha.DSAFinalArrayandSorting.java;
import java.util.*;
public class Strings {
    public static void main(String[] args) {
        Strings ss = new Strings();
        ss.Str();
    }
    public void Str(){
        Scanner s = new Scanner(System.in);
//        System.out.println("Enter your name:");
//        String name = s.nextLine();
//        System.out.println("Name is:"+name);
        //string concatenation
//        String firstName = "Sneha";
//        String lastName = "Chakroborty";
//        String fullName = firstName + " " + lastName;
//        System.out.println(fullName);

        //for finding the length of a string
//        String firstName = "Sneha";
//        String lastName = "Chakroborty";
//        String fullName = firstName + " " + lastName;
//        System.out.println(fullName);
//        System.out.println(fullName.length());

        //print the all characters of the fullname individually
        //here we use charAt for printing the individual characters
//        for(int i=0;i<fullName.length();i++){
//            System.out.println(fullName.charAt(i));
//    }
//        String name1 = "Sneha";
//        String name2 = "Sneha2";

        //compare the two strings
        // for comparing two strings we have three rules:-1 s1>s2: +ve value
                                                        //2 s1 == s2: 0
                                                        //3 s1<s2: -ve value
//        if(name1.compareTo(name2) == 0){
//            System.out.println("Strings are equal");
//        }else{
//            System.out.println("Strings are not equal");
//        }
        //for getting substring from a sentence
        //substring concept-> substring(beg index,end index)
//        String n = "My name is Sneha Sen";
//        String sn = n.substring(11);
//        System.out.println(sn);

        //Strings are Immutable
        //Immutable means we can't modify the string,can't delete the string,it will be on the memory
//1. Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.
        System.out.println("Enter the length of the array:");
        int size = s.nextInt();
        String[] arr = new String[size];

        System.out.println("Enter the array elements:");
        for(int i=0;i<size;i++){
            arr[i] = s.next();
        }
        int totallength=0;
        System.out.println("The array elements are:");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");

            totallength += arr[i].length();
        }
        System.out.println();
        System.out.println("The total length of the string is:"+totallength);
    }
}
