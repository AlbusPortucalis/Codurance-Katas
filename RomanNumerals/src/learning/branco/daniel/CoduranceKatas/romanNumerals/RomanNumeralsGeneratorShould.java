package learning.branco.daniel.CoduranceKatas.romanNumerals;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RomanNumeralsGeneratorShould {

    @Test
    void convert_1_to_I(){
        assertEquals("I", new RomanNumeralsGenerator().convert(1));

    }

    @Test
    void convert_2_to_II() {
        assertEquals("II", new RomanNumeralsGenerator().convert(2));
    }
}
