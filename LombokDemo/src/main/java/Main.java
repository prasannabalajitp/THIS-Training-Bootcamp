public class Main {
    public static void main(String[] args){
        Customer c1=new Customer(10,"aaa",10000);
        System.out.println(c1);

        Customer c2=new Customer();
        c2.setCustId(11);
        c2.setCustName("bbb");
        c2.setBalance(20000);
        System.out.println(c2);

        Customer c3=new Customer();
        System.out.println(c3.getCustId());
    }
}
