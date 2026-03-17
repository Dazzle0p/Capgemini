package Generics;

import annotation.Student;

import java.util.ArrayList;

public class GenericsExample {
    public static void main(String[] args) {
        Printer<Integer> printer = new Printer<>(37);
        printer.print();

        ArrayList<Student> stu = new ArrayList<>();
    }
}
