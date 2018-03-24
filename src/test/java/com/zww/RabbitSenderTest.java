package com.zww;

import com.zww.bll.FanoutSender;
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
public class RabbitSenderTest {

    @Autowired
    public FanoutSender sender;

    @Test
    public void testSender(){
        sender.send();
    }
}
