//Prompt 2:

//Create a class named Shape with abstract methods calculateArea and calculatePerimeter.
//Create subclasses Circle, Rectangle, and Triangle that inherit from Shape...
//... and implement their specific calculateArea and calculatePerimeter methods.
import java.util.Scanner;
public class Prac3_2 {
    public static void main(String[] args) {
        Scanner choice = new Scanner (System.in);
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();
        int operation;

        //Declare a choice variable for both the shapes and the perimeter. 
        System.out.println("\nWelcome to the Shape Calculator!\n");
        while(true){
            System.out.println("\nWhat shape would you like to calculate the area and perimeter of?\n");
            System.out.print("[1] Circle\n[2] Rectangle\n[3] Triangle\n\nEnter choice: ");
            int choiceInput = choice.nextInt();
            switch(choiceInput){
                case 1: 
                    //CIRCLE FUNCTIONS
                    System.out.print("\nWhat would you like to do?\n[1] Calculate Area\n[2] Calculate Perimeter\n\nEnter choice: ");
                    operation = choice.nextInt();
                    switch(operation){
                        case 1:
                            //CIRCLE AREA
                            circle.calculateArea();
                            break;
                        case 2:
                            //CIRCLE PERIMETER
                            circle.calculatePerimeter();
                            break;
                        default:
                            System.out.println("Invalid choice. Please try again.");
                            break;
                    }
                    break;
                case 2: 
                    //RECTANGLE FUNCTIONS
                    System.out.print("\nWhat would you like to do?\n[1] Calculate Area\n[2] Calculate Perimeter\n\nEnter choice: ");
                    operation = choice.nextInt();
                    switch(operation){
                        case 1:
                            //RECTANGLE AREA
                            rectangle.calculateArea();
                            break;
                        case 2:
                            //RECTANGLE PERIMETER
                            rectangle.calculatePerimeter();
                            break;
                        default:
                            System.out.println("Invalid choice. Please try again.");
                            break;
                    }
                    break;
                case 3:
                    //TRIANGLE FUNCTIONS
                    System.out.print("\nWhat would you like to do?\n[1] Calculate Area\n[2] Calculate Perimeter\n\nEnter choice: ");
                    operation = choice.nextInt();
                    switch(operation){
                        case 1:
                            //TRIANGLE AREA
                            triangle.calculateArea();
                            break;
                        case 2:
                            //TRIANGLE PERIMETER
                            triangle.calculatePerimeter();
                            break;
                        default:
                            System.out.println("Invalid choice. Please try again.");
                            break;
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

        }
    }
}
