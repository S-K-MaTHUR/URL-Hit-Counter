package com.geekster.URLHitCounter.service;

import com.geekster.URLHitCounter.model.User;
import com.geekster.URLHitCounter.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UrlHitService {

    @Autowired
    UserDao userDao;
    public User getCount(){
        return userDao.getUrlHitCount();
    }

    public User getCountByName(String username)
    {
        return userDao.getUrlHitCountByName(username);
    }
}
