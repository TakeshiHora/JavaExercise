package honkaku4;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args){
        int[] array = {1, 1, 4, 5, 7, 8, 11, 12 , 17, 21, 24};
        int found = Arrays.binarySearch(array, 5);
        System.out.println(found);
        
        int notFound = Arrays.binarySearch(array, 6);
        System.out.println(notFound);
    }
}
