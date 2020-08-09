package com.example;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

public class J06_Disabled {

    @Test
    @Disabled
    void disabled(){
        System.out.println("disabled");
    }

    @Test
    void not_disabled(){
        System.out.println("not disabled");
    }
}
