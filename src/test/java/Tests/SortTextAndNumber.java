package Tests;

import java.util.Arrays;

public class SortTextAndNumber {
    public static void main(String[] args) {
        System.out.println("DC501GCCCA098911 => "+sortInGroups("DC501GCCCA098911"));
        System.out.println("123cab456edde => " + sortInGroups("123cab456edde"));
        System.out.println("123cab456eddeC501GCCCA098911 => " + sortInGroups("123cab456eddeC501GCCCA098911"));

    }
    //sort text and number as groups
    public static String sortInGroups(String str) {
        System.out.println("str = " + str);
        //split string into letters and numbers array
          String[] letters = str.split("\\d+");
            System.out.println("Letters: "+Arrays.toString(letters));
          String[] numbers = str.split("\\D+");
            System.out.println("Numbers: "+Arrays.toString(numbers));

        //sort each element of letters and numbers
          for (int i = 0; i < letters.length; i++) {
              letters[i] = sort(letters[i]);
          }

          System.out.println("Sorted letters = " + Arrays.toString(letters));
          for (int i = 0; i < numbers.length; i++) {
              numbers[i] = sort(numbers[i]);
          }
          System.out.println("Sorted numbers = " + Arrays.toString(numbers));

        //find longest array's length
          int count = letters.length>numbers.length?numbers.length:letters.length;
          String text = "";
          //if string starts with letter than merge arrays by starting letters
          if(str.charAt(0) >= 'A') {
              for (int i = 0; i < count; i++) {
                  if (i<letters.length)text += letters[i];
                  if (i+1<numbers.length)text += numbers[i+1];
              }
          }
          //if string starts with number than merge arrays by starting numbers
          else {
              for (int i = 0; i < count; i++) {
                  if (i<numbers.length)text += numbers[i];
                  if (i+1<letters.length)text += letters[i+1];
              }
          }
        return text;
    }
    public static String sort(String str) {
        String[] arr = str.split("");
        Arrays.sort(arr);
        return Arrays.toString(arr).replaceAll("\\W", "");
    }
}
