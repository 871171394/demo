package com.demo01;

import com.demo01.bean.UserDO;
import com.demo01.mapper.UserMapper;
import io.swagger.annotations.ApiModelProperty;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    UserMapper userMapper;
    @Test
    void contextLoads() {
        List<UserDO> userDOS = userMapper.selectList(null);
        System.out.println(userDOS);
    }

}
