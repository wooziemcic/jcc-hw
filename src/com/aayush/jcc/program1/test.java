package com.aayush.jcc.program1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class test{
    @Test
    public void returnHelloWorld(){
        Person aayush = new Person();
        assertEquals("Hello World", aayush.helloworld() );
    }
}