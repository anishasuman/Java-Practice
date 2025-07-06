class Student{
    String name;
    int age;
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    //Non-parameterized Constructor .
    // yeh by default saved rahta h java me !! No need to write.
    Student(){
        System.out.println("Constructor Called");
    }
}
public class Object {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "Anisha";
        s1.age = 23;

        s1.printInfo();
    }
}
