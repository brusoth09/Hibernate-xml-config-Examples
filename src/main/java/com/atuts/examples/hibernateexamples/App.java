package com.atuts.examples.hibernateexamples;

import org.hibernate.Session;

import com.atuts.examples.model.Student;
import com.atuts.examples.utils.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Student student = new Student("brusoth", 12);

		session.save(student);
		session.getTransaction().commit();
		
		HibernateUtil.getSessionFactory().close();
	}
}
