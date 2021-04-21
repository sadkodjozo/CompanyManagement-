package companymanagement;

import java.util.List;

/**
 *
 * @author Sadko
 */
public class Customer {
    
    private final int id;
    private final String name;
    Package Package;   
    private int billsPaid;
    private int billsTotal;
    
    
    public Customer(int id, String name, Package pac) {
        this.billsPaid=0;
        this.billsTotal=0;
        this.id = id;
        this.name = name;
        this.Package = pac;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBillsPaid() {
        return billsPaid;
    }

    public int getBillsTotal() {
        return billsTotal;
    }
    public Package getPackage(){
        
        return Package;
    }
    
    //Not going to alter customer id and name.
    /**
     * Used to update customer package.
     * @param pack new package this customer uses.
     */
    public void setPackage(Package pack) {
        this.Package = pack;
    }
    
    /**
     * Customer paid bill
     * Payment subtract from billsTotal
     * @param bill 
     */
    public void createBill( int bill){
        billsTotal+=bill;
    }
    
    public void payBill(int payment){
        billsPaid+=payment;
        billsTotal-=payment;
        Company.updateTotalMoneyEarned(payment);
      }
    
    public int getRemainingBills(){
        return billsTotal-billsPaid;
    }

    @Override
    public String toString() {
        return "\nCustomer{" + id + ", name=" + name + ", package=" + Package.getName() + ", billsPaid=" + billsPaid + ", billsTotal=" + billsTotal + '}';
    }
    
}
