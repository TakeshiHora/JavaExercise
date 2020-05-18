package honkaku3;

import java.util.ArrayList;
import java.util.List;

public class GerericsStack<E> {
    
    private List<E> taskList;
    
    public GerericsStack(){
        taskList = new ArrayList<E>();
    }
    
    public boolean push(E task){
        return taskList.add(task);
    }
    
    public E pop(){
        if (taskList.isEmpty()){
            return null;
        }
        return taskList.remove(taskList.size() - 1);
    }
}
