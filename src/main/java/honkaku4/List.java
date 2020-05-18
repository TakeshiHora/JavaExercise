package honkaku4;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import static java.util.Collections.*;

public class List{
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(13);
        list.add(2);
    
        Comparator<Integer> c = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        };
    
        sort(list, c);
        System.out.println(list);
        
        java.util.List<Integer> values = Arrays.asList(1, 1, 4, 5, 7, 8, 11, 12 ,17, 21, 24);
        int found = binarySearch(values, 5);
        System.out.println(found);
        
        int notFound = binarySearch(values, 6);
        System.out.println(notFound);
        
        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("a");
        list2.add("b");
        list2.add("c");
        
        for (String listString: list2){
            System.out.println(listString);
        }
    }

}
