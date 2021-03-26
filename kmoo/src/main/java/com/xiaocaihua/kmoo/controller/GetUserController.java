package com.xiaocaihua.kmoo.controller;

import com.xiaocaihua.kmoo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class GetUserController {
    @Autowired
    private IUserService service;

    @RequestMapping("/user/getUser/{userId}")
    public Map<String, Object> getUserMsg(@PathVariable String userId) {
        System.out.println(userId);
        return service.getUser(userId);
    }
}
