package com.example.StudentCrud.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.StudentCrud.entities.Courses;

public interface CourseDao extends JpaRepository<Courses,Long> {

}

