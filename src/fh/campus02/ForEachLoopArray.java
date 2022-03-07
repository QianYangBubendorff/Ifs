package fh.campus02;

import java.util.Arrays;

public class ForEachLoopArray {
    public static void main(String[] args) {
        int[] array  = new int[]{ 5,7,8,10,7};
        System.out.println(Arrays.toString(array));

        for (int number : array){
            array[number-1] += 12;
        }
        System.out.println(Arrays.toString(array));
    }
}
