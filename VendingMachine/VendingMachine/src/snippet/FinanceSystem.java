package snippet;

class FinanceSystem {
		private double moneyBank;
		private double productCost;
		private double change;
		private double retrievalMoney;
		
		//GETTER AND SETTER SYSTEMS
		
		//Money Bank Getter and Setter
		public void setMoneyBank(double newMoneyBank) {
			this.moneyBank = newMoneyBank;
		}
		
		public double getMoneyBank() {
			return this.moneyBank;
		};
		

		//Product Cost Getter and Setter
		public void setProductCost(double newProductCost) {
			this.productCost = newProductCost;
		}
		
		public double getProductCost() {
			return this.productCost;
		};
		
		// Change Getter and Setter
		public void setChange(double newChange) {
			this.change = newChange;
		}
		
		public double getChange() {
			return this.change;
		};
		
		// Change Getter and Setter
		public void setRetrievalMoney(double newRetrievalMoney) {
			this.retrievalMoney = newRetrievalMoney;
		}
				
		public double getRetrievalMoney() {
			return this.retrievalMoney;
		};
		

		// calculateChange();
		
		public void calculateChange() {
			//Calculate the total price of the products
			//Calculate the money within the money slot 
			//Subtract the money give with the total price
			//Store the value within a variable

			setChange(getMoneyBank() - getProductCost());
		}
		
		
}
