package oops.inheritance;

public class Cricketer {
    String name;
    String role;
    int age;
    private static String cricketBoard = "BCCI"; // Can't be accessible outside this class

    Cricketer(){

    }

    Cricketer(String name, String role, int age){
        this.name = name;
        this.age = age;
        this.role = role;
    }

    public Cricketer(Bowler other) {

    }
}
