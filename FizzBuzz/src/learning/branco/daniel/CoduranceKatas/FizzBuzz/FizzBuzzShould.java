package learning.branco.daniel.CoduranceKatas.FizzBuzz;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzShould {

    @ParameterizedTest
    @CsvSource({"1,1", "2,2", "4,4"})
    void convert_numbers_to_FizzBuzz_String(int numberInput, String expectedOutput){
        assertEquals(expectedOutput, new FizzBuzz().convert(numberInput));
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9, 18})
    void convert_multiples_of_3_to_Fizz(int numberInput){
        assertEquals("Fizz", new FizzBuzz().convert(numberInput));
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 10, 20, 25})
    void convert_multiples_of_5_to_Buzz(int numberInput){
        assertEquals("Buzz", new FizzBuzz().convert(numberInput));
    }


}
