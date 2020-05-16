package com.kartik.springRest.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.kartik.springRest.Course;

public interface DaoInterface extends JpaRepository<Course,Integer>{

}
