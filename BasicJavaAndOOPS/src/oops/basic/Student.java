package oops.basic;

public class Student {
    String name;
    int roll;
    float marks;
    static int studentCount;

    public Student(){
        // Calling another constructor from one constructor
        this("default", 10, 15);
    }
    public Student(String name, int roll, float marks){
        this.name = name;
        this.roll = roll;
        this.marks = marks;
        Student.studentCount += 1;
    }

    public void printDetails(){
        System.out.println("Name : " + name + "\nRoll : " + roll + "\nMarks : " + marks);
        // This KeyWord is Optional when referring to an instance variable inside a method,
        // Also if there is no local variable or parameter with same name
    }

    @Override
    // Runs whenever java Garbage collector destroy any object / removes it from heap memory
    public void finalize() throws Throwable{
        System.out.println("Object is Destroyed");
    }
}
