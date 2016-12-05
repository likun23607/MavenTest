package likun.websocket;

import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;

/**
 * Created by Administrator on 2016/12/2.
 */
public class LogWebSocketHandler {
    private SimpMessagingTemplate template;

            public LogWebSocketHandler(SimpMessagingTemplate template) {
                this.template = template;
                System.out.println("初始化 handler");
             }

        protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
                 String text = message.getPayload(); // 获取提交过来的消息
                System.out.println("handMessage:" + text);
                 // template.convertAndSend("/topic/getLog", text); // 这里用于广播
                 session.sendMessage(message);
             }
}
