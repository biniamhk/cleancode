package testdemo.stringCalculatorTest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalcTest {
    StringCalc stringCalc= new StringCalc();
    @Test
    void givenEmptyStringShouldReturnZero(){
        assertEquals(0,stringCalc.add(""));
    }

    void givenAStringwithOneNumberShouldReturnThatNumber(){
        assertEquals(1,stringCalc.add("1"));
    }
}
