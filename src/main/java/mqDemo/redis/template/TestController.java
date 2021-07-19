package mqDemo.redis.template;

import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author GuanTao
 * @program: mq-demo
 * @description: 发布消息入口
 * @create: 2021-07-16 18:06
 **/
@RestController
@Api(tags = "测试redis消息")
public class TestController {
    /**
     * Redis 消息发送器
     */
    @Autowired
    private MessageSender messageSender;

    /**
    * @description: 触发消息发送接口
    * @Param: [sessionId]
    * @return java.lang.String
    * @author: GuanTao
    * @date 2021/7/19 3:15 下午
    */
    @GetMapping(value = "/sendMsg")
    public String sendRedisMsg(String sessionId) {
        MessageInfo messageInfo = new MessageInfo(sessionId, "转发请求");
        messageSender.sendMessage(messageInfo);
        return "The message of Redis sent successfully";
    }

}
