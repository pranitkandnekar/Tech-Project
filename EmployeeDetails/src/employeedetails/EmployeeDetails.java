/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeedetails;

import java.util.Scanner;

/**
 *
 * @author Abhi
 */
public class EmployeeDetails {
    
       private Integer[] EID=new Integer[50];
        private String name[]=new String[50];
     private String Department[]=new String[50];
    private Integer[] Salary=new Integer[50];
    Scanner sc=new Scanner(System.in);  
    EmployeeDetails[] e=new EmployeeDetails[50];
     public void add(int i){
        
             
         
         
         String choice="y";
         while(choice.endsWith("y")) 
         {
        
         System.out.print("Enter your Name : ");
         name[i]=sc.nextLine();
         System.out.print("Enter your Employee id : ");
         EID[i]=sc.nextInt();
         System.out.println("Enter your Department : ");
        Department[i]=sc.next();
         System.out.print("Enter your  Salary : ");
         Salary[i]=sc.nextInt();
             System.out.println("Do you Want to continue (y/n) ");
             choice=sc.next();
         }
    }
     public void Modify(int i){
          String choice="y";
         while(choice.endsWith("y")) 
         {
        
         System.out.print("Enter your Name : ");
         name[i]=sc.nextLine();
         System.out.print("Enter your Employee id : ");
         EID[i]=sc.nextInt();
         System.out.println("Enter your Department : ");
        Department[i]=sc.next();
         System.out.print("Enter your  Salary : ");
         Salary[i]=sc.nextInt();
             System.out.println("Do you Want to continue (y/n) ");
             choice=sc.next();
         }
     }
      public void Display(int i){
           
         String choice="y";
         while(choice.endsWith("y")) 
         {
        
         System.out.print("Enter your Name : "+name[i]);
    
         System.out.print("Enter your Employee id : "+EID[i]);
     
         System.out.println("Enter your Department : "+Department[i]);
        
         System.out.print("Enter your  Salary : "+Salary[i]);
         
             System.out.println("Do you Want to continue (y/n) ");
             choice=sc.next();
         }
    }
     
    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
         EmployeeDetails ep=new EmployeeDetails();
         
        
        char reply='y';
        while(reply=='y'){
           int i=0;
        System.out.println("---------------------------------");
        System.out.println("Welcome to NIIT LTD");
        System.out.println("---------------------------------");
        System.out.println("Press 1 : To Enter Data.");
        System.out.println("Press 2 : To Modify Data.");
        System.out.println("Press 3 : To Delete Data.");
        System.out.println("Press 4 : To Modify Data.");
        System.out.println("Press 5 : To Dispplay Data of all Employees.");
        System.out.println("Press 6: Exit");
        System.out.println("---------------------------------");
        int choice;
        choice=s.nextInt();
        switch(choice){
            
            case 1:ep.add(i);
                break;
            case 2:System.out.println("Enter the eid number who you want to update : ");
            i=s.nextInt();
            ep.Modify(i);
                break;
            case 3:System.out.println("Enter the eid number who you want to Display : ");
            i=s.nextInt();
          //  e[i].Display();
                break;
            case 4:break;
            case 5:break;
            case 6:break;
            default:
                    
        }
            
        }
        
    }
    
}
