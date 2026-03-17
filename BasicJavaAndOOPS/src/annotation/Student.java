package annotation;

@CustomAnnotation
@SuppressWarnings("unused")
public class Student {

    private int id;
    private String name;
    private double marks;

    // Default constructor
    public Student() {
        this.id = 0;
        this.name = "Unknown";
        this.marks = 0.0;
    }

    // Parameterized constructor
    public Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    // Setter methods
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    // Normal method
    public void display() {
        System.out.println("Student Details:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

    // Private method
    private void privateMethod() {
        System.out.println("This is a private method.");
    }

    // Public Static method
    public static void publicStaticMethod() {
        System.out.println("This is a public static method");
    }

    // Private Static method
    private static  void  privateStaticMethod(){
        System.out.println("This is a private Static method");
    }

    @RunImmediately(times = 3)
    public void runImmediately(){
        System.out.println("Immediately running Through custom Annotation");
    }
}