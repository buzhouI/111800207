package com.buzhouI;

import org.junit.Before;
import org.junit.Test;

public class TestCase {

    @Test
    public void origAndAllTest(){
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

        String ansFileName = "D:/test/sim/ans.txt";

        for(int i = 0; i <= 9; i++){
            double ans = Hamming.getSimilarity(SimHash.getSimHash(str[0]),SimHash.getSimHash(str[i]));
            TxtIO.writeTxt(ans,ansFileName);

        }
    }

    @Test
    public void origAndOrigTest(){
        String str0 = TxtIO.readTxt("D:/test/sim/orig.txt");
        String str1 = TxtIO.readTxt("D:/test/sim/orig.txt");
        String ansFileName = "D:/test/sim/ans.txt";
        double ans = Hamming.getSimilarity(SimHash.getSimHash(str0),SimHash.getSimHash(str1));
        TxtIO.writeTxt(ans,ansFileName);
    }

    @Test
    public void origAndAddTest(){
        String str0 = TxtIO.readTxt("D:/test/sim/orig.txt");
        String str1 = TxtIO.readTxt("D:/test/sim/orig_0.8_add.txt");
        String ansFileName = "D:/test/sim/ans.txt";
        double ans = Hamming.getSimilarity(SimHash.getSimHash(str0),SimHash.getSimHash(str1));
        TxtIO.writeTxt(ans,ansFileName);
    }

    @Test
    public void origAndDelTest(){
        String str0 = TxtIO.readTxt("D:/test/sim/orig.txt");
        String str1 = TxtIO.readTxt("D:/test/sim/orig_0.8_del.txt");
        String ansFileName = "D:/test/sim/ans.txt";
        double ans = Hamming.getSimilarity(SimHash.getSimHash(str0),SimHash.getSimHash(str1));
        TxtIO.writeTxt(ans,ansFileName);
    }

    @Test
    public void origAndDis1Test(){
        String str0 = TxtIO.readTxt("D:/test/sim/orig.txt");
        String str1 = TxtIO.readTxt("D:/test/sim/orig_0.8_dis_1.txt");
        String ansFileName = "D:/test/sim/ans.txt";
        double ans = Hamming.getSimilarity(SimHash.getSimHash(str0),SimHash.getSimHash(str1));
        TxtIO.writeTxt(ans,ansFileName);
    }

    @Test
    public void origAndDis3Test(){
        String str0 = TxtIO.readTxt("D:/test/sim/orig.txt");
        String str1 = TxtIO.readTxt("D:/test/sim/orig_0.8_dis_3.txt");
        String ansFileName = "D:/test/sim/ans.txt";
        double ans = Hamming.getSimilarity(SimHash.getSimHash(str0),SimHash.getSimHash(str1));
        TxtIO.writeTxt(ans,ansFileName);
    }

    @Test
    public void origAndDis7Test(){
        String str0 = TxtIO.readTxt("D:/test/sim/orig.txt");
        String str1 = TxtIO.readTxt("D:/test/sim/orig_0.8_dis_7.txt");
        String ansFileName = "D:/test/sim/ans.txt";
        double ans = Hamming.getSimilarity(SimHash.getSimHash(str0),SimHash.getSimHash(str1));
        TxtIO.writeTxt(ans,ansFileName);
    }

    @Test
    public void origAndDis10Test(){
        String str0 = TxtIO.readTxt("D:/test/sim/orig.txt");
        String str1 = TxtIO.readTxt("D:/test/sim/orig_0.8_dis_10.txt");
        String ansFileName = "D:/test/sim/ans.txt";
        double ans = Hamming.getSimilarity(SimHash.getSimHash(str0),SimHash.getSimHash(str1));
        TxtIO.writeTxt(ans,ansFileName);
    }

    @Test
    public void origAndDis15Test(){
        String str0 = TxtIO.readTxt("D:/test/sim/orig.txt");
        String str1 = TxtIO.readTxt("D:/test/sim/orig_0.8_dis_15.txt");
        String ansFileName = "D:/test/sim/ans.txt";
        double ans = Hamming.getSimilarity(SimHash.getSimHash(str0),SimHash.getSimHash(str1));
        TxtIO.writeTxt(ans,ansFileName);
    }

    @Test
    public void origAndMixTest(){
        String str0 = TxtIO.readTxt("D:/test/sim/orig.txt");
        String str1 = TxtIO.readTxt("D:/test/sim/orig_0.8_mix.txt");
        String ansFileName = "D:/test/sim/ans.txt";
        double ans = Hamming.getSimilarity(SimHash.getSimHash(str0),SimHash.getSimHash(str1));
        TxtIO.writeTxt(ans,ansFileName);
    }

    @Test
    public void origAndRepTest(){
        String str0 = TxtIO.readTxt("D:/test/sim/orig.txt");
        String str1 = TxtIO.readTxt("D:/test/sim/orig_0.8_rep.txt");
        String ansFileName = "D:/test/sim/ans.txt";
        double ans = Hamming.getSimilarity(SimHash.getSimHash(str0),SimHash.getSimHash(str1));
        TxtIO.writeTxt(ans,ansFileName);
    }

}
