package Tests;

import java.util.HashMap;
import java.util.Map;

public class FrequencyTests {
    public static void main(String[] args) {
        System.out.println(frequencyMap("vv<<^>>>^vvvv"));
        //rotate arrows to most direction
        System.out.println(rotateArrows("vv<<^>>>^vvvv"));

        
    }
    public static Map<String,Integer> frequencyMap(String str){
        Map<String,Integer> letters = new HashMap<>();
        for (String ch:str.split("")){
            if(letters.keySet().contains(ch)){
                letters.put(ch,letters.get(ch)+1);
            }
            else letters.put(ch,1);
        }
        return letters;
    }
    public static int rotateArrows (String str){
        Map<String,Integer> arrows = frequencyMap(str);
        int max=0;
        for (int each:arrows.values()){
            if (each>max) max=each;
        }
        return str.length()-max;
    }
}
