package learning.branco.daniel.CoduranceKatas.romanNumerals;

public class RomanNumeralsGenerator {
    private String[] romanNumerals = {
            "I",
            "IV",
            "V"
    };

    public String convert(int amount){
        if(amount < 4 && amount > 1){

            return romanNumerals[0] + convert(amount - 1);
        }

        if(amount == 4){
            return romanNumerals[1];
        }
        if(amount == 5){
            return  romanNumerals[2];
        }
        return romanNumerals[0];
    }
}
