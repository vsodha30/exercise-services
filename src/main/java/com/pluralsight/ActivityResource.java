package com.pluralsight;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.pluralsight.model.Activity;
import com.pluralsight.model.User;
import com.pluralsight.repository.AcitivityRepositoryStub;
import com.pluralsight.repository.ActivityRepository;

@Path("activities")
public class ActivityResource {

	//private static final String activityId = null;
	private ActivityRepository activityRepository= new AcitivityRepositoryStub();
	
	@GET
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public List<Activity> getActivities(){
		
		return activityRepository.findAllActivities();
		 
	}
 	
	//,MediaType.APPLICATION_XML
	
	@GET
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Path("{activityId}")     // http://localhost:8080/exercise-services/webapi/activities/1
	public Activity getActivity(@PathParam("activityId") String activityId ){
		
		
		return activityRepository.findActivity(activityId);
		 
	}
	
	@GET
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Path("{activityId}/user")     // http://localhost:8080/exercise-services/webapi/activities/1
	public User getActivityUser(@PathParam("activityId") String activityId ){
		
		
		return activityRepository.findActivity(activityId).getUser();
		 
	}
	
}
