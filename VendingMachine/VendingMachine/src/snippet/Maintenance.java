package snippet;
import java.util.Scanner; 

class Maintenance {
	//Shared Instances Class Declaration
	FinanceSystem finance;
	ProductSystem product;
	VendMachine vend;

    private double storedMoney;
    Scanner restocker = new Scanner (System.in);
    Scanner stockNum = new Scanner (System.in);
    Scanner stockConfirmation = new Scanner (System.in);
    boolean keepStocking = false;
    private String[] technicalSkills = { "Hardware Proficiency", "Electrical Knowledge","Circuit Knowledge"};
    
    // Constructor to accept shared FinanceSystem instance
    public Maintenance(FinanceSystem finance, VendMachine vend, ProductSystem product) {
        this.finance = finance;
        this.vend = vend;
        this.product = product;
    }

    public void setStoredMoney(double newStoredMoney) {
        this.storedMoney = newStoredMoney;
    }

    public double getStoredMoney() {
        return this.storedMoney;
    }

    public void retrievedStoredMoney() {
        System.out.println("Money in the bank: " + finance.getRetrievalMoney());
        if (finance.getRetrievalMoney() == 0) {
            System.out.println("No Money Present Within the Money Bank\n");
        } else {
            setStoredMoney(finance.getRetrievalMoney());
            finance.setRetrievalMoney(0);
            System.out.println("Retrieved: " + getStoredMoney());
        }
    }

    public void inspectMachine() {
        if (vend.getOperational() == 0) {
            System.out.println("Machine Requiring Maintenance.");
            System.out.println("Please Stand By.....\n");
            maintainMachine();
        } else {
            System.out.println("Machine is in Operational Condition.\n");
        }
    }

    public void maintainMachine() {
        if (technicalSkills[0].equals("Hardware Proficiency") && 
            technicalSkills[1].equals("Electrical Knowledge") && 
            technicalSkills[2].equals("Circuit Knowledge")) {
            vend.setOperational(1);
            System.out.println("Machine Restored to Operational Condition\n");
        } else {
            System.out.println("Not skilled enough to maintain the machine\n");
        }
    }
    
    public void restockProducts(String[] availableProducts, int[] productCount, double[] productPrices) {
    	//While true: 
    	keepStocking = true;
    	while (keepStocking == true) {
    		//Display all the products
        	vend.displayProducts(product.availableProducts,product.productCount,product.productPrices);
        	
        	//Enter the choice of products to enter
        	System.out.print("Enter the product to restock [1-7]: ");
        	int stockInput = restocker.nextInt();
        	
        	//Enter the number of them to restock
        	System.out.print("How many would you like to restock?: ");
        	int stockNumInput = stockNum.nextInt();
        	
        	//Add them to their necessary array.
        	product.productCount[stockInput-1] += stockNumInput;
        	
        	//Ask if they wanna keep going or stop entirely. 
        	System.out.print("Do you wish to keep restocking? [Y/N]: ");
        	char confirmationInput = stockConfirmation.nextLine().charAt(0);
        	
        	if (confirmationInput == 'N' ||  confirmationInput == 'n') {
        		System.out.println("Restocking Complete\n");
        		keepStocking = false;
        	}
        	
    	}
    
    }
}
