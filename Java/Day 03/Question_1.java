package com.company;

import java.util.Scanner;

public class Question_1 {

    public static void main(String args[]) {
        int marks[] = new int[5];
        int i;
        float total=0, per;
        Scanner scanner = new Scanner(System.in);


        for(i=0; i<5; i++) {
            System.out.print("Enter Marks of Subject"+(i+1)+":");
            marks[i] = scanner.nextInt();
            total = total + marks[i];
        }
        scanner.close();
        //Calculating average here
        per = total/5;
        System.out.println("The percentage of student is: "+per);
        System.out.print("The student Grade is: ");
        if(per>=80)
        {
            System.out.print("A");
        }
        else if(per>=60 && per<80)
        {
            System.out.print("B");
        }
        else if(per>=40 && per<60)
        {
            System.out.print("C");
        }
        else
        {
            System.out.print("D");
        }
    }
}