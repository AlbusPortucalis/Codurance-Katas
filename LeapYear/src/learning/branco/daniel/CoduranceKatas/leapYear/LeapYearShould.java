package learning.branco.daniel.CoduranceKatas.leapYear;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeapYearShould {

    @ParameterizedTest
    @CsvSource({"1997, false", "1996, true", "1600, true", "1800, false", "1700, false", "1900, false"
                , "2100, false", "2000, true", "2004, true", "2020, true", "2001, false", "2010, false"})
    void is_year_leap(int inputYear, boolean expectedOutput){
        assertEquals(expectedOutput, new LeapYear().isLeapYear(inputYear));
    }


}
