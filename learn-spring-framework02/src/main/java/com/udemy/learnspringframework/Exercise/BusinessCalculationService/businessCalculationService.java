package com.udemy.learnspringframework.Exercise.BusinessCalculationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
//@Component
@Service
public class businessCalculationService {
    private DataService dataService;
    @Autowired
    public businessCalculationService(DataService dataService) {
        super();
        this.dataService = dataService;
    }

    public int findMax(){
        return Arrays.stream(dataService.retrieveData()).max().orElse(0);
    }

}
