package com.buzhouI;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class SimHashTest {

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
        String str0 = TxtIO.readTxt("D:/test/sim/orig.txt");
        String str1 = TxtIO.readTxt("D:/test/sim/orig_0.8_add.txt");
        System.out.println(SimHash.getSimHash(str0));
        System.out.println(SimHash.getSimHash(str1));
    }

    @Test
    public void AllTest(){
        String[] str = new String[10];
        str[0] = TxtIO.readTxt("D:/test/sim/orig.txt");
        str[1] = TxtIO.readTxt("D:/test/sim/orig_0.8_add.txt");
        str[2] = TxtIO.readTxt("D:/test/sim/orig_0.8_del.txt");
        str[3] = TxtIO.readTxt("D:/test/sim/orig_0.8_dis_1.txt");
        str[4] = TxtIO.readTxt("D:/test/sim/orig_0.8_dis_3.txt");
        str[5] = TxtIO.readTxt("D:/test/sim/orig_0.8_dis_7.txt");
        str[6] = TxtIO.readTxt("D:/test/sim/orig_0.8_dis_10.txt");
        str[7] = TxtIO.readTxt("D:/test/sim/orig_0.8_dis_15.txt");
        str[8] = TxtIO.readTxt("D:/test/sim/orig_0.8_mix.txt");
        str[9] = TxtIO.readTxt("D:/test/sim/orig_0.8_rep.txt");

        for(int i = 1; i <= 9; i++){
            int hmDistance = Hamming.getDistance(SimHash.getSimHash(str[0]),SimHash.getSimHash(str[i]));
            System.out.println("str0和str"+i+"的汉明距离: " + hmDistance + " 相识度: " + (100-hmDistance*100/128)+"%");
        }

    }
}
