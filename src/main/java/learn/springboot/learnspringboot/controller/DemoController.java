package learn.springboot.learnspringboot.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import learn.springboot.learnspringboot.objects.Course;

@RestController
public class DemoController {

	@GetMapping(path = "api/v1/getAllCourses")
	public List<Course> retreiveAllCourses() {
		return Arrays.asList(
				new Course(1,"Java","Oracle"),
				new Course(2,".NET","MS"),
				new Course(3,"Angular","Google"),
				new Course(1,"Java","Oracle"),
				new Course(2,".NET","MS"),
				new Course(3,"Angular","Google"),
				new Course(4,"TypeScript","MS")
				);
	}
	
}
