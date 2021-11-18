package com.example.StudentCrud.service;

import java.util.List;

import com.example.StudentCrud.entities.Courses;

public interface CourseService {
	public List<Courses> getCourses();

	public Courses getCourse(long courseId);

	public Courses addCourses(Courses courses);

	public Courses updateCourses(Courses courses);

	public void deleteCourses(long courseId);

}
