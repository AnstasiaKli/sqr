package ru.netology.sqr.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;


public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource (files="src/test/resources/sqr.csv")

    public void shouldCalcNumberOfSquaresIncludedInTheRange(int expected, int lowerRangeLimit, int upperRangeLimit) {
        SQRService service = new SQRService();

        int actual = service.calcSqr(lowerRangeLimit, upperRangeLimit);

        Assertions.assertEquals(expected, actual);
    }
}

