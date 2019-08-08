package com.java.pojo;

import lombok.Data;

import java.math.BigDecimal;
@Data
public class Shopping {

    private Integer id;

    private String name;

    private Integer count;

    private BigDecimal price;

    private String photo;

    private String customerSerial;

    private int status;
}
