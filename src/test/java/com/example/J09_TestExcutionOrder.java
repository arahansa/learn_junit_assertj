package com.example;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class J09_TestExcutionOrder {

    @Test
    @Order(2)
    void emptyValues() {
        System.out.println("empty");
    }

    @Test
    @Order(1)
    void nullValues() {
        System.out.println("null");
        // perform assertions against null values
    }



    @Test
    @Order(3)
    void validValues() {
        System.out.println("valid");
    }
}
