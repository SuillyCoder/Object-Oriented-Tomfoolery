package snippet;
import java.util.Scanner;

class Customer {
	boolean keepSelecting = true;
	//Declare an array of 0's for the product list (0 means if you didn't pick them. X > 0 means otherwise)
    Scanner money = new Scanner(System.in);
    Scanner productChoice = new Scanner (System.in);
    Scanner keepGoing = new Scanner (System.in);
    Scanner confirm = new Scanner (System.in);
    FinanceSystem finance;
    ProductSystem product;
    VendMachine vend;
    
    // Constructor to accept shared FinanceSystem instance
    public Customer(FinanceSystem finance, VendMachine vend, ProductSystem product) {
        this.finance = finance;
        this.vend = vend;
        this.product = product;
    }

    private double balance;
    public void setBalance(double newBalance) {
        this.balance = newBalance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void insertMoney(double currentBalance) {
        System.out.print("Please enter money to the vending machine: ");
        double moneyInput = money.nextDouble();
        setBalance(currentBalance - moneyInput);
        System.out.println("Current Balance: " + getBalance() + "\n");
        vend.receiveBalance(moneyInput);
    }

	// selectProducts();
	
	public void selectProducts(String[] availableProducts, int[] productCount, double[] productPrice) {
		keepSelecting = true;
		//Run a while loop
		while (keepSelecting == true) {
			vend.displayProducts(product.availableProducts, product.productCount, product.productPrices);
			 System.out.print("Please Input Product Number of Choice: ");
			//Select a number between 1 and who knows what?
			int choiceInput = productChoice.nextInt();
			while (choiceInput <= 0 && choiceInput >= 8) {
				 System.out.print("Invalid Choice. Please pick from 1-7: ");
				 choiceInput = productChoice.nextInt();
			}
			vend.checkProducts(choiceInput);
			 
			 System.out.print("Would you like to keep choosing? [Y/N]: ");
			 char goingInput = keepGoing.nextLine().charAt(0);
			//If you're good, break. Else,continue
			 
			 while (goingInput != 'N' && goingInput != 'n' && goingInput != 'Y' && goingInput != 'y' ) {
				 System.out.print("Invalid Choice. Please enter Y or N: ");
				 goingInput = keepGoing.nextLine().charAt(0);
			 }
			 if (goingInput == 'N' || goingInput == 'n') {
				 keepSelecting = false;
			 }
			 else {
				 continue;
			 }
			
		}
		
	}
	
	// confirmPurchase
	public void customerConfirm(double currentBalance){
		System.out.print("\nWould you like to confirm your purchase?: " );
		 char confirmInput = confirm.nextLine().charAt(0);
		 while (confirmInput != 'N' && confirmInput != 'n' && confirmInput != 'Y' && confirmInput != 'y' ) {
			 System.out.print("Invalid Choice. Please enter Y or N: ");
			 confirmInput = confirm.nextLine().charAt(0);
		 }
			//If you're good, break. Else, continue
			 if (confirmInput == 'Y' || confirmInput == 'y') {
				 if (finance.getProductCost() <= finance.getMoneyBank()) {
					//If the balance is enough, proceed. 
						//Perform all the necessary operations needed 
					 	setBalance(vend.dispenseChange(currentBalance));
						vend.confirmPuchase(getBalance());
						
				 }
				 else {
					//Else, prompt the user to insert more money
					 System.out.println("Insufficient Money. Lacking: PHP " + (finance.getProductCost() - finance.getMoneyBank()));
					 insertMoney(getBalance());
					 customerConfirm(getBalance());
				 }
			 }
			 else {
				 setBalance(currentBalance + finance.getMoneyBank());
				 finance.setMoneyBank(0);
				 product.returnProducts();
			 }
	}
	
}



