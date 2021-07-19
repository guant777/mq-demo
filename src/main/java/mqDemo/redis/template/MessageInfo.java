package mqDemo.redis.template;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author GuanTao
 * @program: mq-demo
 * @description: 存放消息实体
 * @create: 2021-07-16 16:10
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MessageInfo implements Serializable {
    private static final long serialVersionUID = -1011233794643668350L;
    private String sessionId;
    private String message;
}
