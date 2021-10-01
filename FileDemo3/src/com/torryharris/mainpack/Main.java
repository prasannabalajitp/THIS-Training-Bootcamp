package com.torryharris.mainpack;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        File file1=new File("C:\\Users\\shivakumar_hombal\\Desktop\\file1.txt");
        File file2=new File("C:\\Users\\shivakumar_hombal\\Desktop\\file2.txt");
        try(FileReader fr=new FileReader(file1);
            BufferedReader br=new BufferedReader(fr);
            FileWriter fw=new FileWriter(file2,true);
            BufferedWriter bw=new BufferedWriter(fw);){
            String str;
            while ((str=br.readLine())!=null){
                System.out.println(str);
                bw.write(str);
                bw.newLine();
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
