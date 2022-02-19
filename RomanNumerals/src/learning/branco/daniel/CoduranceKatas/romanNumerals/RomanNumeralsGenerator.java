package learning.branco.daniel.CoduranceKatas.romanNumerals;

public class RomanNumeralsGenerator {
    public String convert(int amount){
        String RomanNumeral1 = "I";
        String RomanNumeral2 = "II";
        if(amount == 2){
            return RomanNumeral2;
        }
        return RomanNumeral1;
    }
}
