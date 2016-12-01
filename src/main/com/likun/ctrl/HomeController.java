package likun.ctrl;

import likun.mq.ProducerService;
import likun.po.Order;
import likun.po.User;
import likun.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.jms.Destination;
import javax.servlet.http.HttpServletRequest;
import java.io.Serializable;

import static org.springframework.web.bind.annotation.RequestMethod.GET;


/**
 * Created by Administrator on 2016/11/24.
 */
@Controller
public class HomeController {
    @Autowired
    UserService userService;
    @Autowired
    private ProducerService producerService;
    @Autowired
    @Qualifier("queueDestination")
    private Destination destination;
//    MongoTemplate mongoTemplate;
 //  protected RedisTemplate redisTemplate;

    @RequestMapping(value="showHomePage",method=GET)
    public String showHomePage(String username,Model model){

        if (!StringUtils.isEmpty(username)) {
            model.addAttribute("opt", "李锟");
        }
        return "home";
    }

    @RequestMapping(value = "adding",method = RequestMethod.POST)
    public String adding(HttpServletRequest request){
        Order order=new Order();
        order.setId("123456");
        order.setCustomer("likun");
        order.setType("big");
        Order order2=new Order();
        order2.setId("123458");
        order2.setCustomer("wangzhang");
        order2.setType("small");
        Order order3=new Order();
        order3.setId("123459");
        order3.setCustomer("likun");
        order2.setType("small");
 /*       mongoTemplate.save(order);
        mongoTemplate.save(order2);
        mongoTemplate.save(order3);

        System.out.println();
        java.util.List<Order> orders=mongoTemplate.find(Query.query(Criteria.where("client").is("likun")),Order.class);
  */
        return "success";
    }

    @RequestMapping(value = "redisTest",method = RequestMethod.POST)
    public String redisTest(HttpServletRequest request){
        User user=new User();
        user.setName("likun");
        user.setSex("男");
        user.setAddr("河北邯郸");
        user.setAge(1000);
//        redisTemplate.opsForValue().set("001","likun");
  //      String s= (String) redisTemplate.opsForValue().get("001");
 //       redisTemplate.opsForValue().set("001",user);
  //      User users= (User) redisTemplate.opsForValue().get("001");
        return "success";
    }

    @RequestMapping(value = "jmsTest",method = RequestMethod.GET)
    public String jmsTest(HttpServletRequest request){
        for (int i=0; i<2; i++) {
            producerService.sendMessage(destination, "你好，生产者！这是消息：" + (i+1));
        }
        return "success";
    }


}