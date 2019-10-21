package service.impl;

import beans.UserAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import service.OrderService;
import service.UserService;

@Service
public class OrderServiceImpl implements OrderService{
    @Autowired
    UserService service;
    @Override
    public UserAddress initOrder(String userId) {
        UserAddress address = service.getUserAddress(userId);
        System.out.println("id为:"+userId+"的用户地址为："+address);
        return address;
    }
}
