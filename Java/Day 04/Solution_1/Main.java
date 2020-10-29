package com.employee;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
//    int i;
        Scanner scanner = new Scanner(System.in);

        Employee[] avengers=new Employee[3];
//        int i;
        for (int i=0;i<3;i++)
        {
            avengers[i]=new Employee();

        }

        for (int i=0;i<3;i++)
        {
            avengers[i].getDetails();

        }

        for (int i=0;i<3;i++)
        {
            avengers[i].displayDetails();
        }

    }
}
