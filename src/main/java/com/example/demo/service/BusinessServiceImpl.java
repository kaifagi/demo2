package com.example.demo.service;

import com.example.demo.dao.BusinessDao;
import com.example.demo.pojo.Business;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusinessServiceImpl implements BusinessService {

    @Autowired
    private BusinessDao businessDao;

    @Override
    public List<Business> getBusinessList() {
        return businessDao.getBusinessList();
    }

    @Override
    public void add(Business business) {
        businessDao.add(business);
    }

    @Override
    public void deleteBatch(Integer[] ids) {
        businessDao.deleteBatch(ids);
    }

    @Override
    public Business getBusinessById(Integer id) {
        return businessDao.getBusinessById(id);
    }

    @Override
    public void deleteBusinessById(Integer id) {
        businessDao.deleteBusinessById(id);
    }

    @Override
    public void update(Business business) {
        businessDao.update(business);
    }
}
