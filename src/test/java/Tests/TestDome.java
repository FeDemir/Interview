package Tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestDome {
    public static void main(String[] args) {
        String username = "admin";
        System.out.println(validateUserName("Mike_Standish"));
        System.out.println(validateUserName("MikeStandish"));
    }
    //validate user name method
    public static boolean validateUserName(String username){
        if(username.length()<4) return false;
        if(username.endsWith("_")) return false;
        if(username.charAt(0)<64||username.charAt(0)>123) return false;
        if(username.contains("\\w")) return false;
        return true;
    }

}
