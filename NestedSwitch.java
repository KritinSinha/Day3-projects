/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nestedswitch;

import java.util.*;


public class NestedSwitch {

    public static void main(String[] args) 
    {
        int x,y,z;
        int choice,choice1,choice2,choice3;
        System.out.println("1.CSE");
        System.out.println("2.ETC");
        System.out.println("3.MECH");
        
        Scanner sc=new Scanner(System.in);
        System .out.println("Enter your choice");    
        choice=sc.nextInt(); 
        
        switch(choice)
        {
            case 1:
                
                System.out.println("Select Location");
                       
                System.out.println("1.Mumbai");
                System.out.println("2.Bhubaneswar");
                System.out.println("3.Ahmedabad");
                System.out.println("Enter your choice");
               
                choice1=sc.nextInt();
                
                     switch(choice1)
                     {
                         case 1:
                     System.out.println("Rs.1600000");
                     break;
                         case 2:
                     System.out.println("Rs 200000");
                     break; 
                         case 3:
                     System.out.println("Rs.5000000");
                     break;
                     
                         default:
                     System.out.println("Please select the correct option");
                     break;
                     }
                     
                     
                     choice2=sc.nextInt();
                     
                     switch(choice2)
                     {
                         case 1:
                     System.out.println("Rs.1100000");
                     break;
                         case 2:
                     System.out.println("Rs 900000");
                     break; 
                         case 3:
                     System.out.println("Rs.4560000");
                     break;                         
                     } 
                     
                     choice3=sc.nextInt();
                     switch(choice3)
                     {
                         case 1:
                     System.out.println("Rs.1800000");
                     break;
                         case 2:
                     System.out.println("Rs 100000");
                     break; 
                         case 3:
                     System.out.println("Rs.800000");
                     break;
                         
                     }
        
        break;
        }
    }
}
                     
                     
                     
                         
        

    
    

