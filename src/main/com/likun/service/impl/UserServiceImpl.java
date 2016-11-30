package likun.service.impl;

import likun.po.Order;
import likun.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by Administrator on 2016/11/29.
 */
@Service("userServiceImpl")
public class UserServiceImpl implements UserService{


    public void addMongoObj(Order order) {

    }

    public String sayHello(String s) {
        return s;
    }
}
