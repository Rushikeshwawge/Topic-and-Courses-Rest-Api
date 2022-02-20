package io.starterprojectdata.topic;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String>{

	
	//getAllTopics()
	//getTopic(string id)
	//updateTopic(Topic topic, String id)
	//deleteTopic(string id)
}
