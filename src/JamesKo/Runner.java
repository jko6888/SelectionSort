package JamesKo;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        int[] num = SelectionSort.randomNum(10);
        System.out.println(Arrays.toString(num));
        SelectionSort.insertionSort(num);
        System.out.println(Arrays.toString(num));
    }
}