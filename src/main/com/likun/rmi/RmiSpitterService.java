package likun.rmi;

import likun.po.Spitter;

/**
 * Created by Administrator on 2016/11/30.
 */
public interface RmiSpitterService {
    public String saveSpitter(Spitter spitter);
    public String sayHello(String s);
    public Spitter getSp();
}
