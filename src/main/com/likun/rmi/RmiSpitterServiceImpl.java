package likun.rmi;

import likun.po.Spitter;

/**
 * Created by Administrator on 2016/11/30.
 */
public class RmiSpitterServiceImpl implements RmiSpitterService {
    public String saveSpitter(Spitter spitter) {
        System.out.println(spitter.getName());
        return "true";
    }
    public String sayHello(String s) {
        return s;
    }
}
