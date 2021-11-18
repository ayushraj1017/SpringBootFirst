package com.example.StudentCrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.StudentCrud.entities.Courses;
import com.example.StudentCrud.service.CourseService;

@RestController
public class MyController {
	
	@Autowired
	private CourseService courseService;
	
	
	 @GetMapping("/hello") public String sayHi() { return "hello my DJ yes"; }
	 
	
	// get all courses
	
	@GetMapping("/courses")
	public List<Courses> getCourses()
	{
		return this.courseService.getCourses();
		
	}
	
	@GetMapping("/courses/{courseId}")
	public Courses getCourse(@PathVariable String courseId)
	{
		return this.courseService.getCourse(Long.parseLong(courseId));
		
	}
	
	@PostMapping("/courses")
	public Courses addCourses(@RequestBody Courses courses) {
		return this.courseService.addCourses(courses);
	}
	
	
	
	@PutMapping("/courses")
	public Courses updateCourses(@RequestBody Courses courses) {
		return this.courseService.updateCourses(courses);
	}
	
	@DeleteMapping("/courses/{courseId}")
	public ResponseEntity<HttpStatus> deleteCourses(@RequestBody String courseId) {
		try {
			this.courseService.deleteCourses(Long.parseLong(courseId));
			return new ResponseEntity<>(HttpStatus.OK);
		} catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
			
	}

}
