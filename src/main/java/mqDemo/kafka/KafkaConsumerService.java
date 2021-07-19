package mqDemo.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/**
 * @author gt
 */
@Service
public class KafkaConsumerService {

    @KafkaListener(topics = {"drasp_core_rent_unit"},groupId = "group1", containerFactory="kafkaListenerContainerFactory")
    public void kafkaListener(String message){
        System.out.println("消费："+message);
    }

}