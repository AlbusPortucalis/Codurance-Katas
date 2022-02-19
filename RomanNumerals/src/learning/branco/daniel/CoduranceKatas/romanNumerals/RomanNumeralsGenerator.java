package learning.branco.daniel.CoduranceKatas.romanNumerals;

public class RomanNumeralsGenerator {
    private String RomanNumeral1 = "I";
    private String RomanNumeral2 = "II";
    private String RomanNumeral3 = "III";

    public String convert(int amount){
        if(amount == 2){
            return RomanNumeral2;
        } else if (amount == 3){
            return RomanNumeral3;
        }
        return RomanNumeral1;
    }
}
