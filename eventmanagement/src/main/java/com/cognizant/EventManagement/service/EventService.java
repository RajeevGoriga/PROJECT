package com.cognizant.EventManagement.service;

import java.util.List;

import com.cognizant.EventManagement.entity.Event;

public interface EventService {

	public List<Event> getAllEmployees();
	public void saveEvent(Event emp);
	public Event getEvent(int id);
	public void deleteEvent(int id);
}