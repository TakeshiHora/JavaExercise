package honkaku5;

import java.util.ArrayList;
import java.util.List;

public class MakeStream2 {
    public static void main(String[] args){
        List<Student> students = new ArrayList<>();
        students.add(new Student("ken", 100));
        students.add(new Student("Shin", 60));
        students.add(new Student("Takuya", 80));
        students.stream()
                .filter(s -> s.getScore() > 70)
                .forEach(s -> System.out.println(s.getName()));
        
        students.stream()
                .limit(2)
                .forEach(s -> System.out.println(s.getName()));
        
        students.stream()
                .distinct()
                .forEach(System.out::println);
        
        students.stream()
                .sorted((s1, s2) -> s2.getScore() - s1.getScore())
                .forEach(s -> System.out.println(s.getName() + ":" + s.getScore()));
    }
}
