package com.xiaocaihua.kmoo.service.impl;


import com.xiaocaihua.kmoo.dao.IUserDao;
import com.xiaocaihua.kmoo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserDao dao;

    @Override
    public Map<String, Object> getUser(String userId) {
        return dao.getUser(userId);
    }
}
