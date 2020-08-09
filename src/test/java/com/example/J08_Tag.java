package com.example;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class J08_Tag {

    @Test
    @Tag("tag?")
    void tag(){
        System.out.println("test tag");
    }
}
