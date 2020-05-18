package honkaku7;

import java.text.MessageFormat;

public class StringFormat {
    public static void main(String[] args){
        int number = 13;
        String parameter = "apples";
        
        System.out.printf("I have %d %s.", number, parameter);
        System.out.printf("I have %X %S.", number, parameter);
        
        String message = MessageFormat.format("I have {0} {1}.", number, parameter);
        System.out.println(message);
    }
}
