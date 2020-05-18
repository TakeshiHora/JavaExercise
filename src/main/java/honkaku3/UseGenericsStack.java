package honkaku3;

public class UseGenericsStack {
    public static void main(String[] args){
        GerericsStack<String> genStack = new GerericsStack<String>();
    
        genStack.push("Scala");
        genStack.push("Groovy");
        genStack.push("Java");
    
        String genElement = genStack.pop();
    
        if (genElement != null){
            System.out.println(genElement);
        }
    
        GerericsStack<Integer> genStack2 = new GerericsStack<Integer>();
    
        genStack2.push(100);
        genStack2.push(200);
    
        Integer genElement2 = genStack2.pop();
    
        if (genElement2 != null){
            System.out.println(genElement2);
        }
    }
}
