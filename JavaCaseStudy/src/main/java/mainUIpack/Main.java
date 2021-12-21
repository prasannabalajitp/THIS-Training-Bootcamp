package mainUIpack;

import DBManager.dbcon;
import bpack.Passenger;
import bpack.Ticket;
import bpack.Train;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        dbcon dbdata=new dbcon();
        Scanner sc = new Scanner(System.in);
        Train tr1 = new Train(12345, "Modi Train", "Bangalore", "Dubai", 100);


        System.out.println("Enter Train Number");
        int t_no = sc.nextInt();
        tr1.setTrainNo(t_no);

        System.out.println("Enter Travel Date");
        String sDate1 = sc.next();
        Ticket ticket = new Ticket(sDate1, tr1);
        ticket.setDate(sDate1);

        System.out.println("Enter your Passenger Count:");
        int personCount = sc.nextInt();
        //Passenger passengers[] = new Passenger[];
        ArrayList<Passenger> plist = new ArrayList<Passenger>();
        while (personCount != 0) {

            System.out.println("Enter Passenger Name ");
            String p_name = sc.next();
            System.out.println("Enter Age");
            int age = sc.nextInt();
            System.out.println("EnterGender (M/F)");
            String gen = sc.next();
            char gender = gen.charAt(0);
            //plist.add(new Passenger(p_name,age,gender));
            ticket.addPassenger(p_name, age, gender);

            personCount--;
            ticket.writeTicket();

        }
    }
}
