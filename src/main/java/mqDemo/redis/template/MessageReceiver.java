package mqDemo.redis.template;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author GuanTao
 * @program: mq-demo
 * @description: 消息接收器
 * @create: 2021-07-16 16:56
 **/
@Slf4j
@Component
public class MessageReceiver {
    /**
     * 消息接收方法
     * @param msg 消息
     */
    public void receiveMessage(String msg){
        log.info("收到一条消息：{}", msg);
        Map<String, String> map = JSON.parseObject(msg, Map.class);
        String sessionId = map.get("sessionId");
        String message = map.get("message");
        log.info("sessionId : {}", sessionId);
        log.info("message : {}", message);
    }

}
