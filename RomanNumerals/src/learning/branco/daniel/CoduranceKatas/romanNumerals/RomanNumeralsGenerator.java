package learning.branco.daniel.CoduranceKatas.romanNumerals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RomanNumeralsGenerator {
    private Map<Integer, String> romanNumerals = Map.ofEntries(
            Map.entry(1, "I"),
            Map.entry(4, "IV"),
            Map.entry(5, "V"),
            Map.entry(6, "VI"),
            Map.entry(7,"VII")
    );

    public String convert(int amount){
        if(romanNumerals.containsKey(amount)){
            return romanNumerals.get(amount);
        }
        if(amount < 4 && amount > 0){

            return romanNumerals.get(1) + convert(amount - 1);
        }


        return "";
    }
}
