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
    public void shortStringSimHashTest(){//测试str.length()<200的情况
        System.out.println(SimHash.getSimHash("一位正真的作家"));
    }

    @Test
    public void AllTest(){
        String[] fileName = new String[10];
        fileName[0] = ("orig.txt");
        fileName[1] = ("orig_0.8_add.txt");
        fileName[2] = ("orig_0.8_del.txt");
        fileName[3] = ("orig_0.8_dis_1.txt");
        fileName[4] = ("orig_0.8_dis_3.txt");
        fileName[5] = ("orig_0.8_dis_7.txt");
        fileName[6] = ("orig_0.8_dis_10.txt");
        fileName[7] = ("orig_0.8_dis_15.txt");
        fileName[8] = ("orig_0.8_mix.txt");
        fileName[9] = ("orig_0.8_rep.txt");

        String[] str = new String[10];

        for(int i = 0; i <= 9; i++){
            str[i] = TxtIO.readTxt("D:/test/sim/"+fileName[i]);
            int hmDistance = Hamming.getDistance(SimHash.getSimHash(str[0]),SimHash.getSimHash(str[i]));
            System.out.println(fileName[0]+" 和 "+fileName[i]+"\n\t\t\t汉明距离: " + hmDistance + " 相似度: " + (100-hmDistance*100/128)+"%");
        }

    }
}
