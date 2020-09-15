package com.buzhouI;

public class Hamming {
    /**
     * 输入两个simHash值，计算他们的汉明距离
     * @param str1
     * @param str2
     * @return distance
     */
    public static int getDistance(String str1,String str2){
        int distance = 0;
        if(str1.length() != str2.length()){
            distance = -1;
        }else{
            for(int i = 0; i < str1.length(); i++){
                if(str1.charAt(i) != str2.charAt(i)){
                    distance++;
                }
            }
        }
        return distance;
    }

    /**
     * 输入两个simHash值,输出相似度
     * @param str1
     * @param str2
     * @return similarity
     */
    public static double getSimilarity(String str1,String str2){
        return  0.01*(100-getDistance(str1,str2)*100/128);
    }
}
