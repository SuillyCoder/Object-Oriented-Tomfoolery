import java.util.*;
public class Prac2_2{
    //Create a class named BankAccount with the following private attributes: accountNumber, balance, and accountType.
    //Write getter and setter methods for each attribute.
    //Implement a method deposit that takes an amount as input and adds it to the balance.
    //Implement a method withdraw that takes an amount as input and subtracts it from the balance, ensuring that the balance doesn't go below zero.
    
    static void deposit(BankAccount bankAcc, int wallet){
        //Set a scanner variable for the amount to deposit
        Scanner amount = new Scanner (System.in);
        //Ask the user for the amount to deposit in
        System.out.print("Enter the amount to deposit: ");
        int deposit = amount.nextInt();
        //Set the amount in the bank account equal to the amount entered. 
        bankAcc.setBalance(bankAcc.getBalance() + deposit);
        //Decrement the value in your wallet
        wallet -= deposit;
        System.out.println("You have deposited: PHP " + deposit);
        System.out.println("Your current balance is: " + wallet);
    }

    static void withdraw(BankAccount bankAcc, int wallet){
        //Set a scanner variable for the amount to deposit
        Scanner amount = new Scanner (System.in);
        //Ask the user for the amount to deposit in
        System.out.print("Enter the amount to withdraw: ");
        int withdraw = amount.nextInt();
        //Set the amount in the wallet equal to the amount entered. 
        wallet += withdraw;
        //Decrement the value in your bank account
        bankAcc.setBalance(bankAcc.getBalance() - withdraw);
        System.out.println("You have deposited: PHP " + withdraw);
        System.out.println("Your current balance is: " + wallet);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        BankAccount bankAcc = new BankAccount();
        int action = 1;
        int wallet = 10000;
        //Declare the initial variables
        //Authenticate the user by asking for their acc number. 
        while (true){
            System.out.print("\nEnter your account number: ");
            int accNum = input.nextInt();
            while (bankAcc.getAccNum() != accNum){
                System.out.println("\nIncorrect account number: ");
                System.out.print("Please input again: ");
                accNum = input.nextInt();
            }
        while (action != 0){
            System.out.println("\n\n===== ACCESS GRANTED ===== ");
             //Select one of three functions.
            System.out.println("Select Action to perform: \n\n[1] Deposit Cash\n[2] Withdraw Cash\n[3] Change Account Number\n[0] Exit\n\n");
            System.out.println("Current Balance: " + wallet);
            System.out.print("\nEnter your choice: ");
            action = input.nextInt();
            switch(action){
                case 1: 
                    //Call in the function for depositing money.
                    deposit(bankAcc,wallet);
                    break;
                case 2:
                    //Call in the function for withdrawing money.
                    deposit(bankAcc,wallet);
                    break;
                case 3:
                    System.out.print("Enter your new account number: ");
                    int newAccNum = input.nextInt();
                    System.out.print("Are you sure you want to set this as your new account number? [Y/N]: ");
                    char confirmation = input.next().charAt(0);
                    if (confirmation == 'Y' || confirmation == 'y')
                        bankAcc.setAccNum(newAccNum);
                    break;
                }
            }
        }
    }
}