abstract class Employee {
    //only the get salary functions should be abstracted
    private String name;
    private String department;
    private double salary;

    //Your usual getter and setter functions
    public void setName(String newName){
        this.name = newName;
    }

    public void setSalary(double newSalary){
        this.salary = newSalary;
    }
    public void setDepartment(String newDepartment){
        this.department = newDepartment;
    }

    public String getName(){
        return this.name;
    }

    public String getDepartment(){
        return this.department;
    }

    public double getSalary(){
        return this.salary;
    }

    public abstract void getInfo();
}

class RegEmployee extends Employee{
    public void getInfo(){
        setName("John Doe");
        setDepartment("IT");
        setSalary(50000.0);
        System.out.println("\nEMPLOYEE DETAILS: \n\nStatus: Employee\nName: " + getName() + "\nDepartment: " + getDepartment() + "\nSalary: " + getSalary());
    }
}

class Manager extends Employee {
    private String[] team = {"John", "Jane", "Jack"};

    public void setTeamSize(int newTeamSize) {
        // Create a new array with the desired size
        String[] newTeam = new String[newTeamSize];

        // Copy elements from the old array to the new array
        System.arraycopy(team, 0, newTeam, 0, Math.min(team.length, newTeamSize));

        // Update the team array reference
        team = newTeam;
    }
    public String[] getTeam() {
        return team;
    }
    public void getInfo(){
        setName("Chad Sigma");
        setDepartment("Sales");
        setSalary(50000.0 *(getTeam().length));
        System.out.println("\nEMPLOYEE DETAILS: \n\nStatus: Manager\nName: " + getName() + "\nDepartment: " + getDepartment() + "\nSalary: " + getSalary());
    }
}
