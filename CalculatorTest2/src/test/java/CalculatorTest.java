/*
* Name-Surname:İsa Şengül
* Student id:B201202004
*Course Name:Software Verification And Validation
*
*                                     HOMEWORK #1
* */


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalculatorTest {

    @ParameterizedTest
    @CsvSource({"10.0, 2.0, 5.0", "10.0, 4.0, 2.5", "12.5, 5.0, 2.5", "10.0, 2.5, 4.0", "12.5, 2.5, 5.0"})
    public void testDivision(double dividing, double divisive, double expectedResult) {
        double division_result = Calculator.divide(dividing, divisive);
        Assertions.assertEquals(expectedResult, division_result);
    }

    @ParameterizedTest
    @CsvSource({"12.5,0.0"})
            public void divide_byZero_exception(double dividing,double divisive){
        Assertions.assertThrows(IllegalArgumentException.class, () ->{ Calculator.divide(dividing, divisive);
        });
    }

}