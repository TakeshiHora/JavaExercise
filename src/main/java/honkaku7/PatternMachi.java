package honkaku7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMachi {
    public static void main(String[] args){
        String sentence = "This   is a pen.";
        System.out.println("(1)");
        System.out.println(sentence.matches("Th.* is a .*\\."));
        
        System.out.println("(2)");
        String[] words = sentence.split("\\s+");
        for (String word : words){
            System.out.println(word);
        }
        System.out.println("(3)");
        System.out.println(sentence.replaceAll("\\s+", " "));
    }
    
}
