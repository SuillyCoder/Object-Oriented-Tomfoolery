//PRACTICE PROMPT 3: 
    //Create a method that takes an array of integers and an integer target as input.
    //The method should return true if there is a pair of elements in the array that adds up to the target, and false otherwise.

import java.util.ArrayList;
import java.util.Scanner;

public class Prac1_3{
    static ArrayList<ArrayList<Integer>> comboCalcu (ArrayList<Integer> numList, int targetNum){
        //Create a 2 dimensional arrayList for the combo list
        ArrayList<ArrayList<Integer>> comboList = new ArrayList<ArrayList<Integer>>();
        //Create an arrayList for the  pairing
        //For each element of the arrayList
        for (int x = 0; x < numList.size(); x++){
            //And for yet again each element of the arrayList
            for (int y = 0; y < numList.size(); y++){
                //If the two of them add up to the target, add them into the list
                if ((numList.get(x) + numList.get(y)) == targetNum){
                    ArrayList<Integer> pairing = new ArrayList<Integer>();
                    pairing.add(numList.get(x));
                    pairing.add(numList.get(y));
                    //Add them into the main list
                    comboList.add(pairing);
                    //Empty out the entry
                }
            }
        }
        //Return the 2 dimensional array for printing
        return comboList;
    }

    //CODE FOR PRINTING OF THE COMBINATION ARRAY:
    static void printCombos (ArrayList<ArrayList<Integer>> comboList, int targetNum){
        System.out.println("\nAll possible combinations include: \n");
        for (int x = 0; x < comboList.size(); x++){
            System.out.println((comboList.get(x)).get(0) + " + " + (comboList.get(x)).get(1) + " = " + targetNum);
        }
        System.out.println("\n");
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

        //Ask the user for a target input
        System.out.print("Enter a number of your choice: ");
        int targetInput = number.nextInt();

        //Perform a function that calculates all the possible combinations
        //Perform a function that prints all the possible calculations

        printCombos(comboCalcu(numList, targetInput), targetInput);

    }
} 
