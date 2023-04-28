package com.geekster.URLHitCounter.controller;

import com.geekster.URLHitCounter.model.User;
import com.geekster.URLHitCounter.service.UrlHitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/visitor-count-app")
public class UrlHitController {

    @Autowired
    public UrlHitService urlHitService;

    @GetMapping(value = "/count")
    public User getHitCount(){
        return urlHitService.getCount();
    }
    @GetMapping(value = "/username/{username}/count")
    public User getUserHitCountByName(@PathVariable String username)
    {
        return urlHitService.getCountByName(username);
    }

}
