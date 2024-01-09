package uk.co.trinitylogic.codinggame.soultions;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTemperaturesTest {

    @Test
    void temperatures_Example_1() {
        List<Integer> input = List.of(1, -2, -8, 4, 5);
        int output = 1;
        SolutionTemperatures target = new SolutionTemperatures();
        int result = target.temperatures(input);
        assertEquals(output, result);
    }

    @Test
    void temperatures_Example_2() {
        List<Integer> input = List.of(-12, -5, -137, -12);
        int output = -5;
        SolutionTemperatures target = new SolutionTemperatures();
        int result = target.temperatures(input);
        assertEquals(output, result);
    }

    @Test
    void temperatures_Example_3() {
        List<Integer> input = List.of(42, -5, 12, 21, 5, 24, -5);
        int output = 5;
        SolutionTemperatures target = new SolutionTemperatures();
        int result = target.temperatures(input);
        assertEquals(output, result);
    }
}