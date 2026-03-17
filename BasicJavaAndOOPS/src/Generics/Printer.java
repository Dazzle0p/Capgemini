package Generics;

public class Printer <T>{
    T thingToPrint;
    Printer(T thingToPrint){
        this.thingToPrint = thingToPrint;
    }

    public void print(){
        System.out.println(thingToPrint);
    }
}
