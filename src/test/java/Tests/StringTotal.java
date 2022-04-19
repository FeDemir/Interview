package Tests;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class StringTotal {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("enter your word");
//        String word = input.next();
//
//
//        int a = 0;
//
//        for (int i = 0; i < word.length(); i++) {
//
//            if(word.charAt(i) >= '0' && word.charAt(i) <= '9'){
//                a += Integer.parseInt(""+word.charAt(i));
//            }
//
//        }
//        System.out.println(a);

        //String word = "neverGiveUp";
        //System.out.print(word.toUpperCase().substring(0,1));//we print first letter in uppercase
        //word=word.substring(1);//the we skip first letter and iterate through string and see if a letter is uppercase
//        for (int i = 1; i < word.length(); i++) {
//            //if you have only 1 command after if block or else block you don't need {}
//            if (word.charAt(i)<'a') System.out.print("\n"+word.charAt(i));//if letter is uppercase go 1 line below and print letter
//            else System.out.print(word.charAt(i));//if letter is not uppercase just print letter and don't go 1 line below after each print
//        }
//        int[] arr={1,2,3,4,5};
//        int swapTimes=4;
//        for (int i = 0; i < swapTimes; i++) {
//            int temp=arr[0];
//            for (int j = 1; j < arr.length; j++) {
//                arr[j-1]=arr[j];
//            }
//            arr[arr.length-1]=temp;
//            System.out.println("Swap ("+(i+1)+") = " + Arrays.toString(arr));
//
//        }
        int[] arr={2,6,1,2,3,4,5,8};
        System.out.println(findTotal(arr));

    }
    public static int findTotal(int[] arr){
        boolean foundSix=false;
        int total=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==6){
                foundSix=true;
            }
            else if (foundSix && arr[i]==7) foundSix=false;
            if (foundSix) continue;
            else total+=arr[i];
        }
        return total;
    }
    public static int findPrimes(int a, int b){
        int count=0;
        for (int i = a; i <+ b; i++) {
            if(isPrime(i)) count++;

        }
        return count;
    }
    public static boolean isPrime(int n){
        for (int i = 2; i < n; i++) {
            if (n%i==0) return true;

        }
        return false;
    }

            


}

