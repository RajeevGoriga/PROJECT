package com.cognizant.EventManagement.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cognizant.EventManagement.entity.Event;

@Repository
public class EventDaoImpl implements EventDAO {

	@Autowired
	SessionFactory factory;

	@Override
	public List<Event> getAllEmployees()
	{
	    Session session =factory.getCurrentSession();
	    Query<Event> query =session.createQuery("from Event",Event.class);
	    List<Event> empList=query.getResultList();
	    return empList;
	}

	@Override
	public void saveEvent(Event eve) 
	{
		Session session =factory.getCurrentSession();
		session.saveOrUpdate(eve);
		System.out.println(eve);
	}

	@Override
	public Event getEvent(int id) 
	{
		Session session =factory.getCurrentSession();
		Event event=session.get(Event.class, id);
		return event;
	}

	@Override
	public void deleteEvent(int id) 
	{
		Session session =factory.getCurrentSession();
		Event em=session.get(Event.class, id);
		session.delete(em);
		System.out.println("Deleted!");
	}
}