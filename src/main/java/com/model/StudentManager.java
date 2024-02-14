package com.model;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
public class StudentManager 
{
 public String insertData(Student S) throws Exception
 {
  SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
  Session session = factory.openSession();
  
  session.getTransaction().begin();
  session.persist(S);
  session.getTransaction().commit();
  session.close();
  factory.close();
  return "Data Inserted Successfully...";
 }
 public List<Student> getData()throws Exception{
	 SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	  Session session = factory.openSession();
	  
	  session.getTransaction().begin();
	  CriteriaBuilder cb = session.getCriteriaBuilder();
	  CriteriaQuery<Student> cr = cb.createQuery(Student.class);
	  Root<Student> root = cr.from(Student.class);
	  //cr.select(root);
	  //cr.select(root).where(cb.gt(root.get("sid"),2));
	  //cr.select(root).where(cb.lt(root.get("sid"),2));
	  //cr.select(root).where(cb.like(root.get("sname"), "%s%"));
	  cr.select(root).where(cb.between(root.get("sid"), 3,5));
	  TypedQuery<Student> qry = session.createQuery(cr);
	  
	  List<Student> list=new ArrayList<Student>();
	  //TypedQuery<Student>qry=session.createQuery("select s from Student s",Student.class);
	  
	  list=qry.getResultList();
	  session.getTransaction().commit();
	  session.close();
	  factory.close();
	  return list;	 
 }
 public String UpdateData(Student s)throws Exception{
	 SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	  Session session = factory.openSession();
	  
	  session.getTransaction().begin();
	  Student s1=session.find(Student.class, s.sid);
	  s1.setSname(s.getSname());
	  s1.setSdept(s.getSdept());
	  session.merge(s1);
	  session.getTransaction().commit();
	  session.close();
	  factory.close(); 
	 return "Updation done successfully..";
 }
 public String Deletion(int sid)throws Exception{
	 SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	  Session session = factory.openSession();
	  
	  session.getTransaction().begin();
	  Student s1=session.find(Student.class, sid);
	 session.remove(s1);
	  //session.delete(s1);
	  session.getTransaction().commit();
	  session.close();
	  factory.close();
	  return "Deletion done successfully..";
 }
 
}