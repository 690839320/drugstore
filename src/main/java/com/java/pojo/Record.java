package com.java.pojo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
@Data
public class Record {
    private Integer id;

    private String doctorId;

    private String customerId;

    private String busno;

    private Date starTime;

    private Date endTime;

    private BigDecimal invalids;

    private String isopendrug;

    private String isgetmedicine;

}