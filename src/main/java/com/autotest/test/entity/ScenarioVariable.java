package com.autotest.test.entity;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.io.Serializable;

@Data
@Accessors(chain = true)    //链式结构
@EntityScan

public class ScenarioVariable implements Serializable {
    private Integer id;
    private Integer scenario_id;
    private String variables;

}