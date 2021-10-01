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
            int c;
            while ((c= bis.read())!=-1){
                bos.write(c);
                System.out.println((char)c);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
