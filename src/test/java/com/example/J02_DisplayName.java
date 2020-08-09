package com.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("class with displayname")
public class J02_DisplayName {

    @Test
    @DisplayName("displayName test")
    void test(){
        System.out.println("displayName");
    }
}
