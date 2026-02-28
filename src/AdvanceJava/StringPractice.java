package capgemini;

import java.util.ArrayList;
import java.util.List;

public class StringPractice {
    public static void main(String[] args) {
        String line = "This is line. Line contains few words. Line is in java";
        String match = "line";
        for(int i=0; i<line.length() - match.length(); i++){
            if(line.substring(i, i+ 4).toLowerCase().equals("line")){
                System.out.println(i);
            }
        }

        List<String> lis = new ArrayList<>(List.of("12-4-1978", "21.4.2001", "5-6-99", "04-11-01"));
        for(String s : lis){
            String digitsOnly = s.replaceAll("[^0-9]", ""); // Keeps only 0-9
            System.out.println(digitsOnly);
        }

        String title = "This is Java lang";
        String[] splitTittle = title.split(" ");
        StringBuilder result = new StringBuilder();
        for(String s : splitTittle){
            char ch = s.charAt(0);
            String answer = Character.toUpperCase(ch) + s.substring(1);
            result.append(answer).append(" ");
        }
        System.out.println(result);
    }
}
