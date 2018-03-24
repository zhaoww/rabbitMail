package com.zww;

import com.zww.service.UserRegisterService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by zhaoww on 2018/3/7.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRegisterServiceTest {

    @Autowired
    public UserRegisterService userRegisterService;

    @Test
    public void testUserRegisterFanout(){
        userRegisterService.userRegisterFanout();
    }

    @Test
    public void testUserRegisterDirect(){
        userRegisterService.userRegisterDirect();
    }

    @Test
    public void testUserRegisterTopic(){
        userRegisterService.userRegisterTopic();
    }
}
