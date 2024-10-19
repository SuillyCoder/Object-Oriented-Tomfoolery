//PRACTICE PROMPT 1: 
    //Create a method that takes an array of integers as input.
    //The method should return the average of all the even numbers in the array.
    //If there are no even numbers, the method should return -1.

import java.util.ArrayList;
import java.util.Scanner;
public class Prac1_1{
    //ARRAY AVERAGING CODE
    static int arrayAverage ( ArrayList<Integer> numberList){
        //Initialize the return variable (average)
        int average = 0; int divider = 0;
        //For each element of the array
        for (int x = 0; x < numberList.size(); x++){
              //If the element is even, then add the divider and return variable
              if (numberList.get(x) % 2 == 0){
                average += numberList.get(x);
                divider ++;
              }
        }
        //If the return variable is something, calc the average //Else, set it to -1
        //Return the return variable
        return (average != 0) ? (average/divider) : -1;
    }
    public static void main(String[] args){
        Scanner number = new Scanner (System.in);
        Scanner choice = new Scanner (System.in);
        ArrayList<Integer> numList = new ArrayList<>();
        boolean keepGoing = true;

        while (keepGoing){
        //Continuously loop until the user decides to cancel
          System.out.print("\nEnter a number: ");
          int numInput = number.nextInt();
          //Enter a number into the arraylist
          numList.add(numInput);
          //Would you like to keep going?
          System.out.print("Would you like to keep going? [Y/N]: ");
          char choiceInput = choice.nextLine().charAt(0);
          while(choiceInput == 'N' && choiceInput == 'n' && choiceInput == 'Y' && choiceInput == 'y'){
            System.out.print("Enter either [Y/N] ");
            choiceInput = choice.nextLine().charAt(0);
          }
          if (choiceInput == 'N' || choiceInput == 'n')
            keepGoing = false;
          
        }

        if (arrayAverage(numList) ==  -1){
            System.out.println("\nThere were no even numbers in the array");
            System.out.println("Average Result: " + arrayAverage(numList));
        }
        else{
            System.out.println("Average Result: " + arrayAverage(numList));
        }
       
    }
}