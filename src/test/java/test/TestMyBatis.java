package test;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.lyc.dao.UserMapper;
import cn.lyc.entity.User;
import cn.lyc.entity.UserExample;

import com.alibaba.fastjson.JSONObject;
  
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})  
  
public class TestMyBatis {  
    
    @Autowired
    private UserMapper um;
  
    @Test
    public void test1(){
    	
    	UserExample example = new UserExample();
		List<User> list = um.selectByExample(example );
		System.out.println(JSONObject.toJSONString(list));
    }
  
}  