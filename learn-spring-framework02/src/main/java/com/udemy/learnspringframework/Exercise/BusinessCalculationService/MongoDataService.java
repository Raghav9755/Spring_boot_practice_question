package com.udemy.learnspringframework.Exercise.BusinessCalculationService;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

//@Component
@Repository
@Primary
public class MongoDataService implements DataService{
    @Override
    public int[] retrieveData() {
        return new int[]{11,22,33,44,55,66};
    }
}
