package com.kartik.springRest.service;

import java.util.List;

import com.kartik.springRest.Course;

public interface Courseinterface
{
	public List<Course> getCourses();
	
	public Course getCourse(int id);
	
	public Course addCourse(Course course);
	
	public Course updateCourse(Course course);
	
	public Course deleteCourse(int id);
}
