package io.starterprojectdata.course;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	
	public List<Course> getAllCourses(String TopicId){
		//return topics;
		List<Course> courses = new ArrayList<>();
		courseRepository.findByTopicId(TopicId)
		.forEach(courses::add);
		return courses;
			}
	
	public Optional<Course> getCourse(String id) {
		return courseRepository.findById(id);
	}
	
	public void addCourse(Course course) {
		courseRepository.save(course);
	}
	
	public void updateCourse(Course course) {
		courseRepository.save(course);
	}
	
	public void deleteCourse(String id) {
		//topics.removeIf(t -> t.getId().equals(id));
		courseRepository.deleteById(id);
	}

}
