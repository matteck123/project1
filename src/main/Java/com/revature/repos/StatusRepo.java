package com.revature.repos;

import com.revature.beans.Status;

public interface StatusRepo {
	void updateStatus(Integer statusId);
	void addStatus(Integer storyId);
	
	Status getStatusByStory(Integer storyId);
	Status getStatus(Integer statusId);
}
