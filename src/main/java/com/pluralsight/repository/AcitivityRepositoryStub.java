package com.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import com.pluralsight.model.Activity;
import com.pluralsight.model.User;

public class AcitivityRepositoryStub implements ActivityRepository {

	/* (non-Javadoc)
	 * @see com.pluralsight.repository.ActivityRepository#findAllActivities()
	 */
	@Override
	public List<Activity> findAllActivities(){
		List<Activity> activities = new ArrayList<Activity>();
		Activity activity1 = new Activity();
		activity1.setDescription("Swimming");
		activity1.setDuration(55);
		Activity activity2 = new Activity();
		activity2.setDescription("Cycling");
		activity2.setDuration(120);
		activity1.setId("1");
		activity2.setId("2");
		activities.add(activity1);
		activities.add(activity2);
		
		return activities;
		
	}
	@Override
	public Activity findActivity(String id) {
		// TODO Auto-generated method stub
		List<Activity> activities = new ArrayList<Activity>();
		Activity activity1 = new Activity();
		activity1.setDescription("Swimming");
		activity1.setDuration(55);
		activity1.setId("1");
		Activity activity2 = new Activity();
		activity2.setDescription("Cycling");
		activity2.setDuration(120);
		activity2.setId("2");
		activities.add(activity1);
		activities.add(activity2);
		User user1 = new User();
		user1.setId("pehla");
		user1.setName("Vishwaraj");
		User user2 = new User();
		user2.setId("doosra");
		user2.setName("Manish");
		activity1.setUser(user1);
		activity2.setUser(user2);
		Activity activity = new Activity();
		for(int i=0;i<activities.size();i++){
			if(activities.get(i).getId().equals(id)){
				activity=activities.get(i);
			}
		}
		return activity;
	}
	
	
	
}
