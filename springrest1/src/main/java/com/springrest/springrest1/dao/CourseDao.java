package com.springrest.springrest1.dao;

import com.springrest.springrest1.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;
public interface CourseDao extends JpaRepository<Course,Long> {

}
