package honkaku5;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EndStream {
    public static void main(String[] args){
        List<String> list = Arrays.asList("Murata", "Okada", "Tanimoto");
        
        List<String> newList = list.stream()
                .filter(p -> p.length() > 5)
                .collect(Collectors.toList());
        System.out.println(newList);
        
        String joined = list.stream()
                .filter(p -> p.length() > 5)
                .collect(Collectors.joining(","));
        System.out.println(joined);
        
        List<Student> students = new ArrayList<>();
        students.add(new Student("ken", 100));
        students.add(new Student("Shin", 60));
        students.add(new Student("Takuya", 80));
        students.add(new Student("Sakamoto", 100));
        System.out.println(students);
        
        Map<Integer, List<Student>> map = students.stream()
                .collect(Collectors.groupingBy(Student::getScore));
        System.out.println(map);
        
        List<Student> perfects = map.get(100);
        perfects.forEach(s -> System.out.println(s.getName()));
        
        List<String> newList2 = list.stream()
                .filter(p -> p.length() > 5)
                .map(p -> "[" + p + "]")
                .collect(Collectors.toList());
        newList2.forEach(System.out::println);
        
        int count = 5;
        
        String query = IntStream.range(0, count)
                .mapToObj(i -> "?")
                .collect(Collectors.joining(","));
        System.out.println(query);
    }
}
