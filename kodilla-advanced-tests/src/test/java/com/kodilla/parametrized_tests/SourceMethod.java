package com.kodilla.parametrized_tests;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class SourceMethod {

    public static Stream<Arguments> ProvideStringForTestingLength() {
        return Stream.of(
                Arguments.of("test", 4),
                Arguments.of("OTHer", 5),
                Arguments.of("E V E n t", 5),
                Arguments.of("null", 4),
                Arguments.of("A", 1)
        );
    }
}
