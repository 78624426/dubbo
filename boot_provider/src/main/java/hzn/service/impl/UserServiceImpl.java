package hzn.service.impl;

import beans.UserAddress;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;


import service.UserService;

import java.util.Arrays;
import java.util.List;
import com.alibaba.dubbo.*;
@Component
@Service//注意，必须是com.alibaba.dubbo
public class UserServiceImpl implements UserService {

    @Override
    public UserAddress getUserAddress(String userId) {
        System.out.println("provider中收到的参数为："+userId);
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {}

        UserAddress a1 = new UserAddress(1,"1","南京","13825444");
        UserAddress a2 = new UserAddress(2,"2","北京","130555000");
        UserAddress a3 = new UserAddress(1,"3","西安","136555555");
        UserAddress a4 = new UserAddress(1,"4","天津","13725555444016");
        List<UserAddress>list = Arrays.asList(a1,a2,a3,a4);
        for(int i = 0;i<list.size();i++){
            if(list.get(i).getUserId().equals(userId)){
                return list.get(i);
            }
        }
        return null;
    }
}
