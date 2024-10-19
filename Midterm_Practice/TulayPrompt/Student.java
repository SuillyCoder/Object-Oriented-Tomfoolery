class Student {
    //Declare the private variable 
    private String name; 
    private int ID;
    private int age;

    //Implement the getter and setter functions. 
    public void setFName(String firstName, String lastName){
        this.name = (firstName + " " + lastName);
        if (firstName.isEmpty())
            System.out.println("\nERROR: NAME CANNOT BE EMPTY!");
    }
    public void setLName(String firstName, String lastName){
        this.name = (firstName + " " + lastName);
        if (lastName.isEmpty())
            System.out.println("\nERROR: NAME CANNOT BE EMPTY!");
    }
    public String getName(){
        return this.name;
    }

    public void setAge(int newAge){
        this.age = newAge;
    }
    public int getAge(){
        return this.age;
    }
    public void setID(int newID){
        this.ID = newID;
    }
    public int getID(){
        return this.ID;
    }
    
}
