package snippet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a shared FinanceSystem instance
        FinanceSystem finance = new FinanceSystem();
        ProductSystem product = new ProductSystem();
        // Pass it to both Customer and Maintenance
        VendMachine vend = new VendMachine(finance, product);
        Customer customer = new Customer(finance, vend, product);
        Maintenance maintenance = new Maintenance(finance, vend, product);

        ProductSystem products = new ProductSystem();
        
        // Scanner Inclusion Space
        Scanner pov = new Scanner(System.in);
        Scanner maintenanceTask = new Scanner(System.in);
        customer.setBalance(500);
        // Main Driver Code
        while (true) {
            System.out.println("Welcome to the Vending Machine!");
            System.out.println("Are you a customer or maintenance personnel?\n[1] Customer\n[2] Maintenance Personnel");
            System.out.print("\nChoice: ");
            int povInput = pov.nextInt();
            while(povInput != 2 && povInput != 1) {
            	 System.out.print("Invalid Choice. Please enter either 1 or 2: ");
            	povInput = pov.nextInt();
            }
            if (povInput == 1) {
                if (vend.getOperational() == 0) {
                    System.out.println("Vending Machine Currently Unoperational\n");
                } else {
                    System.out.println("\nSwitching to Customer POV: ");
                    System.out.println("Current Balance: " + customer.getBalance() + "\n");
                    
                    customer.insertMoney(customer.getBalance());
                    customer.selectProducts(products.availableProducts, products.productCount, products.productPrices);
                    customer.customerConfirm(customer.getBalance());
                    
                }
            } else {
                System.out.println("Switching to Maintenance Personnel POV: \n");
                System.out.println("Select Task to Perform: \n[1]: Retrieve Money\n[2]: Maintain Machine\n[3]: Restock Products\n");
                System.out.print("Choice: ");
                int taskInput = maintenanceTask.nextInt();
                if (taskInput == 1) {
                    maintenance.retrievedStoredMoney();
                } else if (taskInput == 2) {
                    maintenance.inspectMachine();
                }
                else {
                	maintenance.restockProducts(product.availableProducts,product.productCount, product.productPrices);
                }

            }
        }
    }
}
