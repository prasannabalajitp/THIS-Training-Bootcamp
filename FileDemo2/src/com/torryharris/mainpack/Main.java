package com.torryharris.mainpack;

import java.io.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File file1=new File("C:\\Users\\shivakumar_hombal\\Desktop\\file1.txt");
        try(FileReader fr=new FileReader(file1);
            BufferedReader br=new BufferedReader(fr);){
            String str=br.readLine();
            while ((str= br.readLine())!=null){
                System.out.println(str);
                str=br.readLine();
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
}
