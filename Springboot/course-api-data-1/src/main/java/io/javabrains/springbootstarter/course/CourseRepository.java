package io.javabrains.springbootstarter.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course ,String>{
	
	//getAllTopic()
	//getTopic(String id)
	//update(Topic t)
	// deleteTopic(String id)
	
	public List<Course> findByTopicId(String topicId);
	
	
}
