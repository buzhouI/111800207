package com.buzhouI;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class SimHashTest {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void readTxtTest() throws IOException {
        String str = SimHash.readTxt("D:/test/sim/orig.txt");
        String[] strings = str.split(" ");
        for (String string : strings)
            System.out.println(string);
    }

    @Test
    public void hashTest(){
        String[] strings = {"一位","真正","的","作家"};
        for (String string : strings){
            String hash = SimHash.hash(string);
            System.out.println(hash);
            System.out.println(hash.length());
        }
    }
}
