import java.util.Scanner;
import java.util.ArrayList;
public class Tulay{
    public static void main(String[] args){
        //Initialize the arrayList of objects to contain all the students
        Student student = new Student();
        ArrayList<Student> studentList = new ArrayList<Student>();
        //Initialize the variables for choice and input data. 
        Scanner input = new Scanner(System.in);
        //Prompt the menu UI and present 2 options
        while (true){
            String FName = ""; 
            String LName = "";
            System.out.println("\nSTUDENT DATABASE ONLINE\n");
            System.out.print("[1] Add Student Data \n[2] Show Student Data\n\nSelect Action to Perform: ");
            int choice = input.nextInt();
            input.nextLine();
                switch(choice){
                    //[1] Add Data
                        case 1: 
                            student = new Student();
                            //Enter Name
                            while (FName.isEmpty()){
                                System.out.print("Enter First Name: ");
                                FName = input.nextLine();
                                student.setFName(FName,LName);
                            }
                            while (LName.isEmpty()){
                                System.out.print("Enter Last Name: ");
                                LName = input.nextLine();
                                student.setLName(FName,LName);
                            }
                            //Enter ID

                            System.out.print("Enter ID: ");
                            int id = input.nextInt();
                            student.setID(id);
                            //Enter Age
                            System.out.print("Enter Age: ");
                            int age = input.nextInt();
                            while (age <= 0){
                                System.out.print("Please input valid age: ");
                                age = input.nextInt();
                                student.setAge(age);
                            }
    
                            //Set the corresponding values onto the object
    
                            //Add the object to the arrayList
                            studentList.add(student);
                            System.out.println("\nStudent successfully added!");
                            break;
                //[2] Show Data
                        case 2:
                            if (studentList.isEmpty())
                                System.out.println("Student database is currently empty");
                            else{
                                //For each element in the arrayList
                                for (int x = 0; x < studentList.size(); x++){
                                    //Call out the function that manages to display each object. 
                                    System.out.println("\n\nStudent Entry " + (x+1) + ":\n");
                                    System.out.println("Student Name: " + studentList.get(x).getName());
                                    System.out.println("Student Age: " + studentList.get(x).getAge());
                                    System.out.println("Student ID: " + studentList.get(x).getID());
                                }
                            }
                            break;
                }
        }
    }
}