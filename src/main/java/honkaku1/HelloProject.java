package honkaku1;

public class HelloProject {
    public static void main(String[] args){
        System.out.println("Hello World");
        
        int numberA = 10;
        int numberB = numberA > 0 ? 1 : -1;
        
        System.out.println(numberB);
        
        int sum = 0;
        for (int i = 0; i <= 10; i++){
            sum += i;
            System.out.println(i + "回目" + "合計：" + sum);
        }
        int[] numbers = {1, 2 , 3, 4, 5, 6, 7, 8, 9, 10};
        for (int number : numbers){
            System.out.println(number);
        }
    }
}
