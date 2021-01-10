package com.autotest.test.entity;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.io.Serializable;

@Data   //省略无参构造、get、set方法
@Accessors(chain = true)    //链式结构
@EntityScan

public class HiHiDemo implements Serializable {
    private Integer id;
    private String scene_id;
    private String variables;
    //private String demoDesc;

}