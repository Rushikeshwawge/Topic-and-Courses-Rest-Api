package io.starterprojectdata.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String>{

	
	//getAllTopics()
	//getTopic(string id)
	//updateTopic(Topic topic, String id)
	//deleteTopic(string id)
	
	public List<Course> findByTopicId(String TopicId);
}
