package com.buzhouI;

import org.junit.Before;
import org.junit.Test;

public class HammingTest {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void getDistanceTest(){
        String str0 = SimHash.readTxt("D:/test/sim/orig.txt");
        String str1 = SimHash.readTxt("D:/test/sim/orig_0.8_add.txt");
        System.out.println(Hamming.getDistance(SimHash.getSimHash(str0),SimHash.getSimHash(str1)) + " 相识度: "
            + (100-Hamming.getDistance(SimHash.getSimHash(str0),SimHash.getSimHash(str1))*100/128)+"%");
    }
}
