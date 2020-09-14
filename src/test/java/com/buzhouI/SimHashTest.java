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

    @Test
    public void getSimHashTest(){
        String str0 = SimHash.readTxt("D:/test/sim/orig.txt");
        String str1 = SimHash.readTxt("D:/test/sim/orig_0.8_add.txt");
        System.out.println(SimHash.getSimHash(str0));
        System.out.println(SimHash.getSimHash(str1));
    }

    @Test
    public void AllTest(){
        String[] str = new String[10];
        str[0] = SimHash.readTxt("D:/test/sim/orig.txt");
        str[1] = SimHash.readTxt("D:/test/sim/orig_0.8_add.txt");
        str[2] = SimHash.readTxt("D:/test/sim/orig_0.8_del.txt");
        str[3] = SimHash.readTxt("D:/test/sim/orig_0.8_dis_1.txt");
        str[4] = SimHash.readTxt("D:/test/sim/orig_0.8_dis_3.txt");
        str[5] = SimHash.readTxt("D:/test/sim/orig_0.8_dis_7.txt");
        str[6] = SimHash.readTxt("D:/test/sim/orig_0.8_dis_10.txt");
        str[7] = SimHash.readTxt("D:/test/sim/orig_0.8_dis_15.txt");
        str[8] = SimHash.readTxt("D:/test/sim/orig_0.8_mix.txt");
        str[9] = SimHash.readTxt("D:/test/sim/orig_0.8_rep.txt");

        for(int i = 1; i <= 9; i++){
            int hmDistance = Hamming.getDistance(SimHash.getSimHash(str[0]),SimHash.getSimHash(str[i]));
            System.out.println("str0和str"+i+"的汉明距离: " + hmDistance + " 相识度: " + (100-hmDistance*100/128)+"%");
        }

    }
}
