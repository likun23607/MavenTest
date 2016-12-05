package likun.rmi;

import likun.po.Spitter;

/**
 * Created by Administrator on 2016/11/30.
 */
public class RmiSpitterServiceImpl implements RmiSpitterService {
    public String saveSpitter(Spitter spitter) {
        System.out.println(spitter.getName());
        return "true1111";
    }
    public String sayHello(String s) {
        return s;
    }

    public Spitter getSp() {
        Spitter s= new Spitter();
        s.setName("likun1111");
        return s;
    }
}
