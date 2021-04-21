/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package companymanagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author sadko
 */
public class Main {

    public static void main(String[] args) {
        
        Employee sarah = new Employee(1,"Sarah",1000);
        Employee ryan = new Employee(2,"Ryan",3000);
        
        List<Employee> employeeList = new ArrayList<>();
        
        employeeList.add(sarah);
        employeeList.add(ryan);
        
                
        Package light = new Package("Light",50);
        Package full = new Package("Full", 70);
        Package premium = new Package("Premium",80);
        
        Customer hannah = new Customer(1,"Hannah",premium);
        Customer rose = new Customer(2,"Rose",full);
        Customer evelyn = new Customer(3,"Evelyn",light);
        
        List<Customer> customerList = new ArrayList<>();
        customerList.add(hannah);
        customerList.add(rose);
        customerList.add(evelyn);
        
       
        Company tmch = new Company("Tmch",employeeList, customerList);
        
        Employee emily = new Employee(4,"Emily",2000);
        tmch.addEmployee(emily);
        
        Customer lisa = new Customer(4,"Lisa",full);
        tmch.addCustomer(lisa);
        
                
        int choice;
        int id;
        int amount;
        Scanner sc = new Scanner(System.in);
        
        
        
        while(true){
        
                System.out.println("\nSelect operation: 1. Create Bills,2.Pay Bill, 3.Pay salary,4. List of customers,5.List of Employees");
                choice=sc.nextInt();
        
        switch (choice){
            case 1:  System.out.println("------Making COMPANY CREATE BILLS FOR ALL CUSTOMERS----");
                 
                customerList.forEach(c -> c.createBill(c.getPackage().getCost()));
                System.out.println("\nCompleted. All users charged by the cost of their packages.\n" );
                System.out.println("----------------------------------------------------");
            break;
            
            case 2:  System.out.println("--------Customers enter shop and wants to pay bill--------");
                while (true) {
                System.out.println("Enter user id who pays bill or enter 0 to go back");
                choice=sc.nextInt();
                 
                if (choice==0) break;
                if (choice<=customerList.size()){  
                id = choice-1;
                System.out.println("Enter amount of payment for user " + customerList.get(id).getName()+ " : ");
                amount = sc.nextInt();
                customerList.get(id).payBill(amount);
                System.out.println("User "+customerList.get(id).getName() +
                            " paid " +amount +" New balance is "+customerList.get(id).getBillsTotal() );
                }else System.out.println("Customer not in the list!");
            }
            break;
            
            
            case 3: System.out.println("------Making COMPANY PAY SALARY----"); 
                    while(true){
                System.out.println("Enter employee id or enter 0 to go back ");
                choice = sc.nextInt();
                if(choice==0){
                    break;
                }
                if (choice<=employeeList.size()){                    
                       
                id = choice-1;
                 
                employeeList.get(id).receiveSalary(employeeList.get(id).getSalary());
                System.out.println("Employee "+ employeeList.get(id).getName()+ " recives salary $"+ employeeList.get(id).getSalary());
                   
                System.out.println("Money spent on salarys by "+tmch.getName()+ " " +tmch.getTotalMoneySpent() 
                        +tmch.getName()+"\nBalance= "+tmch.getMoneyBalance());
                System.out.println("----------------------------------------------------");
                
                    }else System.out.println("Employee not in the list!");
                } 
             break; 
             
             
           case 4: System.out.println("List of customers: " +customerList);
                break;
           case 5: System.out.println("List of employees: " +employeeList);
                break;
           default:  System.out.println("Please enter number 1-5");
            }
        }
                   
 
    }
    
}
