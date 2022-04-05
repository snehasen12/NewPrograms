package com.sneha.CodechefPracticeJava;
import java.util.*;
public class EnormousInputTest {
    public static void main(String[] args) {
        EnormousInputTest ss = new EnormousInputTest();
        ss.InputTest();
    }
    public void InputTest(){
        Scanner sc = new Scanner(System.in);
        int count=0;
        int n= sc.nextInt();
        int[] arr=new int[n];
        int k=sc.nextInt();
        for(int i=0;i<n;i++){
            arr[i] =sc.nextInt();

        }
        for (int i=0;i<n;i++){
            //System.out.println(arr[i]);
            if(arr[i]%k==0){
                count=count+1;
            }
        }
        System.out.println(count);
    }
}
