package com.quizapplication;
import java.util.Scanner;
public class SumarrayMain {

    public static void main(String[] args) {
        // write your code here
//    int i;
        Scanner scanner = new Scanner(System.in);

        Sumarray[] avengers=new Sumarray[3];
//        int i;
        for (int i=0;i<5;i++)
        {
            avengers[i]=new Sumarray();
            avengers[i].getDetails();
            avengers[i].displayDetails();

        }

        
    }
}
