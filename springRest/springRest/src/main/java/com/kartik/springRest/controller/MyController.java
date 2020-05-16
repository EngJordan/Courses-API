package com.kartik.springRest.controller;

import java.util.List;

import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kartik.springRest.Course;
import com.kartik.springRest.service.Courseinterface;

@RestController
public class MyController {

	@Autowired
    private	Courseinterface course;
	
	
	@GetMapping("/home")
	public String getHome()
	{
		return "hello world!";
	}
	
	@GetMapping("/courses")
	public List<Course> getCourses()
	{
		
		return this.course.getCourses();
	}
	
	@GetMapping("/course/{id}")
	public Course getCourse(@PathVariable int id)
	{
		
		return this.course.getCourse(id);
	}
	
	
	@PostMapping("/course")
	public Course addCourse(@RequestBody Course course)
	{
		return this.course.addCourse(course);
	}
	
	@PutMapping("/course")
	public Course updateCourse(@RequestBody Course course)
	{
		return this.course.updateCourse(course);
	}
	
	

	@DeleteMapping("/course/{courseId}")
	public Course deleteCourse(@PathVariable int courseId)
	{
		return this.course.deleteCourse(courseId);
	}
}
