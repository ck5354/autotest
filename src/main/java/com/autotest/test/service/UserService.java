package com.autotest.test.service;

import com.autotest.test.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    public UserDao userDao;

    public List getJsonResult(){
        List demos = userDao.getJsonResult();
        return demos;
    }


}
