package likun.ctrl;

import likun.po.Order;
import likun.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

import static org.springframework.web.bind.annotation.RequestMethod.GET;


/**
 * Created by Administrator on 2016/11/24.
 */
@Controller
public class HomeController {
    @Autowired
    UserService userService;
    @RequestMapping(value="showHomePage",method=GET)
    public String showHomePage( String username,Model model){

        if (!StringUtils.isEmpty(username)) {
            model.addAttribute("opt", "李锟");
        }
        return "home";
    }

    @RequestMapping(value = "adding",method = RequestMethod.POST)
    public String adding(HttpServletRequest request){
        Order order=new Order();
   //     userService.addMongoObj(order);
        System.out.println();
        return "sucess";
    }



}