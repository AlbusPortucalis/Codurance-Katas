package learning.branco.daniel.CoduranceKatas.romanNumerals;

public class RomanNumeralsGenerator {
    private String unitsRomanNumeral = "I";
    private String fourthRomanNumeral = "IV";
    public String convert(int amount){
        if(amount == 2){
            return unitsRomanNumeral.repeat(2);
        } else if (amount == 3){
            return unitsRomanNumeral.repeat(3);
        } else if(amount == 4){
            return fourthRomanNumeral;
        }
        return unitsRomanNumeral;
    }
}
