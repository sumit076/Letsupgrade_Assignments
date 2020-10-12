package com.company;
import java.util.*;

public class Question_2 {
    public static void main(String args[]) {
        int salary;
        String name, dob;
        int sal1,sal2,sal3,sal4;
        Scanner get = new Scanner(System.in);

        System.out.println("Enter Name of the Employee:");
        name = get.nextLine();
        System.out.println("Enter DOB of the Employee:");
        dob = get.nextLine();
        System.out.println("Enter the salary: ");
        salary = get.nextInt();
        System.out.println("Employee Name: "+name);
        System.out.println("Age: "+dob);
        get.close();

            sal1 = ((salary*20)/100)+salary;
            sal2 = ((salary*15)/100)+salary;
            sal3 = ((salary*10)/100)+salary;
            sal4 = ((salary*5)/100)+salary;

        System.out.print("The net salary is: ");
        if(salary>=500000)
        {
            System.out.print(sal1);
        }
        else if(salary>=400000)
        {
            System.out.print(sal2);
        }
        else if(salary>=300000)
        {
            System.out.print(sal3);
        }
        else if(salary>=200000)
        {
            System.out.print(sal4);
        }
        else {
            System.out.println(salary);
        }

        }
    }


