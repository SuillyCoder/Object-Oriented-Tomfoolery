//CONCEPT USED: ABSTRACTION
abstract class Animals{
    //This is an abstract class
        //It hides methods and attributes it's not supposed to show to the public.
    //These functions can't be easily accessed (they have to be inherited first)
    public abstract void decSpecies();
    public abstract void makeSound();
    //This method can be freely accessed
    public void eat(){
        System.out.println("Nom nom nom!");
    }
}

//CONCEPT USED: INHERITANCE
class Cat extends Animals{
    //NOTE: ALWAYS bring in the abstract methods you declared into...
    //...the class here if u wanna inherit.
    public void makeSound(){
        System.out.println("Miaw Miaw");
    }
    public void decSpecies(){
        System.out.println("Species: Felis Catus");
    }
}

class Horse extends Animals{
    //NOTE: ALWAYS bring in the abstract methods you declared into...
    //...the class here if u wanna inherit.
    public void makeSound(){
        System.out.println("Neighhh Neighhh");
    }
    public void decSpecies(){
        System.out.println("Species: Equus Caballus");
    }
}

class Snake extends Animals{
    //NOTE: ALWAYS bring in the abstract methods you declared into...
    //...the class here if u wanna inherit.
    public void makeSound(){
        System.out.println("Hisss Hisss");
    }
    public void decSpecies(){
        System.out.println("Species: Serpentes");
    }
}