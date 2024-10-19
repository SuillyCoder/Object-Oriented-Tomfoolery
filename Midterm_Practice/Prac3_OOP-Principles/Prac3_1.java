//Prompt 1:

//Create a base class named Animal with abstract methods makeSound and eat.
//Create subclasses Dog, Cat, and Bird that inherit from Animal...
//...and implement their specific makeSound and eat methods.
import java.util.Scanner;
public class Prac3_1 {
    public static void main(String[] args) {
       Scanner choice = new Scanner(System.in);
       Horse horse = new Horse();
       Cat cat = new Cat();
       Snake snake = new Snake();

        while (true){
            System.out.println("\nWelcome to the Animal Show!\n\n");
            System.out.println("What would you like to take a look at??\n");
            System.out.print("[1] Cat\n[2] Horse\n[3] Snake\n\nEnter choice: ");
            int choiceInput = choice.nextInt();
             switch(choiceInput){
                 case 1: 
                     //CAT FUNCTIONS
                     cat.decSpecies();
                     cat.makeSound();
                     cat.eat();
                     break;
                 case 2: 
                    //HORSE FUNCTIONS
                     horse.decSpecies();
                     horse.makeSound();
                     horse.eat();
                     break;
                 case 3: 
                     //SNAKE FUNCTIONS
                     snake.decSpecies();
                     snake.makeSound();
                     snake.eat();
                     break;
                 default: 
                     System.out.println("Invalid Input");
                     break;
             }
        }
    }
}
