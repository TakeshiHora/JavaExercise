package honkaku5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class OperationStream {
    public static void main(String[] args){
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ken", 100));
        students.add(new Student("Shin", 60));
        students.add(new Student("Takuya", 80));
    
        Stream<Integer> stream = students.stream()
                .map(s -> s.getScore());
        stream.forEach(System.out::println);
        
    }
}
