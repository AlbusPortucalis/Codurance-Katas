package learning.branco.daniel.CoduranceKatas.leapYear;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeapYearShould {

    @ParameterizedTest
    @CsvSource({"1997, false", "1996, true"})
    void is_year_leap(int inputYear, boolean expectedOutput){
        assertEquals(expectedOutput, new LeapYear().isLeapYear(inputYear));
    }


}
