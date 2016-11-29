package likun.service;

import likun.po.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Administrator on 2016/11/29.
 */
public interface OrderRepository extends MongoRepository<Order,String>{

}
