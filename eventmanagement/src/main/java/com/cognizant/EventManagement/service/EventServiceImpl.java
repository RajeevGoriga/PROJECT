package com.cognizant.EventManagement.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.EventManagement.dao.EventDAO;
import com.cognizant.EventManagement.entity.Event;

@Service
public class EventServiceImpl implements EventService {

	@Autowired
	EventDAO eventDao;
	
	@Override
	@Transactional
	public List<Event> getAllEmployees() {
		
		return eventDao.getAllEmployees();
	}

	@Override
	@Transactional
	public void saveEvent(Event eve) {
		eventDao.saveEvent(eve);
		
	}

	@Override
	@Transactional
	public Event getEvent(int id) {
		return eventDao.getEvent(id);
	}

	@Override
	@Transactional
	public void deleteEvent(int id) {
		eventDao.deleteEvent(id);
	}

}