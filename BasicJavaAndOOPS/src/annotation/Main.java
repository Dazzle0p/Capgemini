package annotation;

import java.lang.reflect.Method;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        Student student = new Student(1, "Alpha", 69 );

//        Field[] fields = student.getClass().getDeclaredFields();
//
//        for (Field field : fields){
//            if(field.getName().equals("name")){
//                field.setAccessible(true);
//                field.set(student, "Bita");
//            }
//            System.out.println(field.getName());
//        }
//        System.out.println(student.getName());

        Class<?> cls = student.getClass();
        Method[] methods = cls.getDeclaredMethods();
        for(Method method : methods){
//            if(method.getName().equals("privateMethod")){
//                System.out.println(method.getReturnType());
//                method.setAccessible(true);
//                method.invoke(student);
//            }
//            // We can call private static methode without an object
//            if(method.getName().equals("privateStaticMethod")){
//                System.out.println(method.getReturnType());
//                method.setAccessible(true);
//                method.invoke(null);
//            }
//            System.out.println(method.getName());

            if(method.isAnnotationPresent(RunImmediately.class)){
                RunImmediately annotation = method.getAnnotation(RunImmediately.class);
                for(int i=0; i<annotation.times(); i++){
                method.invoke(student);
                }
            }
        }

//        if(student.getClass().isAnnotationPresent(CustomAnnotation.class)){
//            System.out.println("Custom Annotation Found");
//        } else {
//            System.out.println("Custom Annotation Not Found");
//        }
    }
}