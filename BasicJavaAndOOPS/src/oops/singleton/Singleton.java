package oops.singleton;
//A Singleton class in Java is a design pattern that ensures a class has only one instance and provides a global point of access to that instance.
public class Singleton {
    // MAke constructor private to prevent creating object of this class
    private Singleton(){

    }

    // static so it belongs to the class, not to any particular object, and private to prevent direct external modification.
    private static Singleton instance;

    public static Singleton getInstance() {
        // if Object is not created, create one
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

}
