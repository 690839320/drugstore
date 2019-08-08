package com.java.pojo;

import lombok.Data;

@Data
public class Interrogation {
    private Integer itrgtId;//问诊主键

    private String itrgtTeacherId;//问诊医师编号

    private String itrgtUserId;//问诊用户编号

    private String itrgtStartTime;//问诊起始时间

    private String itrgtEndTime;//问诊结束时间

    private Integer itrgtTotalPrice;//问诊总价

}
