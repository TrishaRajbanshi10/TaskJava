// 1. Create an abstract class called Bird with an abstract method called fly(). 
// Implement two subclasses called Eagle and Penguin that inherit from Bird. 
// Override the fly() method in both subclasses, ensuring Eagle can fly while Penguin cannot. 
// Implement the Java code for this scenario.


//parent class
class Bird{
    public void Fly(){
        System.out.println("Birds can fly.");
    }
}

//Subclasses
class Eagle extends Bird{
    public void fly(){
        System.out.println("Eagle can fly.");
    }
}
class Penguin extends Bird{
    public void fly(){
        System.out.println("Penguin cannot fly.");
    }
}

//Main class
public class Birds{
    public static void main(String[]args){
        Eagle eagle= new Eagle();
        Penguin penguin= new Penguin();

        System.out.println("Eagle.");
        eagle.fly();

        System.out.println("\nPenguin.");
        penguin.fly();
    }
}