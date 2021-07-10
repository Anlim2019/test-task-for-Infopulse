package task1;

import java.util.Random;

public class MaxElement {

    static final double C = -1.49;
    static final double D = 23.4;
    static int[][] arr = new int[5][5];
    static int length = arr.length;
    static int max, maxI, maxJ;
    static double y;

    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                arr[i][j] = r.nextInt(1000);
                if(max < arr[i][j]) {
                    max = arr[i][j];
                    maxI = i;
                    maxJ = j;
                }
            }
        }
        y = Math.sqrt(Math.abs(Math.sin(Math.sin(C)) - (4 * Math.log(Math.log(D))) / (Math.pow(maxI, maxJ))));
    }
}
