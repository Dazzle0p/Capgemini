package oops.polymorphism;

public class Polymorphism{
    int num;
    Polymorphism(int num){
        this.num = num;
    }

    @Override
    public String toString(){
        return "Polymorphism { " + num + " }";
    }

    public static void main(String[] args) {
        Polymorphism obj = new Polymorphism(55);
        System.out.println(obj);
    }
}
