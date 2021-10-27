package testdemo.stringCalculatorTest;

import java.util.Arrays;

import static java.util.function.Predicate.not;

public class StringCalc {
    public int add(String s) {
        if(s.isEmpty())
        return 0;
        //this filters comma and new line but what if we have more delimeters like ;,tab,// and so on
        //we have the second splite to take out only the numbers
        //String[] parts=s.split("[,|\n]");
        String[] parts=s.split("[^0-9]");
        return Arrays.stream(parts)
                .filter(not(String::isEmpty))
                .mapToInt(Integer::parseInt)
                .sum();
    }
}
