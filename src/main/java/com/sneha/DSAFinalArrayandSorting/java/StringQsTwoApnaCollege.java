package com.sneha.DSAFinalArrayandSorting.java;
//Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’.
//Example :
//original = “eabcdef’ ; result = “iabcdif”
//Original = “xyz” ; result = “xyz”

import java.util.*;
public class StringQsTwoApnaCollege {
    public static void main(String[] args) {
        StringQsTwoApnaCollege ss = new StringQsTwoApnaCollege();
        ss.StringQsTwo();
    }
    public void StringQsTwo(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the original string:");
        String s=sc.next();
        System.out.println("Original string is:"+s);

        String result="";
        for(int j=0;j<s.length();j++) {
            if (s.charAt(j) == 'e') {
                result += 'i';
            }else{
                result += s.charAt(j);
            }
        }
        System.out.println("The resultant string is:"+result);
    }
}
