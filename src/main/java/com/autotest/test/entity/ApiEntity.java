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
    private String describer;
    private String scheme;
    private String url;
    private String requestMethod;
    private String contentType;
    private String header;
    private String param;
    private String body;
    private Date createTime;

}
