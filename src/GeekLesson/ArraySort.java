package GeekLesson;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int array[] = {10,9,8,7,6,5,4,3,2,1};

        int max = array[0];
        int min = array[0];
        for(int i = 0;i<array.length;i++) {
            if (array[i] < min) {
                min = array[i];
                if (array[i] > max) {
                    max = array[i];
                }
            }
        }

        System.out.println(min);
        System.out.println(max);
    }
}
