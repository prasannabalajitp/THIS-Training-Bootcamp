package pack1.MySpringJdbcDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pack1.Employee;
import pack1.EmployeeDAO;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    { 
        ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
        
        EmployeeDAO empd=(EmployeeDAO)ctx.getBean("EmployeeDAO");
        
        Employee e1=new Employee();
        e1.setEmpid(1001);
        e1.setEmpname("Shivakumar");
        e1.setSalary(60000);
        empd.insert(e1);
        System.out.println("Record insertionn successful");
        
        
        ((ClassPathXmlApplicationContext)ctx).close();
    }
}
