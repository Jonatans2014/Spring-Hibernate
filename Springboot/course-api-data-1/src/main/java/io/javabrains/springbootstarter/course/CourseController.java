package io.javabrains.springbootstarter.course;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.javabrains.springbootstarter.topic.Topic;

@RestController
public class CourseController {
	
	//AutoWired is used to mark that this need a dependency injection
	@Autowired	
	private CourseService courseService;
	//The Request will be automaticaly converted to Json
		
		
	//requestmapping is used to define a url to get or post
		@RequestMapping("/topics/{id}/courses")
		public List<Course> getAllCourses(@PathVariable String id)
		{
			return courseService.getAllCourse(id);
		}
		//Pathvariable  is used to define a variable in the path
		@RequestMapping("/courses/{id}")
		public Optional<Course> getCourse(@PathVariable String id)
		{
			return courseService.getCourse(id);
		}
		
		
		//specify a method using method tag so you can do a post 
		//request
		@RequestMapping(method=RequestMethod.POST, value="/topics/{topicId}/courses")
		public void addCourse(@RequestBody Course course, @PathVariable String topicId)
		{
			//requestBody tag is used to tell that your request payload
			// is gonna contain a representation of this topic instance
			course.setTopic(new Topic(topicId, "" , ""));
			courseService.addCourse(course);
			
		}
		
		
		//specify a method using method tag so you can do a update
				//request
				@RequestMapping(method=RequestMethod.PUT, value="/topics/{topicId}/courses/{id}")
				public void updateCourse(@RequestBody Course course,@PathVariable String topicId, @PathVariable String id)
				{
					//requestBody tag is used to tell that your request payload
					// is gonna contain a representation of this topic instance
					//
					course.setTopic(new Topic(topicId, "" , ""));
					courseService.updateCourse(course);
				}
				
				
				//specify a method using method tag so you can do a delete
				//request
				@RequestMapping(method=RequestMethod.DELETE, value="/topics/{topicId}/courses/{id}")
				public void deleteCourse(@PathVariable String id)
				{
					//requestBody tag is used to tell that your request payload
					// is gonna contain a representation of this topic instance
					//
					 courseService.deleteCourse(id);
				}
				
				
	
}
