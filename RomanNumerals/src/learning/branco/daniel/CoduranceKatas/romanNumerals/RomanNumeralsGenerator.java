package learning.branco.daniel.CoduranceKatas.romanNumerals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class RomanNumeralsGenerator {
    private TreeMap<Integer, String> romanNumerals = new TreeMap<>(Map.ofEntries(
            Map.entry(1, "I"),
            Map.entry(4, "IV"),
            Map.entry(5, "V"),
            Map.entry(9,"IX"),
            Map.entry(10, "X"),
            Map.entry(40, "XL")
    ));

    public String convert(int amount){
        if(amount < 4 && amount > 0){

            return romanNumerals.get(1) + convert(amount - 1);
        }
        if(romanNumerals.containsKey(amount)){
            return romanNumerals.get(amount);
        }
        if(amount > 3){
            return romanNumerals.get(romanNumerals.lowerKey(amount)) +
                    convert(amount - romanNumerals.lowerKey(amount));
        }


        return "";
    }
}
