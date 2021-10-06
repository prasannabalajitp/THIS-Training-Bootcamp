package bpack;

import DBManager.dbcon;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Ticket {
    private static int counter;
    private String date;
    private Train train = new Train();
    //private Main main= new Main();
    private String pnr="";
    File tic= new File("C:\\Users\\user121\\Desktop\\workspace\\aegon12.txt");

    // private File countFile = new File("com\\resource\\count.txt");


    //private TreeMap<Passenger,Double> plist = new TreeMap<Passenger, Double>() ;
    private Map<Passenger, Double> plist = new HashMap<Passenger,Double>();




    public Ticket(String date, Train train) {
        this.date = date;
        this.train = train;
    }

    public Ticket() {

    }

    public int getCounter()
    {
        int count=0;
        try {
//            File f1= new File(tic.getParent()+"\\counter.txt");
//            if(!f1.isFile())
//            f1.createNewFile();
//
            FileReader fr=new FileReader(tic.getParent()+"\\counter.txt");
            int i;
            while((i=fr.read())!= -1)
            {
                char ch=(char)i;
                count= (count*10) + Integer.parseInt(Character.toString(ch));
            }
            System.out.println("Count= "+count);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        counter=count;
        return count;

    }

    public void setDate(String date) {
        this.date = date;
    }

    private String generatePNR()
    {

        pnr = Character.toString( train.getSource().charAt(0)) + Character.toString( train.getDestination().charAt(0)) + "_";
        String[] pnrArr= date.split("/");
        for(String s:pnrArr)
        {
            pnr=pnr+s;
        }
        pnr= pnr+"_"+getCounter();
        return pnr;

    }
    private double calcPassengerFare(Passenger p)
    {

        double ticketPrice= train.getTicketPrice();

        //if(p.gender == 'F' || p.age>=60)
        if(p.getGender() =='F')
            ticketPrice = ticketPrice * 0.75;
        else if (p.getAge() >= 60)
            ticketPrice = ticketPrice * 0.6;
        else if(p.getAge()<=12)
            ticketPrice = ticketPrice * 0.5;


        return  ticketPrice;

    }
    public void addPassenger(String name,int age, char gender)
    {

        Passenger p=new Passenger(name,age,gender);
        double fare = calcPassengerFare(p);
        plist.put( new Passenger(name,age,gender), fare);

    }
    private double calcTotalTicketPrice()
    {
        double price=0;

        for(Double fr: plist.values())
        {
            price+= fr;
        }
        return price;

    }
    private StringBuilder generateTicket()
    {

        StringBuilder ticketString =new StringBuilder();
        // System.out.println("pnr = "+generatePNR() );

        ticketString.append("PNR          :"+generatePNR()+"\n");
        ticketString.append("\nTrain no     :"+ train.getTrainNo()+"\n");
        ticketString.append("\nTrain Name     :"+train.getTrainName()+"\n");
        ticketString.append("\nFrom     :"+train.getSource()+"\n");
        ticketString.append("\nTo     :"+train.getDestination()+"\n");
        ticketString.append("\nTravel Date     :"+date+"\n");
        ticketString.append("\n");
        ticketString.append("\nPassengers:"+"\n");
        ticketString.append("\nName\t\t\tAge\t\t\tGender\t\t\tFare");

        for(Passenger p: plist.keySet())
        {
            ticketString.append ("\n"+p.getName()+"\t\t\t"+p.getAge()+"\t\t\t"+p.getGender()+"\t\t\t"+ plist.get(p)+"\n");
            //System.out.println(p+" " + plist.get(p));
        }

        System.out.println(ticketString);

        return ticketString;

    }

    public void writeTicket()
    {

        StringBuilder str=  generateTicket();
        String ticketSring= str.toString();
        System.out.println("-____________________________________________");
        System.out.println("______________________________________________");
        System.out.println(ticketSring);

        try {
            //tic.createNewFile();
            FileWriter wr= new FileWriter(tic.getParent()+"\\riya.txt");
            FileWriter cwr = new FileWriter(tic.getParent()+"\\counter.txt");
            String Tname = pnr+".txt";
            File fticket= new File(tic.getParent()+"\\tickets\\"+Tname);
//            BufferedWriter bufferedWriter = new BufferedWriter(wr);
//            bufferedWriter.write("HI ");
            if(fticket.isFile())
            {
                System.out.println("The ticket is already booked... Try with another ticket");
            }
            else
            {
                FileWriter twriter= new FileWriter(fticket.getParent()+"\\"+Tname);
                twriter.write(ticketSring);
                twriter.close();

            }
            wr.write(ticketSring);
            //wr.write("Hello");
            wr.close();
            //int ct= getCounter();
            // counter= ct+1;
            int ct= counter+1;
            System.out.println("Counter = "+counter);
            cwr.write(""+ct);
            cwr.close();
            PrintWriter pr = new PrintWriter(tic.getParent()+"\\aegon.txt");
            pr.println(str);
            pr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
