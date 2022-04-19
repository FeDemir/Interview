package Tests;

import java.util.Arrays;

public class ArraysSolution {
    public static void main(String[] args) {
        String[] a={"one","two","three","four","five"};
        String[] b={"four","five","six","seven","eight","nine"};
        printDiff(a,b);
        printDiff(b,a);
        printComm(a,b);
    }
    public static boolean contains(String[] a, String b) {
        for (String s : a) {
            if (s.equals(b)) {
                return true;
            }
        }
        return false;
    }
    public static void printDiff(String[] a, String[] b) {
        for (String s : a) {
            if (!contains(b, s)) {
                System.out.print(s+" ");
            }
        }
        System.out.println();
    }
    public static void printComm(String[] a, String[] b) {
        for (String s : a) {
            if (contains(b, s)) {
                System.out.print(s+" ");
            }
        }
        System.out.println();
    }
}
