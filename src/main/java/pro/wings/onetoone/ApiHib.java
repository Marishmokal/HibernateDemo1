package pro.wings.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ApiHib {
public static void main(String[] args) {
	
	System.out.println("Project Started !!");
	
	SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	Session session=factory.openSession();
	Transaction tx=session.beginTransaction();
	
	
	Question q=new Question();
	q.setQuestionId(1212);
	q.setQuestion("what is java...????");
	
	Answer answer=new Answer();
	answer.setAnswerId(343);
	answer.setAnswer("java is programming langauge");
	q.setAnswer(answer);
	
	
	session.save(q);
	session.save(answer);
	
	tx.commit();
	
	session.close();
	
	System.out.println("Project Ended !!!");
	
}
}
