package com.autotest.test.dao;



import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface Api {
    //@Select("select * from scene__comp_variable")
    List getJsonResult();

}
