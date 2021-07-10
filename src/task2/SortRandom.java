package task2;


import java.util.Arrays;
import java.util.Random;

public class SortRandom {
    static Random random = new Random();
    public static void main(String[] args) {
        int[] arr = new int[random.nextInt(100)];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1000);
        }

        int[] arrSortedByAlgorithm = sortByAlgorithm(arr);
        int[] arrSortedByJava = sortByJava(arr);

        System.out.println(
                Arrays.equals(arrSortedByAlgorithm,
                                        arrSortedByJava));
    }

    public static int[] sortByAlgorithm(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int replacedElement = arr[i];
            int replacedIndex = i;
            int firstElement = replacedElement;
            for (int j = i; j < arr.length; j++) {
                if(replacedElement > arr[j]) {
                    replacedElement = arr[j];
                    replacedIndex = j;
                }
            }
            arr[i] = replacedElement;
            arr[replacedIndex] = firstElement;
        }
        return arr;
    }

    public static int[] sortByJava(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }

}
