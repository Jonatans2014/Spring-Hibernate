package io.javabrains.springbootstarter.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	
	@Autowired
	private CourseRepository  courseRepository;
	/*
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
	
			new Topic("Spring","Spring Framework","Spring Framework Description"),
			new Topic("Java","Spring Framework","Spring Framework Description"),
			new Topic("JavaScript","Spring Framework","Spring Framework Description")));


*/
	public List<Course> getAllCourse(String topicId) {
		
		List<Course> courses = new ArrayList<>();
		
		
		
		//Java 8 lamba expression
		
		courseRepository.findByTopicId(topicId)
		.forEach(courses::add);
		
		return courses;

		
		/*
		courseRepository.findAll()
				.forEach(courses::add);
		 */
		
	}
	
	public Optional<Course> getCourse(String id) {
		//return  topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		
		return courseRepository.findById(id);
	}
	
	public void addCourse(Course course)
	{
		courseRepository.save(course);
	}
	
	//update the topic object
	public void updateCourse( Course course) {
		
		/*
		for(int i=0; i < topics.size(); i++)
		{
			Topic t = topics.get(i);
			
			if(t.getId().equals(id))
			{
				topics.set(i, topic);
				return;
			}
		}*/
		
		courseRepository.save(course);
		
	}

	public void deleteCourse(String id) {
		// TODO Auto-generated method stub
		
		//using lambda expression
		//topics.removeIf(t -> t.getId().equals(id));
	
		courseRepository.deleteById(id);
	}
 


}
