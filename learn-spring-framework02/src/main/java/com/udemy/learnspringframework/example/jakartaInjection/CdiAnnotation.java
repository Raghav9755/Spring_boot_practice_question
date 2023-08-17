package com.udemy.learnspringframework.example.jakartaInjection;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
//@Component
@Named
class BusinessService
{
  private  DataService dataservice;
    public DataService getDataservice() {
      System.out.println("getter Injection");
        return dataservice;
    }
    //@Autowired
    @Inject
    public void setDataservice(DataService dataservice) {
        System.out.println("Setter Injection");
        this.dataservice = dataservice;
    }
}
//@Component
@Named
class DataService{

}

    @Configuration
    @ComponentScan
    public class CdiAnnotation {
        public static void main (String[] args){
            ApplicationContext context =
                    new AnnotationConfigApplicationContext(CdiAnnotation.class);
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean(BusinessService.class).getDataservice());
        }
    }

