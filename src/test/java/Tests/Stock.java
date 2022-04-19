package Tests;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class Stock {
    public static void main(String[] args) {
        int[] rates = {15,3,3,1,8,11,12,11,1};
        System.out.println("Max Profit = " + maxProfit(rates));
        double money = -314159.2653;
        Locale usLocal = new Locale("en","US");
        NumberFormat dollarFormat = NumberFormat.getCurrencyInstance(usLocal);
        System.out.println("dollarFormat = " + dollarFormat.format(money));
        DecimalFormat format = new DecimalFormat("$#,##0.00;$-#,##0.00");
        System.out.println(format.format(money));
    }
    public static int maxProfit(int[] arr){
        int max=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]-arr[i]>max) max=arr[j]-arr[i];

            }
        }

        return max;
    }
}
