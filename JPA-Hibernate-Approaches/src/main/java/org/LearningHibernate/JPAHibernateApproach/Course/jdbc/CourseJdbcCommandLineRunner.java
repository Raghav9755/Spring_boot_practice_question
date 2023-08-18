package org.LearningHibernate.JPAHibernateApproach.Course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {
    @Autowired
    private JdbcRepository repository;
    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1,"Shyam","95400"));
        repository.insert(new Course(2,"Sawan","57400"));
        repository.insert(new Course(3,"Mohit","81500"));
        repository.insert(new Course(4,"Kartik","91400"));
        repository.insert(new Course(5,"Arpit","45060"));
        repository.insert(new Course(6,"Yash","75230"));
        repository.insert(new Course(7,"vasu","48756"));
        repository.deleteById(3);
        System.out.println(repository.findById(6));
        System.out.println(repository.findById(5));

    }
}
