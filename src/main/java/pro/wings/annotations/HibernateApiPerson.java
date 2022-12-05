package pro.wings.annotations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateApiPerson {
	public static void main(String[] args) {
		System.out.println("Hibernate start");
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		Person p1=new Person("Vishwajit rhyakar","kolhapur",411048);
		Person p2=new Person("Pranav Ketagale","Sangli",423568);
	
		
		session.save(p1);
		session.save(p2);
		tx.commit();
		System.out.println("ended");
		
	}
}

