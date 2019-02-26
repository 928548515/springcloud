package com.atguigu.springcloud;

import com.alibaba.fastjson.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MicroservicecloudConsumerDept80ApplicationTests {

    @Test
    public void contextLoads() {
        Map<String, Object> map = new HashMap<>();
        map.put("name","pengyu");
        map.put("password","123456");
        System.out.println(JSONObject.toJSONString(map));
    }

}

