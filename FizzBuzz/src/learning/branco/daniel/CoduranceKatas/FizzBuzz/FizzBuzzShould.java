package learning.branco.daniel.CoduranceKatas.FizzBuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzShould {

    @Test
    void convert_1_to_1(){

        assertEquals("1", new FizzBuzz().convert(1));
    }

    @Test
    void convert_2_to_2(){
        assertEquals("2", new FizzBuzz().convert(2));
    }

    @Test
    void convert_4_to_4(){
        assertEquals("4", new FizzBuzz().convert(4));
    }



}
