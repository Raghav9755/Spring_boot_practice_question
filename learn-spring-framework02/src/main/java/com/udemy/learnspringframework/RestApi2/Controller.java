package com.udemy.learnspringframework.RestApi2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
@RestController
public class Controller {
    @RequestMapping("/Details")
    public List<Data> retrieveAllData() {

        return Arrays.asList(
                new Data(1, "raghav", "ra@gmail.com", "cs"),
                new Data(2, "yash", "ya@gmail.com", "cs"),
                new Data(3, "rajat", "raj@gmail.com", "cs"),
                new Data(4, "mohit", "mo@gmail.com", "cs"),
                new Data(5, "sawan", "sa@gmail.com", "cs"),
                new Data(6, "vasu", "va@gmail.com", "cs"),
                new Data(7, "deepak", "de@gmail.com", "cs"),
                new Data(8, "harsh", "ha@gmail.com", "cs"),
                new Data(9, "naman", "na@gmail.com", "cs"),
                new Data(10, "rohit", "rohit@gmail.com", "cs")
        );
    }
    @GetMapping("/Details/Employee")
    public List<Data> retrieveAll1Data() {
        return Arrays.asList(
                new Data(1, "11", "11@gmail.com", "it"),
                new Data(2, "22", "22@gmail.com", "it"),
                new Data(3, "33", "33@gmail.com", "it"),
                new Data(4, "44", "44@gmail.com", "it"),
                new Data(5, "55", "55@gmail.com", "it"),
                new Data(6, "66", "66@gmail.com", "it")
        );

    }
    @GetMapping("/Details/Employee/empNo")
    public int pattern(){
        return pattern().gr;
    }
}
