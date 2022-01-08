package learning.branco.daniel.CoduranceKatas.SimpleMarsRover;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class MarsRoverTest {

    static MarsRover marsRover;

    @org.junit.jupiter.api.BeforeAll
    static void setUp() {
        marsRover = new MarsRover();
    }

    @ParameterizedTest
    @MethodSource("roverCommandsProvider")
    void testRoverMovesToExpectedPosition(String expectedFinalPosition, String valueOfFinalPosition){
        assertEquals(expectedFinalPosition, valueOfFinalPosition, "Rover didn't stop at the expected position");
    }

    static Stream<Arguments> roverCommandsProvider(){
        return Stream.of(
                arguments("2:1:N", marsRover.execute("RMMLM"))
        );
    }
}