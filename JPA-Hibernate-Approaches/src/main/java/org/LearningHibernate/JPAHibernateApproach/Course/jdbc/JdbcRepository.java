package org.LearningHibernate.JPAHibernateApproach.Course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcRepository {
    @Autowired
    private JdbcTemplate springJdbcTemplate;
    private static String INSERT_QUERY=
    """
    insert into course (id,EmployeeName,EmployeeSalary)
    values(?,?,?)
    """;
    private static String DELETE_QUERY=
            """
            delete from course
            where id =?
                    
            """;
    private static String SELECT_QUERY=
            """
            select * from course
            where id =?
            """;

    public void insert(Course course){
        springJdbcTemplate.update(INSERT_QUERY,course.getId(),course.getEmployeeName(),course.getEmployeeSalary());
    }
    public void deleteById(long id){
        springJdbcTemplate.update(DELETE_QUERY,id);
    }
    public Course findById(long id){
       return springJdbcTemplate.queryForObject(SELECT_QUERY,new BeanPropertyRowMapper<>(Course.class),id);
    }

}
