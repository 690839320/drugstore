package com.java.pojo;

import lombok.Data;

import java.util.List;

@Data
public class cus_doc {
    private List<Customer> customerIds;
    private List<Doctor> doctorIds;
}
