class Person {
    private String name;
    private String address;
    private int age;
 
    //Setter Functions
    public void setName( String newName ){
        this.name = newName;
    }
 
     public void setAge( int newAge ){
        this.age = newAge;
    }
 
    public void setAddress( String newAddress ){
        this.address = newAddress;
    }
 
    //Getter Functions
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }    public String getAddress(){
        return this.address;
    }
    
    //Printing out the object itself
    @Override
    public String toString() {
      return "object";
    }
 
 
 }
 