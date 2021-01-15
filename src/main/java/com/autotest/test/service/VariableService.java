package com.autotest.test.service;

import com.autotest.test.dao.ScenarioVariable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VariableService {
    @Autowired
    public ScenarioVariable scenarioVariable;

    public List getJsonResult(){
        List demos = scenarioVariable.getJsonResult();
        return demos;
    }


}
