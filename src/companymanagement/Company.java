package companymanagement;

import java.util.List;

/**
 *
 * @author sadko
 */
public class Company {
    private String name;
    private List<Employee> employees;
    private List<Customer> customers;
    private static int moneyBalance;
    private static int totalMoneySpent;

    public Company(String name,List<Employee> employees, List<Customer> customers) {
        this.name=name;
        this.employees = employees;
        this.customers = customers;
        moneyBalance=0;
        totalMoneySpent=0;
    }

    public String getName() {
        return name;
    }
    

    public List<Employee> getEmployees() {
        return employees;
    }
    /**
     * Company hires new employee
     * @param employee 
     */
    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public List<Customer> getCustomers() {
        return customers;
    }
    
    public void addCustomer(Customer customer){
        customers.add(customer);
    }

    public int getMoneyBalance() {
        return moneyBalance;
    }
    
    public static void updateTotalMoneyEarned(int moneyEarned) {
        moneyBalance+=moneyEarned;
    }
    /**
     * Returns total money spent on salary
     * @return 
     */

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }
    /**
     * update the money that is spent for employees salary 
     * @param moneySpent money spent by company
     */
     public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneySpent+=moneySpent;
        moneyBalance-=moneySpent;
    }
    
    
    
    
    
    
}

