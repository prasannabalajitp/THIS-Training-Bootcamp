package com.torryharris.mainpack;

import com.torryharris.exceptionpack.ReadInput;

import java.io.IOException;
import java.util.Objects;

public class Main {

    public static void main(String[] args) throws IOException {
//        int result=0;

        /*try {
            int n1=Integer.parseInt(args[0]);
            int n2=Integer.parseInt(args[1]);
            result = n1 / n2;
        }catch (ArithmeticException e){
            System.out.println("The exception is : "+e.getMessage());
        }
        catch (NumberFormatException e){
            System.out.println("Invalid input : "+e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Insufficient inputs "+e.getMessage());
        }
        System.out.println(result);

        System.out.println("Bye !!!");*/

        ReadInput ri=new ReadInput();
        ri.readInput();
        ri.readInput1();
        ri.readInput2();
        System.out.println("Bye!!!");
    }
}
