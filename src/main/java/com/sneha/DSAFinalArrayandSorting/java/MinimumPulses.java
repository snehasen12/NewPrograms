package com.sneha.DSAFinalArrayandSorting.java;
import java.util.Scanner;
public class MinimumPulses {
    public static void main(String[] args) {
        MinimumPulses m = new MinimumPulses();
        m.Min_Pulses();
    }

    public void Min_Pulses() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a integer:");
        int n = sc.nextInt();
        //int n = 23;
        int sum = 0;
        //int temp = n;
        //while(n>0){
        //    n = n/10;
        //    count++;
        //}
        if (n > 10) {
            int digit = n % 10;

            sum = sum+digit;//add 1st digit from right hand side i.e. 3
            n=n/10;

            digit = n % 10;
            sum = sum+digit;//add 2nd digit from right hand side i.e.2

            n = n/10;
            if(n==0){
                System.out.println("The number is:"+sum);
            }
            else{
                System.out.println("So the number is:"+Integer.toString(n)+sum);  //Integer.toString(n) is used to convert integer value
                                                                                                        // to string value
            }
            //System.out.println(c);
            //System.out.println("Digit at place "+count+" is:"+digit);
            //temp = temp / 10;
            //count--;
        }
        else{
            System.out.println("The given integer is less than 10");
        }
        //System.out.println(sum);
    }
}
