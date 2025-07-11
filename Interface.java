interface Animal{
    int eyes = 2;//static
    void walk();// In this method is public and abstract by default

}
interface herbivores{

}
class Horse implements Animal , herbivores{
    public void walk(){
        System.out.println("walk on 4 legs");
    }
}
public class Interface{
    public static void main(String[] args){
        Horse horse = new Horse();
        horse.walk();
    }
}