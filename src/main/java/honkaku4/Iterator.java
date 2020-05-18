package honkaku4;

import java.util.ArrayList;


public class Iterator {
    public static void main(String[] args){
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("ken", 100));
        students.add(new Student("Shin", 60));
        students.add(new Student("Takuya",80));
        
        java.util.Iterator<Student> iterator = students.iterator();
        
        while(((java.util.Iterator) iterator).hasNext()){
            Student student = (Student) ((java.util.Iterator) iterator).next();
            if(student.getScore() < 70){
                ((java.util.Iterator) iterator).remove();
            }
        }
        
        for(Student student : students){
            System.out.println(student.getName() + ":" + student.getScore());
        }
    }
    
    static class Student{
        private String name;
        private int score;
        
        public Student(String name, int score){
            this.name = name;
            this.score = score;
        }
        public String getName(){
            return this.name;
        }
        public int getScore(){
            return this.score;
        }

    }
}
