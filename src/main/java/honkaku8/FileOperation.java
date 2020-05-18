package honkaku8;

import jdk.nashorn.api.scripting.URLReader;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/*
public class FileOperation {
    public static void main(String[] args){
        File file = new File("/Users/horatakeshi/test.txt");
        System.out.println(File.separator);
        System.out.println(file);
        
        File dir = new File("target");
        for(String file2 : dir.list()){
            System.out.println(file2);
        }
        
        Path path = Paths.get("/Users/horatakeshi/test.txt");
        try(InputStream is = Files.newInputStream(path)){
            for(int ch; (ch = stream.read()) != -1; ){
                System.out.print((char) ch);
            }
        } catch (IOException ex){
            System.out.println(ex);
        }
    }
}
*/