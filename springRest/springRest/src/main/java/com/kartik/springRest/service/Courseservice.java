package com.kartik.springRest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kartik.springRest.Course;
import com.kartik.springRest.Dao.DaoInterface;

@Service
public class Courseservice implements Courseinterface {

	
	//List<Course> list;
	
	@Autowired
      private DaoInterface daointerface;
	
	public Courseservice() {
//		list=new ArrayList<>();
//		list.add(new Course(101,"Java Core","Basics of Core Java "));
//		list.add(new Course(102,"Advanced Java","Full Advanced Java Course"));
//		list.add(new Course(103,"Angular JS ","Basics of Angular JS"));
	}

	@Override
	public List<Course> getCourses() {
		
		
		return daointerface.findAll();
//		return list;
	}

	@Override
	public Course getCourse(int courseid) {
		
		System.out.println(daointerface.getOne(courseid));
		 return daointerface.getOne(courseid);
		
//		for(Course c:list)
//		{
//			if(c.getId()==id)
//			{
//				return c;
//			}
//		}
		
	}

	@Override	
	public Course addCourse(Course course) {
		
		daointerface.save(course);
//		list.add(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		
		daointerface.save(course);
		
		return course;
	}

	@Override
	public Course deleteCourse(int id) {
		Course entity=daointerface.getOne(id);
		daointerface.delete(entity);
		return null;
	}

}
