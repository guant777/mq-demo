package mqDemo.redis.template;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

/**
 * @author GuanTao
 * @program: mq-demo
 * @description: 消息发送器
 * @create: 2021-07-16 16:55
 **/
@Slf4j
@Service
public class MessageSender {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    /**
     * 发布消息（消息提供者）
     * @param messageInfo 消息实体
     */
    public void sendMessage(MessageInfo messageInfo){
        String msg = JSON.toJSONString(messageInfo);
        log.info("转发消息 : {}", msg);
        // chat：指定消息频道
        stringRedisTemplate.convertAndSend("chat",msg);
    }


}
