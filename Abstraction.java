abstract class Animal{
    abstract void walk();
    //Non-Abstract class
    public void eat(){
        System.out.println("Animal can eats.");
    }
}
class Horse extends Animal{
    //Created a constructor
    Horse(){
        System.out.println("Created a Horse Animal.");
    }
    public void walk(){
        System.out.println("Walk on 4 legs.");
    }
}
class Bird extends Animal{
    //Constructor
    Bird(){
        System.out.println("Created a Bird Animal.");
    }
    public void walk(){
        System.out.println("Walks on a 2 legs.");
    }
}
public class Main{
    public static void main(String[] args){
        Horse horse = new Horse();
        horse.walk();
        horse.eat();
        Bird bird = new Bird();
        bird.walk();
        bird.eat();

    }
}