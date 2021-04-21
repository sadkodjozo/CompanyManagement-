/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package companymanagement;

/**
 *
 * @author Sadko
 */
public class Employee {
    
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;
    
   

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    /**
     * Employee receives Salary.
     * Removes from total money earned by the company.
     * @param salary 
     */
    public void receiveSalary(int salary){
        salaryEarned+=salary;
        Company.updateTotalMoneySpent(salary);
    }

    @Override
    public String toString() {
        return "\nEmployee{" + id + ", name=" + name + ", salary=" + salary + ", salaryEarned=" + salaryEarned + '}';
    }

    
  
    
    
}
