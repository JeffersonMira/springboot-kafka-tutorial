package net.javaguides.springboot.kafka;

import net.javaguides.springboot.payload.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class JsonKafkaConsumer {
    private static final Logger logger = Logger.getLogger(JsonKafkaConsumer.class.getName());

    @KafkaListener(topics="${spring.kafka.topic.json.name}", groupId = "myGroup")
    public void consume(User user){
        logger.info(String.format("Json message received -> %s", user.toString()));
    }
}
