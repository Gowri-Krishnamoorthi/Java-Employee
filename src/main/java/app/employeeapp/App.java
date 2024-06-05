package app.employeeapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration();
    	cfg.configure();
    	SessionFactory factory=cfg.buildSessionFactory();
    	Session s=factory.openSession();
    	
    	//Employee employee = new Employee(1324,"Gowri",20000);
    	//Employee employee = new Employee(4533,"Revathi",5469);

    	Employee employee1 = new Employee(1222,"Priya",7000);
    	Transaction t=s.beginTransaction();
    	s.save(employee1);
    	//s.save(employee1);
    	t.commit();
    }
    
}
