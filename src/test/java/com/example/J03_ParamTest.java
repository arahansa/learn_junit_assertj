package com.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.platform.commons.util.StringUtils;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class J03_ParamTest {


    public static boolean isPalindrome(String text) {
        var cleaned = text.replaceAll("\\s+", "").toLowerCase();
        var plain = new StringBuilder(cleaned);

        var reversed = plain.reverse().toString();

        return reversed.equals(cleaned);
    }

    @ParameterizedTest
    @ValueSource(strings = { "racecar", "radar", "able was I ere I saw elba" })
    void palindromes(String candidate) {
        assertTrue(isPalindrome(candidate));
    }
}
