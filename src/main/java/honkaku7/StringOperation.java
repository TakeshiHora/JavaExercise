package honkaku7;

import java.util.ArrayList;
import java.util.List;

public class StringOperation {
    public static void main(String[] args){
        String aaa = "aaa";
        String bbb = "bbb";
        
        StringBuilder builder = new StringBuilder();
        builder.append(aaa);
        builder.append(bbb);
        
        String str = builder.toString();
        System.out.println(str);
        
        String str2 = aaa.concat(bbb);
        System.out.println(str2);
        
        String sentence = "This is a pen";
        String[] words = sentence.split(" ");
        
        for(String word : words){
            System.out.println(word);
        }
        
        String url = "www.acroquest.co.jp";
        String[] words2 = url.split("\\.");
        
        for(String word : words2){
            System.out.println(word);
        }
        List<String> stringList = new ArrayList<>();
        stringList.add("This");
        stringList.add("is");
        stringList.add("a");
        stringList.add("pen");
        
        String message = String.join(" ", stringList);
        System.out.println(message);
        
        String message2 = String.join(".", "www", "acroquest", "co", "jp");
        System.out.println(message2);
        
        String sentence2 = "This is a pen";
        int index = sentence2.indexOf("is");
        System.out.println(index);
        
        String sentences3 = "This is a pen";
        int index2 = sentences3.indexOf("is", 3);
        System.out.println(index2);
        
        int index3 = sentences3.lastIndexOf("is");
        System.out.println(index3);
        
    }
}
