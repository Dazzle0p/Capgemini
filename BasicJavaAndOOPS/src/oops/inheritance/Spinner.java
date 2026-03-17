package oops.inheritance;

public class Spinner extends Bowler{
    float avgSpeed;
    int wicketTaken;

    Spinner(){
        super();
        this.avgSpeed = 90;
        this.wicketTaken = 0;
    }
    Spinner(String name, String role, int age, String bowlerType, float avgSpeed, int wicketTaken){
        super(name,  role,  age, bowlerType);
        this.avgSpeed = avgSpeed;
        this.wicketTaken = wicketTaken;
    }
}
   