package learning.branco.daniel.CoduranceKatas.romanNumerals;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RomanNumeralsGeneratorShould {

    @ParameterizedTest
    @CsvSource({"1,I","2,II","3,III", "4,IV", "5,V", "6,VI", "7,VII", "8, VIII", "9, IX",
                "10,X", "11,XI", "12,XII", "14,XIV", "18, XVIII", "19,XIX", "20, XX", "26, XXVI",
                "30, XXX"})
    void convert_arabic_numbers_to_roman_numerals(int arabicNumber, String expectedRomanNumeral){
        assertEquals(expectedRomanNumeral, new RomanNumeralsGenerator().convert(arabicNumber));

    }

}
