package snippet;

class VendMachine {
	 FinanceSystem finance;
	 ProductSystem product;
	 
	  public VendMachine(FinanceSystem finance, ProductSystem product) {
	        this.finance = finance;
	        this.product = product;
	    }
	  
	//SET AND GETTING FUNCTIONS
	private int operational = 1;
	private int used = 0;
	public void setOperational(int newOperational) {
		this.operational = newOperational;
	}
	
	public int getOperational() {
		return this.operational;
	};
	
		//displayProducts();
	
	public void displayProducts(String[] availableProducts, int[] productCount, double[] productPrices) {
		System.out.println("Available Products:" );
		//For each products within the product array...
		for (int i = 0; i < availableProducts.length; i++) {
			//Print out the list of products 
			System.out.print("[" + (i+1) + "]" + " PHP " + productPrices[i] + ": " + availableProducts[i] );
			//Print out their inventory count right beside them.
			System.out.println("  ||  Inventory: " + productCount[i]);
		}
		System.out.println("\n");
	}
	
	// receiveBalance();
				//Call upon the finance system for the function
	
	public void receiveBalance(double moneyInput) {
		if (finance.getMoneyBank()==0) {
			finance.setMoneyBank(moneyInput);
		}
		else {
			finance.setMoneyBank(finance.getMoneyBank() + moneyInput);
		}
	}
	
	public void checkProducts(int choiceInput) {
		//Add that into the arrayList. 
		product.checkAndAddProducts(choiceInput);
		//Add the corresponding price to the cost pool (in another object)
		finance.setProductCost(finance.getProductCost() + product.productPrices[choiceInput-1]);
		System.out.println("Total Cost: " +  finance.getProductCost());
	}
		// checkProducts();
			//Call upon the product system for the function
	public void dispenseProducts(String[] availableProducts) {
		for (int j = 0; j < availableProducts.length; j++) {
			product.retrieveProducts(j);
		}
	}
		// dispenseProducts();
			//Call upon retrieveProducts function()
	
	public double dispenseChange(double currentBalance) {
	    finance.calculateChange();
	    double changeGiven = finance.getChange();
	    System.out.println("Change Received: " + changeGiven);

	    // Update the money bank to subtract the change given to the customer
	    finance.setMoneyBank(finance.getMoneyBank() - changeGiven);
	    
	    // Update the customer's current balance
	    currentBalance += changeGiven;
	    return currentBalance;
	}


	
	public void confirmPuchase(double currentBalance) {
		// confirmPurchase();
		System.out.println("\nTransaction Summary: \n");
		//Call upon the dispense products
		dispenseProducts(product.availableProducts);
		//Call upon the dispense change
		System.out.println("New Balance: " + currentBalance);
			finance.setProductCost(0);
			finance.setChange(0);
			finance.setRetrievalMoney(finance.getMoneyBank());
			finance.setMoneyBank(0);
			
			
			System.out.println("\nEnjoy your drinks!\n");
			used++;
			//After 3 times of usage, set its operational state to 0.
			if (used == 3) {
				operational = 0;
				used = 0;
			}
	
		//Else, prompt the user to insert more money
	}

}
