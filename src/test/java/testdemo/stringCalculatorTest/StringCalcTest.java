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

    @Test
    void givenAStringWithCustomDelimiterReturnsSum(){
        assertEquals(3,stringCalc.add("//;\n1;2"));
    }
    @Test
    void givenAStringWithComplexCustomDelimiterReturnsSum(){
        assertEquals(100,stringCalc.add("//[**][;]\n10;20,30**40"));

    }
}
