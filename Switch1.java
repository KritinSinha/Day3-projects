
package day.pkg3.prog2;
import java.lang.String;
import java.lang.System;
import java.util.Scanner;
public class Switch1
{
  public static void main(String[] args) 
  {
      char name;
      int age;
      float salary;
      char gender;
      int phone;
       
      System.out.println("1.Enter Name");
      System.out.println("2.Enter Age");
      System.out.println("3.Enter Salary");
      System.out.println("4.Enter Gender");
      System.out.println("5.Enter telephone no.");
      System.out.println("Your Choice is");
      
      Scanner sc=new Scanner(System.in); 
      int choice;
      choice=sc.nextInt();
      
      switch(choice)
      {
          case 1:
              System.out.println("Your name is");
              name=sc.nextLine().charAt(0);
              break;
              
          case 2:
              System.out.println("Your age is");
              age=sc.nextInt();
              break;
              
          case 3:
              System.out.println("Provide your salary");
              salary=sc.nextFloat();
              break;
              
          case 4:
              System.out.println("Provide your gender");
              gender=sc.nextLine().charAt(0);
              break;
          case 5:
              System.out.println("Your telephone number is");
              phone=sc.nextInt();
              break;
              
          default:
              System.out.println("Please select from the given choices");
              break;
      }
             
      }
      
      
      
    }
    

