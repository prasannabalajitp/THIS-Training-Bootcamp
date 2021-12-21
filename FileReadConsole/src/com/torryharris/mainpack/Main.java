package com.torryharris.mainpack;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        File  file2 = new File("C:\\Users\\Admin\\Desktop\\thfile5.txt");
        try(InputStreamReader ir = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(ir);
            FileWriter fw = new FileWriter(file2);

            BufferedWriter bw = new BufferedWriter(fw);)
        {
            System.out.println("Enter your inputs");
            String str= br.readLine();  // good morning
            while(!(str.equalsIgnoreCase("END")))
            {
                System.out.println(str);
                bw.write(str);
                bw.newLine();
                str = br.readLine();
            }
            System.out.println("All data records added successfully!!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
