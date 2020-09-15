package com.buzhouI;

import org.junit.Test;

public class TxtIOTest {

    @Test
    public void readTxtTest(){
        String str = TxtIO.readTxt("D:/test/sim/orig.txt");
        String[] strings = str.split(" ");
        for (String string : strings)
            System.out.println(string);
    }

    @Test
    public void writeTxtTest(){
        double[] elem = {0.11,0.22,0.33,0.44,0.55};
        for(int i = 0; i < elem.length; i++){
            TxtIO.writeTxt(elem[i],"D:/test/sim/ans.txt");
        }
    }
}
