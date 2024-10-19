package snippet;

class ProductSystem {
	public String[] availableProducts = {"Coca Cola","Sprite","Grape Fanta","Royal","Mountain Dew","Minute Maid","Pepsi"};
	public int[] productCount = {10,12,8,9,11,10,7};
	public double[] productPrices = {30.00,35.00,50.00,30.00,45.00,25.00,30.00};
	public int[] productList = {0,0,0,0,0,0,0};
	// checkAndAddProducts();
	
	public void checkAndAddProducts(int choiceInput){
		productList[choiceInput-1]++;
		productCount[choiceInput-1]--;
		for (int i = 0; i < availableProducts.length; i++) {
			if (productList[i] != 0) {
				System.out.print("[" + (i+1) + "]" + " PHP " + productPrices[i] + ": " + availableProducts[i] );
				//Print out the user's number of them right beside them.
				System.out.println("  ||  Selected: " + productList[i]);
			}
			else {
				continue;
			}
		}
		//Add the corresponding product to the arrayList
		//Subtract the specific products'inventory by how many the user picked.
	//If you're good, break. Else, continue
	}
	
	// retrieveProducts();
	public void retrieveProducts(int position) {
		if (productList[position] != 0) {
			System.out.print("[" + (position+1) + "]" + " PHP " + productPrices[position] + ": " + availableProducts[position] );
			//Print out the user's number of them right beside them.
			System.out.println("  ||  Selected: " + productList[position]);
			productList[position] = 0;
		} 
	}
	//Decrease the inventory of a certain products by a certain amount and set the values of the new array. 
	
	
	public void returnProducts() {
		for (int j = 0; j < availableProducts.length; j++) {
			if (productList[j] != 0) {
				//Add the number of selected products back to the productCount array
				productCount[j] += productList[j];
				//Set the productList of a certain product to 0
				productList[j] = 0;
			}
			else {
				continue;
			}
		}
	}
}
