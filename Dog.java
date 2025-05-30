//3. Write a Java program to create a class called "Dog" with a name and breed attribute.
// Create two instances of the "Dog" class, set their attributes using the constructor
// and modify the attributes using the setter methods and print the updated values.

public class Dog {
    //attributes
    private String name;
    private String breed;
    //constructor
    public Dog (String name,String breed){
        this.name=name;
        this.breed=breed;
    }
    //setter
    public void setName(String name){
        this.name=name;
    }
    public void setBreed(String breed){
        this.breed=breed;
    }
    //getter
    public String getName(){
        return name;
    }
    public String getBreed(){
        return breed;
    }

    public static void main (String[]args){
        Dog pet1=new Dog("Mia","Poodle");
        Dog pet2=new Dog ("Max","German sheferd");

        pet1. setName("Toffy");
        pet1. setBreed("Golden Retriver");

        pet2. setName("Toffy");
        pet2. setBreed("Golden Retriver");

        System.out.println("Name: "+pet1.getName()+", Breed: "+pet1.getBreed());
        System.out.println("Name: "+pet2.getName()+", Breed: "+pet2.getBreed());

    }
}
