package capgemini;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Task {
    public static void main(String[] args) {
        try{
            FileReader file =  new FileReader("SUSI");
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public Task() throws FileNotFoundException {

    }
}
