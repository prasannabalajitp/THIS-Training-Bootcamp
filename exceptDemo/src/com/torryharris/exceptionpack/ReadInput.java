package com.torryharris.exceptionpack;

import java.io.*;

public class ReadInput {
    public static String readInput1() {
        try(InputStreamReader ir=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(ir);) {
            System.out.println("Read two inputs : ");

            String s1, s2;
            s1 = br.readLine();
            s2 = br.readLine();

            int result= Integer.parseInt(s1) / Integer.parseInt(s2);

            return ("result : "+result);
        }
        catch (IOException e) {
            return  ("Exception is : "+e);
        }
        catch (ArithmeticException e){
            return  e.getMessage();
        }
        catch (NumberFormatException e){
            return e.getMessage();
        }
    }

    public String readInput2() throws IOException {
        InputStreamReader ir=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(ir);
        System.out.println("Read two inputs : ");

        String s1, s2;
        s1 = br.readLine();
        s2 = br.readLine();

        int result= Integer.parseInt(s1) / Integer.parseInt(s2);

        return ("result : "+result);
    }


    public void readInput() {
        InputStreamReader ir = null;
        BufferedReader br = null;


        String s1, s2;
        try {
            ir = new InputStreamReader(System.in);
            br = new BufferedReader(ir);

            System.out.println("Read two inputs : ");
            s1 = br.readLine();
            s2 = br.readLine();

            int result= Integer.parseInt(s1) / Integer.parseInt(s2);

            System.out.println(result);
        }catch(ArithmeticException | IOException e){
            e.printStackTrace();
        } catch (NumberFormatException e){
            System.out.println("Invalid input : "+e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Insufficient inputs "+e.getMessage());
        } finally {
            try {
                assert ir != null;
                ir.close();
                br.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }

    }
}
