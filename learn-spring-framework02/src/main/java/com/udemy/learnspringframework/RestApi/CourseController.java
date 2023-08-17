package com.udemy.learnspringframework.RestApi;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Arrays;
@RestController
public class CourseController {
    @RequestMapping("/Courses")
    public List<Course> retrieveAllCourses(){
        return Arrays.asList(
                new Course(1,"Learn React","By Udemy"),
                new Course(2,"Learn DataScience","By Udemy"),
                new Course(3,"Learn Advanced Java","By Udemy")
                );
    }
}
