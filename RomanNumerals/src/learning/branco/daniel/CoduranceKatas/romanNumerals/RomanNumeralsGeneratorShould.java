package learning.branco.daniel.CoduranceKatas.romanNumerals;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RomanNumeralsGeneratorShould {

    @ParameterizedTest
    @CsvSource({"1,I","2,II","3,III", "4,IV", "5,V"})
    void convert_arabic_numbers_to_roman_numerals(int arabicNumber, String expectedRomanNumeral){
        assertEquals(expectedRomanNumeral, new RomanNumeralsGenerator().convert(arabicNumber));

    }

}
