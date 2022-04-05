package com.sneha.CodeJam;
import java.util.*;
public class Sample {
    public static void main(String[] args) {
        Sample s = new Sample();
        s.Input();
    }
    public void Input(){
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int N = sc.nextInt();
        String[][] arr = new String[2*N][2*N];

        for(int rows = 0; rows<2*N; rows++) {
            for (int cols = 0; cols < 2*N; cols++) {
                arr[rows][cols] = sc.nextLine();
            }
        }

        for(int rows=0;rows<4;rows++) {
            for (int cols = 0; cols < 2*N; cols++) {
                System.out.print(arr[rows][cols]);
            }
            System.out.println();
        }
    }
}
