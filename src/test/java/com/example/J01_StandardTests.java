package com.example;

import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class J01_StandardTests {

    @BeforeAll
    static void initAll() {
        System.out.println("BeforeAll 실행");
    }

    @BeforeEach
    void init() {
        System.out.println("BeforeEach 실행");
    }


    @Test
    void succeedingTest() {
        System.out.println("성공 테스트");
    }

    @Test
    void failingTest() {
        fail("a failing test");
    }

    @Test
    @Disabled("for demonstration purposes")
    void skippedTest() {
        // not executed
        System.out.println("스킵 테스트");
    }

    @Test
    void abortedTest() {
        assumeTrue("abc".contains("Z"));
        fail("test should have been aborted");
    }

    @AfterEach
    void tearDown() {
        System.out.println("AfterEach 실행");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("AfterAll 실행");
    }

}