package com.mr.entity;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

import java.util.Date;


public class Student {
    private Integer tid;
    private String tname;
    private Integer tage;
    private Date tdate;


    @Override
    public String toString() {
        return "Student{" +
                "tid=" + tid +
                ", tname='" + tname + '\'' +
                ", tage=" + tage +
                ", tdate=" + tdate +
                '}';
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public Integer getTage() {
        return tage;
    }

    public void setTage(Integer tage) {
        this.tage = tage;
    }

    public Date getTdate() {
        return tdate;
    }

    public void setTdate(Date tdate) {
        this.tdate = tdate;
    }
}
