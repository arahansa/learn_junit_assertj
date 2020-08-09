package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

public class J07_OperatingSystems {

    @Test
    @EnabledOnOs(OS.WINDOWS)
    void os() {
        System.out.println("OS");
    }

    @Test
    @EnabledOnJre(JRE.JAVA_8)
    void jre(){
        System.out.println("jre8");
    }
}
