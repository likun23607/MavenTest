package likun;

import com.caucho.hessian.client.HessianProxyFactory;
import likun.po.Spitter;
import likun.rmi.RmiSpitterService;

import java.net.MalformedURLException;

/**
 * Created by Administrator on 2016/11/30.
 */
public class Test {
    public static void main(String[] args) throws MalformedURLException {
        //Spring Hessian代理Servelet
        String url = "http://localhost:8080/remote/saveSpitter";
        HessianProxyFactory factory = new HessianProxyFactory();
        RmiSpitterService api = (RmiSpitterService) factory.create(RmiSpitterService.class, url);
        Spitter sp=new Spitter();
        sp.setName("likun");
        System.out.println(api.saveSpitter(sp));
        // System.out.println(api.sayHello("asasa"));
    }
}
