package com.sneha.DSAFinalArrayandSorting.java;
//Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
//Example :
//email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava”
//email = “helloWorld123@gmail.com”; username = “helloWorld123”
import java.util.*;
public class StringQsThreeAC {
    public static void main(String[] args) {
        StringQsThreeAC as = new StringQsThreeAC();
        as.StringQsThree();
    }
    public void StringQsThree(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The email from the user:");
        String email = sc.nextLine();

        String username = "";
        for(int i=0;i<email.length();i++){
            if(email.charAt(i) == '@'){
                break;
            }else{
                username += email.charAt(i);
            }
        }
        System.out.println("The username is:"+username);
    }
}
