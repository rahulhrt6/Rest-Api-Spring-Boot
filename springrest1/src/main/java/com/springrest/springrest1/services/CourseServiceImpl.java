package com.springrest.springrest1.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest1.dao.CourseDao;
import com.springrest.springrest1.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {
	
	
	@Autowired
	private CourseDao courseDao;
	//List<Course> list;
	
	public CourseServiceImpl() {
		
//		list=new ArrayList<>();
//		list.add(new Course(145,"Core JAVA","basics of JAva"));
//		list.add(new Course(450,"spring boot","basics of spring"));
	}
	
	//get courses
	@Override
	public List<Course> getCourses(){
		
		return courseDao.findAll();
	}
	
	//get courses by id
	@Override
	public Course getCourse(long courseId) {
		
//		Course c=null;
//		for(Course course:list) {
//			if(course.getId()==courseId) {
//				
//				c=course;
//				break;
//			}
//		}
		return courseDao.getOne(courseId);
	}
	
	@Override
	public Course addCourse(Course course) {
		
		//list.add(course);
		courseDao.save(course);
		return course;
	}
	
	//update course
	@Override
	public Course updateCourse(Course course) {
		
//		list.forEach(e ->{
//			if(e.getId()==course.getId()) {
//				
//				e.setTitle(course.getTitle());
//				e.setDesc(course.getDesc());
//			}
//		});
		courseDao.save(course);
		return course;
	}
	
	//delete course
	@Override
	
	public void deleteCourse(long parseLong) {
		
		//list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
		
		Course entity=courseDao.getOne(parseLong);
		courseDao.delete(entity);
	}

}
