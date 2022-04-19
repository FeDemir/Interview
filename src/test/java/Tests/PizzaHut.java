package Tests;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class PizzaHut {
    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            if (i%3==0 && i%5==0) System.out.println("Pizza Hut");
            else if(i%3==0) System.out.println("Pizza");
            else if(i%5==0) System.out.println("Hut");
            else System.out.println(i);
        }

        String str = "Hello World";
                //find first non repeating character
        for(char i :str.toCharArray()){
            if ( str.indexOf(i) == str.lastIndexOf(i)) {
                System.out.println("result: "+i);
                break;
            }
        }


    }
    public static Map<String,Integer> frequencyMap(String str){
        Map<String,Integer> letters = new LinkedHashMap<>();
        for (String ch:str.split("")){
            if(letters.keySet().contains(ch)){
                letters.put(ch,letters.get(ch)+1);
            }
            else letters.put(ch,1);
        }
        return letters;
    }
}
