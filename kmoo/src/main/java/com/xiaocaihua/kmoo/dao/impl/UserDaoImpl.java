package com.xiaocaihua.kmoo.dao.impl;


import com.xiaocaihua.kmoo.dao.IUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;

@Service
public class UserDaoImpl implements IUserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Map<String, Object> getUser(String userId) {
        List<Map<String, Object>> maps = jdbcTemplate.queryForList("select * from t_user_info where USER_ID=?", userId);
        for (Map<String, Object> map : maps
        ) {
            System.out.println(map);
        }
        return maps.get(0);
    }
}
