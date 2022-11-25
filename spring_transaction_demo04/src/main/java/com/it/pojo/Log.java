package com.it.pojo;

import java.util.Date;

public class Log {
    private Integer id;
    private String log;
    private Date createDate;

    public Log(){

    }

    public Log(String log, Date createDate){
        this.log = log;
        this.createDate = createDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Log{" +
                "id=" + id +
                ", log='" + log + '\'' +
                ", createDate=" + createDate +
                '}';
    }
}
