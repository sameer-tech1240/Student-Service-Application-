package com.student.model;

import java.util.List;

public record Student(
String id ,
String description, List<Course>courses)
{

}
