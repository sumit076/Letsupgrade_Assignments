package com.quizapplication;
import java.util.Scanner;
public class Sumarray {

    Scanner sc = new Scanner(System.in);
    int N1,N2,N3,Total;


    public void getDetails() {
        System.out.println("Welcome to the new set");
        System.out.println("Enter the Number 1");
        N1=sc.nextInt();
        System.out.println("Enter the Number 2");
        N2=sc.nextInt();
        System.out.println("Enter the Number 3");
        N3=sc.nextInt();
        Total = N1+N2+N3;
    }

    public void displayDetails() {

        System.out.println("Sum is "+Total+"\n");

    }
}