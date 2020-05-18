import java.util.Calendar;
import java.util.Date;

public class DateOperation {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println(now);
    
        Date date = new Date(5000);
        System.out.println(date);
    
        Calendar calender = Calendar.getInstance();
        System.out.println("Calenderの値");
        System.out.println(calender);
        
        System.out.println(calender.getTime());
        
        calender.set(Calendar.MINUTE, 18);
        System.out.println("分の指定:" + calender.getTime());
        
        Date date2 = calender.getTime();
        
        
    }
}
