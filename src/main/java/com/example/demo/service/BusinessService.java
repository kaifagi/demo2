package com.example.demo.service;

import com.example.demo.pojo.Business;

import java.util.List;

public interface BusinessService {
    List<Business> getBusinessList();

    void add(Business business);

    void deleteBatch(Integer[] ids);

    Business getBusinessById(Integer id);

    void deleteBusinessById(Integer id);

    void update(Business business);
}
