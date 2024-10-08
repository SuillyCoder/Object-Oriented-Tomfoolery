import java.util.ArrayList;
import java.util.Scanner;
public class BubbleSort {
	 public static void main(String[] args) {
		 //VARIABLE DECLARATION
		 ArrayList<Integer> numList = new ArrayList<>();
		 Scanner number   = new Scanner(System.in);
		 Scanner cont   = new Scanner(System.in);
		 boolean keepGoing = true; 
		 
		 //SECTION FOR THE USER TO ADD NUMBERS
		 while (keepGoing) {
			 System.out.print("Enter a number: ");
			 int numInput = number.nextInt();
			 numList.add(numInput);
			 //LOOP FOR USER INPUT
			 System.out.print("Would you like to add more numbers? [Y/N]: ");
			 char contInput = cont.nextLine().charAt(0);
			 
			 while(contInput != 'N' && contInput != 'n' && contInput != 'Y' && contInput != 'y') {
				 System.out.print("Invalid Input. Please enter [Y/N]: ");
				 contInput = cont.nextLine().charAt(0);
			 } 	
			 if (contInput == 'N' || contInput == 'n')
				 keepGoing = false;
		 }
		 
		 //SECTION FOR ACTUAL ARRAY SORTING
		 for (int x = 0; x < numList.size(); x++) {
			 int i = 1;
			 //A SINGLE PASS
			 System.out.println("\n\nPASS NUMBER " + (x+1));
			 
			 //COMPARING SWAPPING OUT THE NUMBERS
			 for (int y = 0; y < (numList.size()-(x+1)); y++) {
				 System.out.print("\n     ITERATION " + (i) + ": ");
				 if (numList.get(y) > numList.get(y+1)) {
					int temp = numList.get(y+1);
					int swapOne = numList.set((y+1),numList.get(y));
					int swapTwo = numList.set((y),temp);
				 }
				i++;
				 
				 //PRINTING OUT THE ITERATIONS
				 for (int z = 0; z < (numList.size()); z++) {
					 System.out.print(numList.get(z) + " ");
				 }
				 System.out.println("\n");
			 }
			 
		 }
		 
		 //PRINTING OUT THE FINAL SORTED ARRAY
		 System.out.print("\n\nThe final sorted array is: ");
		 for (int a = 0; a < (numList.size()); a++) {
			 System.out.print(numList.get(a) + " ");
		 }
	 }
}
