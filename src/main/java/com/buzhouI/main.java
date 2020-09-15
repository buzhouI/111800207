package com.buzhouI;

public class main {
    public static void main(String[] args) {
        String str0 = TxtIO.readTxt(args[0]);
        String str1 = TxtIO.readTxt(args[1]);
        String ansFileName = args[2];
        double ans = Hamming.getSimilarity(SimHash.getSimHash(str0),SimHash.getSimHash(str1));
        TxtIO.writeTxt(ans,ansFileName);
        System.exit(0);
    }
}
