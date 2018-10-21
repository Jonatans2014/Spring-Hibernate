package io.javabrains.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	//AutoWired is used to mark that this need a dependency injection
	@Autowired	
	private TopicService topicService;
	//The Request will be automaticaly converted to Json
		
		
	//requestmapping is used to define a url to get or post
		@RequestMapping("/topics")
		public List<Topic> getAlltopics()
		{
			return topicService.getAllTopics();
		}
		//Pathvariable  is used to define a variable in the path
		@RequestMapping("/topics/{id}")
		public Optional<Topic> getTopic(@PathVariable String id)
		{
			return topicService.getTopic(id);
		}
		
		
		//specify a method using method tag so you can do a post 
		//request
		@RequestMapping(method=RequestMethod.POST, value="/topics")
		public void addTopic(@RequestBody Topic topic)
		{
			//requestBody tag is used to tell that your request payload
			// is gonna contain a representation of this topic instance
			//
			topicService.addTopic(topic);
		}
		
		
		//specify a method using method tag so you can do a update
				//request
				@RequestMapping(method=RequestMethod.PUT, value="/topics/{id}")
				public void updateTopic(@RequestBody Topic topic, @PathVariable String id)
				{
					//requestBody tag is used to tell that your request payload
					// is gonna contain a representation of this topic instance
					//
					topicService.updateTopic(id,topic);
				}
				
				
				//specify a method using method tag so you can do a delete
				//request
				@RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}")
				public void deleteTopic(@PathVariable String id)
				{
					//requestBody tag is used to tell that your request payload
					// is gonna contain a representation of this topic instance
					//
					 topicService.deleteTopic(id);
				}
				
				
	
}
