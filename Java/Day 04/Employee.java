package com.employee;
import java.util.Scanner;
public class Employee {

    Scanner sc = new Scanner(System.in);
    public String name;
    int age, power;
    String weapon;
    String planet;

    public void getDetails() {
        System.out.println("Enter the name");
        name=sc.nextLine();
        System.out.println("Enter the age");
        age=sc.nextInt();
        System.out.println("Enter the power");
        power=sc.nextInt();
        System.out.println("Enter the weapon");
        weapon=sc.next();
        System.out.println("Enter the planet");
        weapon=sc.next();
    }

    public void displayDetails() {

        System.out.println("The name is: "+name+" age is: "+age+" the power is: "+power+" and the weapon is: "+weapon);

    }
}
