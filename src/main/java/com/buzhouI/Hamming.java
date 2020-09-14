package com.buzhouI;

public class Hamming {
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
}
