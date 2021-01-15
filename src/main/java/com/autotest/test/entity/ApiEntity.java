package com.autotest.test.entity;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.io.Serializable;
import java.util.Date;

@Data
@Accessors(chain = true)    //链式结构
@EntityScan

public class ApiEntity implements Serializable {
    private Integer id;
    private Integer app;
    private String name;
    private String url;
    private String header;
    private String request_method;
    private String param;
    private String content_Type;
    private String describer;
    private Date create_time;

}