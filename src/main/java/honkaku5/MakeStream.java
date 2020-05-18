package honkaku5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MakeStream {
    public static void main(String[] args){
        List<String> list = Arrays.asList("Murata", "Okada", "Tanimoto");
        Stream<String> stream = list.stream();
        stream.forEach(System.out::println);
        
        String[] array = new String[] {"Murata", "Okada", "Tanimoto"};
        Stream<String> stream1 = Arrays.stream(array);
        stream1.forEach(System.out::println);
        
        Map<String, String> map = new HashMap<>();
        map.put("1", "Murata");
        map.put("2", "Okada");
        map.put("3", "Tanimoto");
        
        Stream<Map.Entry<String, String>> stream2 = map.entrySet().stream();
        stream2.forEach(e -> System.out.println(e.getKey() + ":" + e.getValue()));
        
        Map<String, String> map1 = new HashMap<>();
        map1.put("1", "Murata");
        map1.put("2", "Okada");
        map1.put("3", "Tanimoto");
        
        Stream<String> stream3 = map1.values().stream();
        stream3.forEach(System.out::println);
        
        Stream<String> stream4 = map1.keySet().stream();
        stream4.forEach(System.out::println);
        
        IntStream stream5 = IntStream.rangeClosed(1, 5);
        stream5.forEach(System.out::print);
    }
}
