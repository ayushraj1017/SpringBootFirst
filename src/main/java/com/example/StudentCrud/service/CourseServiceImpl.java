package com.example.StudentCrud.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.StudentCrud.dao.CourseDao;
import com.example.StudentCrud.entities.Courses;


@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseDao courseDao;
	
//	List<Courses> list;
	
	public CourseServiceImpl() {
//		list=new ArrayList<>();
//		list.add(new Courses(145,"java","java tutorial"));
//		list.add(new Courses(146,"javascript","java tutorial"));
	}

	@Override
	public List<Courses> getCourses() {
		
		return courseDao.findAll();
	}

	
	@Override
	public Courses getCourse(long courseId) {
		Courses c=null;
		for(Courses course:courseDao.findAll()) {
			if(course.getId()==courseId) {
				c=course;
				break;
			}
		}
		return c;
		
	}
	
	@Override
	public Courses addCourses(Courses courses) {
//		list.add(courses);
		courseDao.save(courses);
		return courses;
	}

	@Override
	public Courses updateCourses(Courses courses) {
//		list.forEach(e->{
//			if(e.getId()==courses.getId()) {
//				e.setTitle(courses.getTitle());
//				e.setDescription(courses.getDescription());
//			}
//		});
		courseDao.save(courses);
		return courses;
	}

	@Override
	public void deleteCourses(String courseId) {
		
	
		
	}

	
	

}
