package com.buzhouI;

import java.io.*;

public class TxtIO {

    /**
     * 传入文件绝对路径名，将文件内容转化为String输出
     * @param name
     * @return str
     */
    public static String readTxt(String name) {
        String str = "";
        String strLine;

        //将txt文件按行读入str中
        File file = new File(name);
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
            InputStreamReader reader = new InputStreamReader(fis,"UTF-8");
            BufferedReader bufr = new BufferedReader(reader);
            while ((strLine = bufr.readLine())!=null)
                str += strLine;

            reader.close();
            bufr.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return str;
    }

    /**
     * 传入内容、文件全路径名，将内容写入文件并换行
     * @param elem
     * @param name
     */
    public static void writeTxt(double elem,String name){
        String ans = Double.toString(elem);
        File file = new File(name);
        FileWriter fw = null;
        try {
            fw = new FileWriter(file,true);
            fw.write(ans,0,(ans.length()>3?4:ans.length()));
            fw.write("\r\n");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
