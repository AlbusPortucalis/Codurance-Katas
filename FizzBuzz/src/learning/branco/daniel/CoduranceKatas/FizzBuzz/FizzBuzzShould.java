package learning.branco.daniel.CoduranceKatas.FizzBuzz;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzShould {

    @ParameterizedTest
    @CsvSource({"1,1", "2,2", "4,4"})
    void convert_numbers_to_FizzBuzz_String(int numberInput, String expectedOutput){
        assertEquals(expectedOutput, new FizzBuzz().convert(numberInput));
    }

    



}
