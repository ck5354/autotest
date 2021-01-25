package com.autotest.test.service;

import com.autotest.test.dao.VariableMapper;
import com.autotest.test.entity.VariableEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VariableService {
    @Autowired
    public VariableMapper variableMapper;

    public List getJsonResult(Integer id){
        List demos = variableMapper.getJsonResult(id);
        return demos;
    }

    public int getInsertResult(){
        return variableMapper.getInsert();
    }

    public int getDeleteResult(){
        return variableMapper.getDelete();
    }


}
