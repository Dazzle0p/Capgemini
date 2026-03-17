package oops.basic;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alpha", 1, 97); // Object or Reference variable
        Student s2 = new Student();
        student.printDetails();
        s2.printDetails();

        Student s1;

//        for(int i=0; i<1000000; i++){
//            // Memory management in java
//            s1 = new Student();
//            System.out.println(student.studentCount);
//        }
    }
}