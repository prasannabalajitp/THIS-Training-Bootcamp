package com.torryharris.mainpack;
import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        File file1 = new File("C:\\Users\\shivakumar_hombal\\Desktop\\file1.txt");

        try {
            file1.createNewFile();
            System.out.println("File created successfully....");
        }catch (IOException e){
            System.out.println(e);
        }
        System.out.println(file1.getAbsolutePath());
        System.out.println(file1.getName());
        System.out.println(file1.getParent());

        File dir=new File("C:\\Users\\shivakumar_hombal\\Desktop");

        File[] filelist=dir.listFiles();
        for (File f:filelist){
            if (f.isFile())
                System.out.println(f.getName());
        }


    }
}
