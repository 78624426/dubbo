package hzn.controller;

import beans.UserAddress;
import hzn.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class OrderController {
    @Autowired
    OrderService service;

    @ResponseBody
    @RequestMapping("/initOrder")
    public UserAddress initOrder(String userId){
        return service.initOrder(userId);
    }

}
