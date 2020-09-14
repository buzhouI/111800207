package com.buzhouI;

import com.hankcs.hanlp.HanLP;

import java.io.*;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.List;

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

    public static String hash(String str){//hash步骤，这里利用MD5获得hash值
        try{
            MessageDigest md = MessageDigest.getInstance("MD5");
            return new BigInteger(1,md.digest(str.getBytes("UTF-8"))).toString(2);
        }catch(Exception e){
            e.printStackTrace();
            return str;
        }
    }

    public static String getSimHash(String str){
        int[] v = new int[128];//用数组表示特征向量,取128位,从0 1 2 位开始表示从高位到低位
        //1.分词
        List<String> keywordList = HanLP.extractKeyword(str,str.length());//取出所有关键词

        //2.hash
        int i = 0, size = keywordList.size();//以i做外层循环
        for(String keyword : keywordList){
            String kwHash = hash(keyword);

            if (kwHash.length() < 128){//hash值可能少于128位，在低位以0补齐
                int dif = 128 - kwHash.length();
                for(int j = 0; j < dif; j++){
                    kwHash += "0";
                }
            }

            //3.加权
            //4.合并
            for(int j = 0; j < v.length; j++){
                if(kwHash.charAt(j) == '1'){//权重分10级，由词频从高到低，取权重10 -> 0
                    v[j] += (10-(i/(size/10)));
                }else{
                    v[j] -= (10-(i/(size/10)));
                }
            }

            i++;
        }

        //5.降维
        String simHash = "";//储存返回的simHash值
        for (int j = 0; j < v.length; j++){//从高位遍历到低位
            if(v[j] <= 0) simHash += "0";
            else          simHash += "1";
        }

        return simHash;
    }

    public static void main(String[] args){
        String str1 = readTxt("");
        String str2 = readTxt("");
        String simHash1 = getSimHash(str1);
        String simHash2 = getSimHash(str2);
        int distance = Hamming.getDistance(simHash1,simHash2);
    }
}
