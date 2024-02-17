package io.github.terickson87.FunctionalJava;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.function.Function;

import org.junit.jupiter.api.Test;

public class BoxTest {
    @Test void simpleFunctionTest() {
        // Arrange
        Box<Integer> integerBox = new Box<>(5);
        Function<Integer, Integer> doubleFunction = x -> x * 2;

        // Act
        Integer result = integerBox
            .map(doubleFunction)
            .getValue();

        // Assert
        assertEquals(10, result);
    }

    @Test void typeChangeTest() {
        // Arrange
        Box<Integer> integerBox = new Box<>(5);
        Function<Integer, String> doubleFunction = x -> x + "-String Ending";

        // Act
        String result = integerBox
            .map(doubleFunction)
            .getValue();

        // Assert
        assertEquals("5-String Ending", result);
    }
}
