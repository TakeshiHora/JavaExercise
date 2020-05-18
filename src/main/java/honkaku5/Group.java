package honkaku5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Group{
    private List<Student> students;
    public void add(Student student){
        students.add(student);
    }
    public List<Student> getStudents(){
        return students;
    }
    public static void main(String[] args) {
        List<Group> groups = new ArrayList<>();
        
        Group group1 = new Group();
        group1.add(new Student("Murata", 100));
        group1.add(new Student("Takuya", 60));
        group1.add(new Student("Okada", 80));
        
        Group group2 = new Group();
        group2.add(new Student("Akiba", 75));
        group2.add(new Student("Hayakawa", 85));
        group2.add(new Student("Sakamoto", 95));
        groups.add(group2);
    
        Group group3 = new Group();
        group2.add(new Student("Kimura", 90));
        group2.add(new Student("Hashimoto", 65));
        group2.add(new Student("Ueda", 80));
        groups.add(group3);
    
        Stream<List<Student>> mappedStream = groups.stream().map(g -> g.getStudents());
        
        Stream<Student> flatMappedStream = groups.stream().flatMap(g -> g.getStudents().stream());
        
    }
    
 
}

