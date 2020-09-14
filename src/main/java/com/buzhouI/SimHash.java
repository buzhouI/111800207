package com.buzhouI;

import java.io.*;

public class SimHash {

    public static String readTxt(String name) {
        String str = "";
        String str_line;

        //将txt文件按行读入str中
        File file = new File(name);
        FileReader fr = null;
        try {
            fr = new FileReader(file);
            BufferedReader bufr = new BufferedReader(fr);
            while ((str_line = bufr.readLine())!=null)
                str += str_line;

            bufr.close();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return str;
    }

    private static String hash(String str){
        return null;
    }

    public static String getSimHash(String str){
        //1.分词
        //2.hash
        hash(str);
        //3.加权
        //4.合并
        //5.降维
        return null;
    }

    public static void main(String[] args){
        String str1 = readTxt("");
        String str2 = readTxt("");
        String simHash1 = getSimHash(str1);
        String simHash2 = getSimHash(str2);
        int distance = Hamming.getDistance(simHash1,simHash2);
    }
}
