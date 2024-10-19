//Prompt 3:

//Create a class named Employee with attributes name, salary, and department.
//Create a subclass named Manager that inherits from Employee and has an additional attribute teamMembers.
//Implement a method getSalary in both classes. The getSalary method in the...
//...Manager class should calculate the salary based on the team size.

public class Prac3_3 {
    public static void main(String[] args) {
        RegEmployee regEmployee = new RegEmployee();
        Manager manager = new Manager();

        // EMPLOYEE DETAILS
            regEmployee.getInfo();
        // MANAGER DETAILS
            manager.getInfo();
    }
}
