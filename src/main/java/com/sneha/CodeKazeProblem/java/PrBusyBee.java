package com.sneha.CodeKazeProblem.java;
import java.util.*;
public class PrBusyBee {
        static int countPairs(int a[],int n,int k) {
            // Write your code here.
            //Scanner s=new Scanner(System.in);
            //int T = s.nextInt(); //for taking input of testcases
            //n=s.nextInt();
            //k=s.nextInt();
            //int a[]=new int[n];
            int i,j;
            int c=0;
            for(i=0;i<n;i++){
                for(j=i+1;j<n;j++){
                    if(i<=j){
                        int average = (a[i]+a[j])/2;
                        if(average>=k){
                            c++;
                        }
                    }
                }
            }
//            if(a[i]<=a[j]){
//                int average = (a[i]+a[j])/n;
//                if(average==k){
//                    c++;
//                }
//            }
            return c;
        }
        public static void main(String args[]){
            PrBusyBee ss = new PrBusyBee();
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            int n=sc.nextInt();
            int k=sc.nextInt();
            int a[] = new int[n];
            for(int i=0;i<a.length;i++){
                a[i]=sc.nextInt();
            }
            System.out.println(ss.countPairs(a,n,k));
        }
}

