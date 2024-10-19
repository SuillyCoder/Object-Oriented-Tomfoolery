import java.util.Scanner;
//CONCEPT USED: ABSTRACTION
abstract class Shape {
    //Getter and setter functions for the Area and Perimeter
    private double area;
    private double perimeter;

    public void setArea(double newArea){
        this.area = newArea;
    }
    public double getArea(){
        return this.area;
    }

    public void setPerimeter(double newPerimeter){
        this.perimeter = newPerimeter;
    }
    public double getPerimeter(){
        return this.perimeter;
    }

    //Abstract method for all the shapes

    public abstract void calculateArea();
    public abstract void calculatePerimeter();

}


//CONCEPT USED: INHERITANCE
class Circle extends Shape {
    //CONCEPT USED: POLYMORPHISM
    Scanner vars = new Scanner(System.in);
    //Parameters include the variables via getting them.
    public void calculateArea(){
        //Calculate for the area
        System.out.print("Enter the radius of the circle: ");
        int radius = vars.nextInt();
        //Set it via the setting function
        setArea(Math.PI*Math.pow(radius,2));
        //Print it out via the get function
        System.out.println("The area of the circle is: " + getArea());
    }
    public void calculatePerimeter(){
        //Calculate for the perimeter
        System.out.print("Enter the radius of the circle: ");
        int radius = vars.nextInt();
        //Set it via the setting function
        setPerimeter(2*Math.PI*radius);
        //Print it out via the get function
        System.out.println("The perimeter of the circle is: " + getPerimeter());
    }
}


class Triangle extends Shape {
    //CONCEPT USED: POLYMORPHISM
    Scanner vars = new Scanner(System.in);
    //Parameters include the variables via getting them.
    public void calculateArea(){
        //Calculate for the area
        System.out.print("Enter the base width of the triangle: ");
        int base = vars.nextInt();
        System.out.print("Enter the height of the triangle: ");
        int height = vars.nextInt();
        //Set it via the setting function
        setArea((base * height) / 2);
        //Print it out via the get function
        System.out.println("The area of the triangle is: " + getArea());
    }
    public void calculatePerimeter(){
        //Calculate for the perimeter
        System.out.print("Enter the length of Side A: ");
        int A = vars.nextInt();
        System.out.print("Enter the length of Side B: ");
        int B = vars.nextInt();
        System.out.print("Enter the length of Side C: ");
        int C = vars.nextInt();;
        //Set it via the setting function
        setPerimeter(A + B + C);
        //Print it out via the get function
        System.out.println("The perimeter of the triangle is: " + getPerimeter());
    }
}

class Rectangle extends Shape {
    //CONCEPT USED: POLYMORPHISM
    Scanner vars = new Scanner(System.in);
    //Parameters include the variables via getting them.
    public void calculateArea(){
        //Calculate for the area
        System.out.print("Enter the length of the rectangle: ");
        int length = vars.nextInt();
        System.out.print("Enter the width of the rectangle: ");
        int width = vars.nextInt();
        //Set it via the setting function
        setArea(length * width);
        //Print it out via the get function
        System.out.println("The area of the rectangle is: " + getArea());
    }
    public void calculatePerimeter(){
        //Calculate for the perimeter
        System.out.print("Enter the length of the rectangle: ");
        int length = vars.nextInt();
        System.out.print("Enter the width of the rectangle: ");
        int width = vars.nextInt();
        //Set it via the setting function
        setPerimeter(2*(length + width));
        //Print it out via the get function
        System.out.println("The perimeter of the circle is: " + getPerimeter());
    }
}