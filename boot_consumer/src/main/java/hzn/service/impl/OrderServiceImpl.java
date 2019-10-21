package hzn.service.impl;

import beans.UserAddress;
import com.alibaba.dubbo.config.annotation.Reference;
import hzn.service.OrderService;
import org.springframework.stereotype.Service;

import service.UserService;

@Service
public class OrderServiceImpl implements OrderService {
    @Reference(parameters = {"initOrder.timeout", "6000"})
    UserService service;
    @Override
    public UserAddress initOrder(String userId) {
        System.out.println("consumer中的参数为："+userId);
        UserAddress address = service.getUserAddress(userId);
        System.out.println("id为:"+userId+"的用户地址为："+address);
        return address;
    }
}
