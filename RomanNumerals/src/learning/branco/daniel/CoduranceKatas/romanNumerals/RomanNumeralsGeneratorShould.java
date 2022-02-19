package learning.branco.daniel.CoduranceKatas.romanNumerals;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RomanNumeralsGeneratorShould {

    @Test
    void generator_returns_I_when_receives_1(){
        assertEquals("I", new RomanNumeralsGenerator().convert(1));

    }

}
