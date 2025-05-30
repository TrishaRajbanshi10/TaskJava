//2. Write a Java program to create a class called “Simple Interest” 
//with a data fields principle, time and rate,using setter getter method and print the values.

public class SimpleIntrest {
    private double principle;
    private double time;
    private double rate;

    //constructors
    public SimpleIntrest(double principle,double time, double rate){
        this.principle=principle;
        this.time=time;
        this.rate=rate;
    }

    //getter and setter method
    public void setPrinciple(double principle){
        this.principle=principle;
    }
    public void setTime(double time){
        this.time=time;
    }
    public void setRate(double rate){
        this.rate=rate;
    }
    public double getPrinciple(){
        return principle;
    }
    public double getTime(){
        return time;
    }
    public double getRate(){
        return rate;
    }
    //method to display values
    public void displayvalues(){
        System.out.println("principle: "+principle);
        System.out.println("Time: "+time);
        System.out.println("Rate: "+rate);
    }
    //method to test
    public static void main(String[]args){
        SimpleIntrest si=new SimpleIntrest(1000,2,5);

        si.displayvalues();

        si.setPrinciple(1500);
        si.setTime(5);
        si.setRate(10);

        System.out.println("\n After updating values.");
        si.displayvalues();

    }
}
