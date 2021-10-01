package com.torryharris.fpack;

import com.torryharris.spack.Student;

import java.io.*;

public class ReadObjectClass {
    public void ReadObject(){
        File file2=new File("C:\\Users\\shivakumar_hombal\\Desktop\\file4.txt");
        try(FileInputStream input=new FileInputStream(file2);
            ObjectInputStream out=new ObjectInputStream(input)) {
            System.out.println("Read the file");
            while (input.available()>0){
                Student sob=
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
