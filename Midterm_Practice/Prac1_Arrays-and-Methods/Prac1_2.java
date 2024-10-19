//PRACTICE PROMPT 2: 
    //Create an ArrayList of strings.
    //Write a method that takes the ArrayList as input and removes all duplicate elements.
    //The method should return the modified ArrayList.

    import java.util.ArrayList;
    import java.util.Scanner;
    public class Prac1_2{
        static ArrayList<String> dupeRemover (ArrayList<String> nameList){
            //Create a new ArrayList
            ArrayList<String> nonDupedList = new ArrayList<>();
            //Run a for loop for as long as the current nameList goes
            for (int x = 0; x < nameList.size(); x++){
                if (nonDupedList.contains(nameList.get(x))){
                    continue;
                }
                else{
                    nonDupedList.add(nameList.get(x));
                }
            }
            //Return the new arrayList
            return nonDupedList;
        }
        public static void main(String[] args){
            Scanner name = new Scanner (System.in);
            //Create the scanner for names
            Scanner choice = new Scanner (System.in);
            //Create the arrayList to store those names
            ArrayList<String> nameList = new ArrayList<>();
            boolean keepGoing = true;
    
            while (keepGoing){
            //Continuously loop until the user decides to cancel
              System.out.print("\nEnter a name: ");
              String nameInput = name.nextLine();
               //Ask the user for a set of names
              nameList.add(nameInput);
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
            //Print out the list WITH duplicates
            System.out.println("\nList with duplicates: ");
            for (int i = 0; i < nameList.size(); i++){
                System.out.print(nameList.get(i) + ", ");
            }
            System.out.println("\n");

            //Call the function then print the array WITHOUT duplicates
            System.out.println("\nList with duplicates: ");
            for (int i = 0; i < (dupeRemover(nameList)).size(); i++){
                System.out.print((dupeRemover(nameList)).get(i) + ", ");
            }
            System.out.println("\n");
        }
    } 
        