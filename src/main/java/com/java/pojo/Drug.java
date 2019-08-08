package com.java.pojo;

import lombok.Data;

import java.math.BigDecimal;
@Data
public class Drug {
    private Integer id;

    private String name;

    private BigDecimal price;

    private Integer inventory;

    private String photo;

}