package com.kartik.springRest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.kartik.springRest.Course;

@Service
public class Courseservice implements Courseinterface {

	
	List<Course> list;
	
	public Courseservice() {
		list=new ArrayList<>();
		list.add(new Course(101,"Java Core","Basics of Core Java "));
		list.add(new Course(102,"Advanced Java","Full Advanced Java Course"));
		list.add(new Course(103,"Angular JS ","Basics of Angular JS"));
	}

	@Override
	public List<Course> getCourses() {
		
		return list;
	}

	@Override
	public Course getCourse(int id) {
		for(Course c:list)
		{
			if(c.getId()==id)
			{
				return c;
			}
		}
		return null;
	}

	@Override
	public Course addCourse(Course course) {
		list.add(course);
		return course;
	}

}
