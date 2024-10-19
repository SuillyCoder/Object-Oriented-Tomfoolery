import java.util.ArrayList;
import java.util.Scanner;
public class Prac2_1{


   public static void main(String[] args){
       //Variables to ask for the data from the user
       Person person = new Person();
       ArrayList<Person> database = new ArrayList<Person>();
       Scanner choice = new Scanner(System.in);
       Scanner data = new Scanner (System.in);
       int choiceInput = 1;

       //Display the option list (either to enter names or display them)

       while (choiceInput != 0) { 
        System.out.println("Welcome to the Database\n\n");
        System.out.println("Choose operation to perform:\n");
        System.out.println("[1] Add Entry\n[2] Browse Entries\n[0] Exit Program\n\n");
        System.out.print("Enter your choice: ");
        choiceInput = choice.nextInt();
 
 
        //Loop until the user wants to quit
        switch(choiceInput){
            case 1:
                person = new Person();
                System.out.print("\nEnter name: ");
                String name = data.nextLine();
                person.setName(name);
                System.out.print("Enter age: ");
                int age = data.nextInt();
                data.nextLine();
                person.setAge(age);
                System.out.print("Enter address: ");
                String address = data.nextLine();
                person.setAddress(address);
                database.add(person);
                break;
            case 2:
                if (database.isEmpty()){
                    System.out.println("\nDatabase is empty\n");
                }
                else{
                    for (int x = 0; x < database.size(); x++){
                        System.out.println("\nData Entry No. " + (x+1) + "\n");
                        System.out.println("Name: " + database.get(x).getName() + "\nAge: " + database.get(x).getAge() + "\nAddress: " + database.get(x).getAddress() + "\n\n");
                    }
                }
                break;
        }
       }
       System.out.println("Exiting Database...");

           //If user wants to add name: call getter and setter functions in order to add data.
           //if user wants to display data, we iterate through each element of the array list and print stuff out.
  
   }
}
