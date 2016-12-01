package likun.mq;

import javax.jms.Destination;

/**
 * Created by Administrator on 2016/12/1.
 */
public interface ProducerService {
    public void sendMessage(Destination destination, final String message);
}
