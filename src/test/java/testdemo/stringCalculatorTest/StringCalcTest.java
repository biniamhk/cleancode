package testdemo.stringCalculatorTest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalcTest {
    StringCalc stringCalc= new StringCalc();
    @Test
    void givenEmptyStringShouldReturnZero(){
        assertEquals(0,stringCalc.add(""));
    }
    @Test
    void givenAStringwithOneNumberShouldReturnThatNumber(){
        assertEquals(1,stringCalc.add("1"));
    }
    @Test
    void givenAStringWithCommaOrNewLineReturnSum(){
        assertEquals(6,stringCalc.add("1\n2,3"));
    }
}
