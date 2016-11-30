package likun.service;

import likun.po.Order;

/**
 * Created by Administrator on 2016/11/29.
 */
public interface UserService {
    public void addMongoObj(Order order);
    public String sayHello(String s);
}
