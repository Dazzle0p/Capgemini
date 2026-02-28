package oops.inheritance;

public class Bowler extends Cricketer {
    String bowlerType;

    Bowler(){

    }

    Bowler(String bowlerType){
        this.bowlerType = bowlerType;
    }

    Bowler(String name, String role, int age, String bowlerType){
        super(name, role, age); // Call the parent class constructor
        this.bowlerType = bowlerType;
    }

    Bowler(Bowler other){
        super(other);
        bowlerType = other.bowlerType;
    }
}
