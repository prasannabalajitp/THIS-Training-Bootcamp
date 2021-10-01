package com.torryharris.mainpack;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        File file1=new File("C:\\Users\\shivakumar_hombal\\Desktop\\file1.txt");
        File file2=new File("C:\\Users\\shivakumar_hombal\\Desktop\\file2.txt");
        try(FileInputStream input=new FileInputStream(file1);
            BufferedInputStream bis=new BufferedInputStream(input);
            FileOutputStream output=new FileOutputStream(file2);
            BufferedOutputStream bos=new BufferedOutputStream(output)){
            byte[] buffer=new byte[input.available()];
            bis.read(buffer);
            bos.write(buffer);
            for (byte c:buffer){
                System.out.print((char)c);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
