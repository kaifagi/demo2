package com.example.demo.dao;

import com.example.demo.pojo.Business;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BusinessDao {
    List<Business> getBusinessList();

    void add(Business business);

    void deleteBatch(@Param("ids") Integer[] ids);

    Business getBusinessById(Integer id);

    void deleteBusinessById(Integer id);

    void update(Business business);
}
