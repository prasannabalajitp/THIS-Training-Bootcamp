package com.torryharris.fpack;

import com.torryharris.spack.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class WriteObjectClass {
    public void WriteObject(){
        File file2=new File("C:\\Users\\shivakumar_hombal\\Desktop\\file4.txt");
        try(FileOutputStream output=new FileOutputStream(file2);
            ObjectOutputStream out=new ObjectOutputStream(output)){
            ArrayList<Student> slist=new ArrayList<>();
            slist.add(new Student(1,80,80,80));
            slist.add(new Student(2,80,80,80));
            slist.add(new Student(3,80,80,80));
            Iterator<Student> it=slist.iterator();
            while (it.hasNext()){
                Student s=it.next();
                s.setTotal();
                System.out.println(s);
                out.writeObject(s);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
