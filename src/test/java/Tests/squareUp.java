package Tests;

import java.util.Arrays;

public class squareUp {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(squareUp(4)));
        System.out.println(Arrays.toString(squareUp2(4)));
    }
    public static int[] squareUp(int n) {
        int[] result = new int[n*n];
        
        int count = n*n-1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j < n) {
                    result[count--] = j+1;
                } else {
                    result[count--] = 0;
                }
            }
        }
        return result;
    }
    public static int[] squareUp2(int n) {
        int[] result = new int[n*n];
        int count=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                result[count++] = 0;
            }
            for (int j = i+1; j >0; j--) {
                result[count++] = j;
            }
            System.out.println("Arrays = " + Arrays.toString(result));
        }
        return result;
    }
}
