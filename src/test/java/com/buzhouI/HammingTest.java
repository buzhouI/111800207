package com.buzhouI;

import org.junit.Before;
import org.junit.Test;

public class HammingTest {

    @Test
    public void getDistanceTest(){
        String str0 = TxtIO.readTxt("D:/test/sim/orig.txt");
        String str1 = TxtIO.readTxt("D:/test/sim/orig_0.8_add.txt");
        System.out.println(Hamming.getDistance(SimHash.getSimHash(str0),SimHash.getSimHash(str1)) + " 相识度: "
            + (100-Hamming.getDistance(SimHash.getSimHash(str0),SimHash.getSimHash(str1))*100/128)+"%");
    }

    @Test
    public void  getSimilarityTest(){
        String str0 = TxtIO.readTxt("D:/test/sim/orig.txt");
        String str1 = TxtIO.readTxt("D:/test/sim/orig_0.8_add.txt");
        System.out.println("str0和str1的汉明距离: " + Hamming.getDistance(SimHash.getSimHash(str0),SimHash.getSimHash(str1))
                + " 相识度: " + Hamming.getSimilarity(SimHash.getSimHash(str0),SimHash.getSimHash(str1)));
    }
}
