package com.sneha.DSAFinalArrayandSorting.java;
//import java.sql.SQLOutput;
import java.util.*;
public class PatternQuestions {
    public static void main(String[] args) {
        PatternQuestions s = new PatternQuestions();
        //s.Pattern1();
        //s.Pattern2();
        //s.Pattern3();
        //s.Pattern4();
        //s.Pattern5();
       //s.Pattern5AnotherWay();
        //s.Pattern6();
        //s.Pattern7();
        //s.Pattern8();
//        s.Pattern9();
//        s.Pattern10();
        //s.Pattern11();
        //s.Pattern12();
    }
    public void Pattern1(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no. of rows:");
        int n=sc.nextInt();
        //int n;
        for(int rows=0;rows<=n;rows++){
            for(int cols=0;cols<=n;cols++){
                System.out.print("* ");
            }
            System.out.println(); //this statement is used for newline
        }
    }
    public void Pattern2(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no. of rows:");
        int n=s.nextInt();

        for(int rows=0;rows<=n;rows++) {
            for (int cols = 0; cols <= rows; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void Pattern3(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no. of rows:");
        int n=s.nextInt();

        for(int rows=0;rows<=n;rows++) {
            for (int cols = 0; cols <= n-rows; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void Pattern4(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no. of rows:");
        int n=s.nextInt();

        for(int rows=1;rows<=n;rows++) {
            for (int cols = 1; cols <= rows; cols++) {
                System.out.print(cols+" ");
            }
            System.out.println();
        }
    }

    public void Pattern5(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no. of rows:");
        int n=s.nextInt();

        for(int rows=1;rows<=n;rows++) {
            for (int cols = 1; cols <= rows; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int rows=1;rows<=n;rows++){
            for(int cols=1;cols<=n-rows;cols++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void Pattern5AnotherWay(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no. of rows:");
        int n=s.nextInt();

        for(int rows=0;rows<2*n;rows++){
            int totalcolsinRow = rows>n ? 2*n-rows-1 : rows;
            for(int cols=0;cols<=totalcolsinRow;cols++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void Pattern6(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no. of rows:");
        int n=s.nextInt();

        for(int rows=0;rows<n;rows++){
            for(int cols=rows;cols<n;cols++){
                System.out.print(" ");
            }
            for(int cols=0;cols<=rows;cols++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void Pattern7(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no. of rows:");
        int n=s.nextInt();

        for(int rows=0;rows<n;rows++){
            for(int cols=0;cols<=rows;cols++){
                System.out.print(" ");
            }
            for(int cols=rows;cols<n;cols++){
                System.out.print("*");
            }
//            for(int cols=rows;cols<n;cols++){
//                System.out.print(" ");
//            }
            System.out.println();
        }
    }
    public void Pattern8(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no. of rows:");
        int n=s.nextInt();

        for(int rows=1;rows<=n;rows++){
            for(int cols=rows;cols<=n;cols++){
                System.out.print(" ");
            }
            for(int cols=1;cols<rows;cols++){
                System.out.print("*");
            }
            for(int cols=1;cols<=rows;cols++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void Pattern9(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no. of rows:");
        int n=s.nextInt();

        for(int rows=0;rows<n;rows++){
            for(int cols=0;cols<rows;cols++){
                System.out.print(" ");
            }
            for(int cols=1;cols<n-rows;cols++){
                System.out.print("*");
            }
            for(int cols=0;cols<n-rows;cols++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void Pattern10(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no. of rows:");
        int n=s.nextInt();

        for(int rows=1;rows<=n;rows++){
            for(int cols=rows;cols<=n;cols++){
                System.out.print(" ");
            }
            for(int cols=1;cols<=rows;cols++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void Pattern11(){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number of rows is:");
        int n = s.nextInt();

        for(int rows=1;rows<=n;rows++){
            for(int cols=1;cols<=rows;cols++){
                System.out.print(" ");
            }
            for(int cols=0;cols<=n-rows;cols++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void Pattern12(){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number of rows is:");
        int n = s.nextInt();

        for(int rows=1;rows<=n;rows++){
            for(int cols=1;cols<=rows;cols++){
                System.out.print(" ");
            }
            for(int cols=0;cols<=n-rows;cols++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int rows=1;rows<=n;rows++){
            for(int cols=rows;cols<=n;cols++){
                System.out.print(" ");
            }
            for(int cols=1;cols<=rows;cols++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
