package com.autotest.test.entity;

import java.io.Serializable;

public class SysResult implements Serializable {
    private static final long serialVersionUID = -7368493786259905794L;
    /**
     * 状态码
     */
    private int state = 1;//1-OK,0-Error
    /**
     * 状态码对应的消息
     */
    private String message = "OK";
    /**
     * 要呈现到客户端的数据
     */
    private Object data;

    public SysResult() {
    }

    public SysResult(String message) {
        this.message = message;
    }

    public SysResult(Object data) {
        this.data = data;
    }

    public SysResult(Throwable e) {
        this.state = 0;
        this.message = e.getMessage();
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    /**
     * 静态方法，用于返回正确数据
     * @param data
     * @return
     */
    public static SysResult ok(Object data){
        return new SysResult(data);
    }

    /**
     * 静态方法，用于返回错误信息
     * @param msg
     * @return
     */
    public static SysResult fail(String msg){
        SysResult result=new SysResult();
        result.setState(0);
        result.setMessage(msg);
        return result;
    }
}
